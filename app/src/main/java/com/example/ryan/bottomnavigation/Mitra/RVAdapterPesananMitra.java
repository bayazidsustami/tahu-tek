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

public class RVAdapterPesananMitra extends RecyclerView.Adapter<RVAdapterPesananMitra.mViewHolder> {

    Context pesananContext;
    List<PesananMitra> mPesanan;

    public RVAdapterPesananMitra(Context pesananContext, List<PesananMitra> mPesanan){
        this.pesananContext = pesananContext;
        this.mPesanan = mPesanan;
    }

    @Override
    public RVAdapterPesananMitra.mViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v;
        v = LayoutInflater.from(pesananContext).inflate(R.layout.item_pesanan_mitra, parent, false);
        RVAdapterPesananMitra.mViewHolder viewHolder = new RVAdapterPesananMitra.mViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RVAdapterPesananMitra.mViewHolder mViewHolder, int position) {

        mViewHolder.img_user.setImageResource(mPesanan.get(position).getFoto());
        mViewHolder.tv_name.setText(mPesanan.get(position).getNama());
        mViewHolder.tv_ket.setText(mPesanan.get(position).getKet());
        mViewHolder.tv_harga.setText(mPesanan.get(position).getHarga());

    }

    @Override
    public int getItemCount() {
        return mPesanan.size();
    }

    public static class mViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_user;
        private TextView tv_name, tv_ket, tv_harga ;

        public mViewHolder(View itemView){
            super(itemView);

            img_user = (ImageView) itemView.findViewById(R.id.img_pesanan);
            tv_name = (TextView) itemView.findViewById(R.id.tv_namabahanmitra);
            tv_ket = (TextView) itemView.findViewById(R.id.tv_ketbahanmitra);
            tv_harga = (TextView) itemView.findViewById(R.id.tv_hargabahanmitra);

        }
    }

}
