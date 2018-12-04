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

public class RVAdapterRiwayat extends RecyclerView.Adapter<RVAdapterRiwayat.myViewHolder>{

    Context riwayatContext;
    List<Riwayat> mRiwayat;

    public RVAdapterRiwayat(Context riwayatContext, List<Riwayat> mRiwayat){
        this.riwayatContext = riwayatContext;
        this.mRiwayat = mRiwayat;
    }

    @Override
    public RVAdapterRiwayat.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v;
        v = LayoutInflater.from(riwayatContext).inflate(R.layout.item_riwayat, parent, false);
        RVAdapterRiwayat.myViewHolder viewHolder = new RVAdapterRiwayat.myViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RVAdapterRiwayat.myViewHolder myViewHolder, final int position) {

        myViewHolder.img_user.setImageResource(mRiwayat.get(position).getFoto());
        myViewHolder.tv_name.setText(mRiwayat.get(position).getNama());
        myViewHolder.tv_harga.setText(mRiwayat.get(position).getHarga());
        myViewHolder.tv_waktu.setText(mRiwayat.get(position).getWaktu());
        myViewHolder.tv_konfirm.setText(mRiwayat.get(position).getKonfirm());

    }

    @Override
    public int getItemCount() {
        return mRiwayat.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_user;
        private TextView tv_name, tv_harga, tv_waktu, tv_konfirm;

        public myViewHolder(View itemView){
            super(itemView);

            img_user = (ImageView) itemView.findViewById(R.id.img_user);
            tv_name = (TextView) itemView.findViewById(R.id.tv_namauser);
            tv_harga = (TextView) itemView.findViewById(R.id.tv_totalriwayat);
            tv_waktu = (TextView) itemView.findViewById(R.id.tv_wakturiwayat);
            tv_konfirm = (TextView) itemView.findViewById(R.id.tv_konfirmriwayat);

        }
    }

}
