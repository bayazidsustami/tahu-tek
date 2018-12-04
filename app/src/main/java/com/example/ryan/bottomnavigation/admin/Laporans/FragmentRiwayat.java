package com.example.ryan.bottomnavigation.admin.Laporans;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ryan.bottomnavigation.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentRiwayat extends Fragment {

    View v;
    private RecyclerView mRecyclerview;
    private List<Riwayat> riwayatList;

    public FragmentRiwayat(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v = inflater.inflate(R.layout.riwayat_fragment, container, false);
        mRecyclerview = (RecyclerView) v.findViewById(R.id.riwayat_rv);
        RVAdapterRiwayat rvAdapterRiwayat = new RVAdapterRiwayat(getContext(), riwayatList);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerview.setAdapter(rvAdapterRiwayat);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        riwayatList = new ArrayList<>();
        riwayatList.add(new Riwayat(R.drawable.foto01, "Santoso", "50000","15.00","Barang sudah dikirim"));
        riwayatList.add(new Riwayat(R.drawable.foto02, "Susilo", "25000","16.00","Barang sudah dikirim"));
        riwayatList.add(new Riwayat(R.drawable.foto03, "Sumanto", "30000","10 November 2018","Barang sudah diterima"));
        riwayatList.add(new Riwayat(R.drawable.foto04, "Sumitro", "150000","9 November 2018","Barang sudah diterima"));
    }

}
