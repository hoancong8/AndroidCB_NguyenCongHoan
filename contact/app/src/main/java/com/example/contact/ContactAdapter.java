package com.example.contact;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Mycontact> {
    Context context;
    int layout;
    ArrayList<Mycontact> mycontactArrayList;
    public ContactAdapter(@NonNull Context context, int resource, ArrayList<Mycontact> mycontactArrayList){
        super(context,resource);
        this.context = context;
        this.layout = resource;
        this.mycontactArrayList = mycontactArrayList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currenView = convertView;
        if (currenView == null){
            currenView = LayoutInflater.from(context).inflate(layout,parent, false);
        }
        Mycontact mycontact = getItem(position);
        RelativeLayout relativeLayout = currenView.findViewById(R.id.main);
        ImageView imgcontact = currenView.findViewById(R.id.imageView);
        TextView txtPhone = currenView.findViewById(R.id.txtPhone);
        TextView txtName = currenView.findViewById(R.id.txtName);
        Button btnCall = currenView.findViewById(R.id.btncall);
        Button btnSms = currenView.findViewById(R.id.btnsms);

        final int currentPosition = position;
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        relativeLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                PopupMenu popupMenu = new PopupMenu(context, v);
                MenuInflater inflater = popupMenu.getMenuInflater();
                inflater.inflate(R.menu.menu, popupMenu.getMenu());

                // Xử lý khi chọn các item trong menu
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.action_settings) {
                            Toast.makeText(context, "Clicked item1", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (item.getItemId() == R.id.action_more) {
                            Toast.makeText(context, "Clicked item2", Toast.LENGTH_SHORT).show();

                            mycontactArrayList.remove(currentPosition);
                            notifyDataSetChanged();
//                            remove(mycontact);
//                            notifyDataSetChanged();
                            return true;
                        } else {
                            return false;
                        }

                    }
                });

                // Hiển thị menu
                popupMenu.show();
                return true;
            }
        });

        // data
        txtName.setText(mycontact.getName() );
        txtPhone.setText(mycontact.getPhone());
        // xl sk btn
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcall = new Intent(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:"+mycontact.getPhone()));
                context.startActivity(intentcall);
            }
        });
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsms = new Intent(Intent.ACTION_SENDTO);
                intentsms.setData(Uri.parse("smsto:"+mycontact.getPhone()));
                intentsms.putExtra("sms_body", "hey, you stupid f***");
                context.startActivity(intentsms);
            }
        });
        assert mycontact != null;
        imgcontact.setImageResource(mycontact.getImageId());
        return currenView;
    }

    @Override
    public int getCount() {
        return mycontactArrayList.size();
    }

    @Nullable
    @Override
    public Mycontact getItem(int position) {
        return mycontactArrayList.get(position);
    }
}
