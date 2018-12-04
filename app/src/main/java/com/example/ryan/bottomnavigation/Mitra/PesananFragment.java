package com.example.ryan.bottomnavigation.Mitra;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ryan.bottomnavigation.R;

import java.util.ArrayList;
import java.util.List;

//https://www.ngulikode.com/2017/02/belajar-membuat-aplikasi-count-number.html

public class PesananFragment extends Fragment {

    View v;
    private RecyclerView mrecyclerview;
    private List<PesananMitra> pesananList;

    public PesananFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v = inflater.inflate(R.layout.fragment_pesanan, container, false);
        mrecyclerview = (RecyclerView) v.findViewById(R.id.pesananmitra_rv);
        RVAdapterPesananMitra rvAdapterPesananMitra = new RVAdapterPesananMitra(getContext(), pesananList);
        mrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        mrecyclerview.setAdapter(rvAdapterPesananMitra);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        pesananList = new ArrayList<>();
        pesananList.add(new PesananMitra(R.drawable.tahuu, "Tahu", "50 biji", "35000"));
        pesananList.add(new PesananMitra(R.drawable.tauge, "Tauge", "100 gram", "10000"));
        pesananList.add(new PesananMitra(R.drawable.kacang, "Kacang Tanah", "1 liter", "15000"));
        pesananList.add(new PesananMitra(R.drawable.krupuk, "Kerupuk", "1 bungkus", "25000"));
        pesananList.add(new PesananMitra(R.drawable.tahuu, "Tahu", "50 biji", "35000"));
        pesananList.add(new PesananMitra(R.drawable.tauge, "Tauge", "100 gram", "10000"));
        pesananList.add(new PesananMitra(R.drawable.kacang, "Kacang Tanah", "1 liter", "15000"));
        pesananList.add(new PesananMitra(R.drawable.krupuk, "Kerupuk", "1 bungkus", "25000"));


    }
}
