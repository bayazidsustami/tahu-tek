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

public class FragmentPesanan extends Fragment {

    View v;
    private RecyclerView mrecyclerview;
    private List<Pesanan> pesananList;

    public FragmentPesanan(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v = inflater.inflate(R.layout.pesanan_fragment, container, false);
        mrecyclerview = (RecyclerView) v.findViewById(R.id.pesanan_rv);
        RVAdapterPesanan rvAdapterPesanan = new RVAdapterPesanan(getContext(), pesananList);
        mrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        mrecyclerview.setAdapter(rvAdapterPesanan);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        pesananList = new ArrayList<>();
        pesananList.add(new Pesanan(R.drawable.foto01, "Santoso", "50000","15.00"));
        pesananList.add(new Pesanan(R.drawable.foto02, "Susilo", "25000","16.00"));
        pesananList.add(new Pesanan(R.drawable.foto03, "Sumanto", "30000","17.00"));
        pesananList.add(new Pesanan(R.drawable.foto04, "Sumitro", "150000","17.30"));
    }
}
