package com.example.ryan.bottomnavigation.admin.Bahans;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ryan.bottomnavigation.R;

import java.util.ArrayList;
import java.util.List;

public class BahanFragment extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private List<Bahan> bahanList;

    private Button tambahbahan;

    public BahanFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_bahan, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.bahan_recyclerview);
        RecyclerViewAdapterBahan recyclerViewAdapterBahan = new RecyclerViewAdapterBahan(getContext(), bahanList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapterBahan);

        tambahbahan = v.findViewById(R.id.btn_tambahbahan);
        tambahbahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TambahBahanActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bahanList = new ArrayList<>();
        bahanList.add(new Bahan(R.drawable.tahuu, "Tahu", "50 biji", "35000"));
        bahanList.add(new Bahan(R.drawable.tauge, "Tauge", "100 gram", "10000"));
        bahanList.add(new Bahan(R.drawable.kacang, "Kacang Tanah", "1 liter", "15000"));
        bahanList.add(new Bahan(R.drawable.krupuk, "Kerupuk", "1 bungkus", "25000"));
        bahanList.add(new Bahan(R.drawable.tahuu, "Tahu", "50 biji", "35000"));
        bahanList.add(new Bahan(R.drawable.tauge, "Tauge", "100 gram", "10000"));
        bahanList.add(new Bahan(R.drawable.kacang, "Kacang Tanah", "1 liter", "15000"));
        bahanList.add(new Bahan(R.drawable.krupuk, "Kerupuk", "1 bungkus", "25000"));

    }


}
