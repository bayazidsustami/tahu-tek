package com.example.ryan.bottomnavigation.admin.Bahans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ryan.bottomnavigation.R;

import java.util.List;

public class RecyclerViewAdapterBahan extends RecyclerView.Adapter<RecyclerViewAdapterBahan.MyViewHolder>{

    Context mContext;
    List<Bahan> mBahan;

    public RecyclerViewAdapterBahan(Context mContext, List<Bahan> mBahan){
        this.mContext = mContext;
        this.mBahan = mBahan;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_bahan, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder, int position) {

    holder.iv_bahan.setImageResource(mBahan.get(position).getFotoBahan());
    holder.tv_nama.setText(mBahan.get(position).getNamaBahan());
    holder.tv_ket.setText(mBahan.get(position).getKetBahan());
    holder.tv_harga.setText(mBahan.get(position).getHargaBahan());

    }

    @Override
    public int getItemCount() {
        return mBahan.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_bahan;
        private TextView tv_nama;
        private TextView tv_ket;
        private TextView tv_harga;

        public MyViewHolder(View itemView){
            super(itemView);

            iv_bahan = (ImageView)itemView.findViewById(R.id.image_bahan);
            tv_nama = (TextView) itemView.findViewById(R.id.tv_namabahan);
            tv_ket = (TextView) itemView.findViewById(R.id.tv_ketbahan);
            tv_harga = (TextView) itemView.findViewById(R.id.tv_hargabahan);

        }
    }

}
