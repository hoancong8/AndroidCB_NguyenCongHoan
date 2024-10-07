package com.example.btvn;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHopder> {
    private List<String> item;
    private InterfaceOnClick.iOnClickItem1 onClickItem1;

    public Adapter(List<String> item, InterfaceOnClick.iOnClickItem1 onClickItem1) {
        this.item = item;
        this.onClickItem1 = onClickItem1;
    }

    public Adapter(List<String> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public Adapter.ViewHopder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist1,parent,false);
        return new ViewHopder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHopder holder, int position) {
        holder.textView.setText(item.get(position));
        holder.linearLayout.setOnClickListener(v -> {
            onClickItem1.iOnClickItem1(item.get(position));
//            Log.d("iji","ygy");
        });
    }

    @Override
    public int getItemCount() {
        return  item.size();
    }

    public class ViewHopder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;
        private LinearLayout linearLayout;
        public ViewHopder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
            imageView  = itemView.findViewById(R.id.img);
            linearLayout  = itemView.findViewById(R.id.linearlayout);
        }
    }

}
