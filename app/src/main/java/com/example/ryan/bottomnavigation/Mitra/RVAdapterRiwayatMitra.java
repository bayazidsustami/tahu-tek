package com.example.ryan.bottomnavigation.Mitra;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ryan.bottomnavigation.R;

import java.util.List;

public class RVAdapterRiwayatMitra extends RecyclerView.Adapter<RVAdapterRiwayatMitra.mViewHolder> {

    Context riwayatContext;
    List<RiwayatMitra> mRiwayat;

    public RVAdapterRiwayatMitra(Context riwayatContext, List<RiwayatMitra> mRiwayat){
        this.riwayatContext = riwayatContext;
        this.mRiwayat = mRiwayat;
    }

    @Override
    public RVAdapterRiwayatMitra.mViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v;
        v = LayoutInflater.from(riwayatContext).inflate(R.layout.item_riwayat_mitra, parent, false);
        RVAdapterRiwayatMitra.mViewHolder viewHolder = new RVAdapterRiwayatMitra.mViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RVAdapterRiwayatMitra.mViewHolder mViewHolder, int position) {

        mViewHolder.img_user.setImageResource(mRiwayat.get(position).getFoto());
        mViewHolder.tv_harga.setText(mRiwayat.get(position).getHarga());
        mViewHolder.tv_waktu.setText(mRiwayat.get(position).getWaktu());
        mViewHolder.tv_konfirm.setText(mRiwayat.get(position).getKonfirm());

    }

    @Override
    public int getItemCount() {
        return mRiwayat.size();
    }

    public static class mViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_user;
        private TextView tv_harga, tv_waktu, tv_konfirm ;

        public mViewHolder(View itemView){
            super(itemView);

            img_user = (ImageView) itemView.findViewById(R.id.img_usermitra);
            tv_harga = (TextView) itemView.findViewById(R.id.tv_hargariwayatmitra);
            tv_waktu = (TextView) itemView.findViewById(R.id.tv_wakturiwayatmitra);
            tv_konfirm = (TextView) itemView.findViewById(R.id.tv_konfirmasiriwayatmita);

        }
    }

}
