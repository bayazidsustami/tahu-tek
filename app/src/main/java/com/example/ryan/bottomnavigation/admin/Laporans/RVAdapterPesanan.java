package com.example.ryan.bottomnavigation.admin.Laporans;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ryan.bottomnavigation.R;

import java.util.List;

public class RVAdapterPesanan extends RecyclerView.Adapter<RVAdapterPesanan.mViewHolder> {

    Context pesananContext;
    List<Pesanan> mPesanan;

    public RVAdapterPesanan(Context pesananContext, List<Pesanan> mPesanan){
        this.pesananContext = pesananContext;
        this.mPesanan = mPesanan;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v;
        v = LayoutInflater.from(pesananContext).inflate(R.layout.item_pesanan, parent, false);
        mViewHolder viewHolder = new mViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(mViewHolder mViewHolder, int position) {

        mViewHolder.img_user.setImageResource(mPesanan.get(position).getFoto());
        mViewHolder.tv_name.setText(mPesanan.get(position).getNama());
        mViewHolder.tv_harga.setText(mPesanan.get(position).getHarga());
        mViewHolder.tv_waktu.setText(mPesanan.get(position).getWaktu());

    }

    @Override
    public int getItemCount() {
        return mPesanan.size();
    }

    public static class mViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_user;
        private TextView tv_name, tv_harga, tv_waktu;

        public mViewHolder(View itemView){
            super(itemView);

            img_user = (ImageView) itemView.findViewById(R.id.img_user);
            tv_name = (TextView) itemView.findViewById(R.id.tv_namauser);
            tv_harga = (TextView) itemView.findViewById(R.id.tv_totalpesanan);
            tv_waktu = (TextView) itemView.findViewById(R.id.tv_waktupesanan);

        }
    }

}
