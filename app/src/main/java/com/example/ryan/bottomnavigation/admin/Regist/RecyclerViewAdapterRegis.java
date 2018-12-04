package com.example.ryan.bottomnavigation.admin.Regist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ryan.bottomnavigation.R;

import java.util.List;

public class RecyclerViewAdapterRegis extends RecyclerView.Adapter<RecyclerViewAdapterRegis.nViewHolder>{

    Context nContext;
    List<Regis> nRegis;

    public RecyclerViewAdapterRegis(Context nContext, List<Regis> nRegis){
        this.nContext = nContext;
        this.nRegis = nRegis;
    }

    @Override
    public nViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(nContext).inflate(R.layout.item_regis, parent, false);
        nViewHolder vHolder = new nViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder (RecyclerViewAdapterRegis.nViewHolder holder, int position) {

        holder.iv_user.setImageResource(nRegis.get(position).getFotoUser());
        holder.tv_nama.setText(nRegis.get(position).getNamaUser());

    }

    @Override
    public int getItemCount() {
        return nRegis.size();
    }

    public static class nViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_user;
        private TextView tv_nama;

        public nViewHolder(View itemView){
            super(itemView);

            iv_user = (ImageView)itemView.findViewById(R.id.image_user);
            tv_nama = (TextView) itemView.findViewById(R.id.tv_namauser);
        }
    }

}
