package com.example.btvn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {
    private List<ListItem> list;
    private InterfaceOnClick.iOnClickItem2 onClickItem2;

    public Adapter2(List<ListItem> list, InterfaceOnClick.iOnClickItem2 onClickItem2) {
        this.list = list;
        this.onClickItem2 = onClickItem2;
    }

    @NonNull
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.ViewHolder holder, int position) {
        String ten = list.get(position).getTen();
        holder.textView.setText(ten);
        String noiDung = list.get(position).getNoiDung();
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickItem2.iOnClickItem2(ten,noiDung);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;
        private LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
            imageView  = itemView.findViewById(R.id.img);
            linearLayout  = itemView.findViewById(R.id.linearlayout);
        }
    }
}
