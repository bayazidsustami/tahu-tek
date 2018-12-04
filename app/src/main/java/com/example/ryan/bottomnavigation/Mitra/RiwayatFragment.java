package com.example.ryan.bottomnavigation.Mitra;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class RiwayatFragment extends Fragment {

    View v;
    private RecyclerView mrecyclerview;
    private List<RiwayatMitra> riwayatList;

    public RiwayatFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v = inflater.inflate(R.layout.fragment_riwayat, container, false);
        mrecyclerview = (RecyclerView) v.findViewById(R.id.riwayatmitra_rv);
        RVAdapterRiwayatMitra rvAdapterRiwayatMitra = new RVAdapterRiwayatMitra(getContext(), riwayatList);
        mrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        mrecyclerview.setAdapter(rvAdapterRiwayatMitra);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        riwayatList = new ArrayList<>();
        riwayatList.add(new RiwayatMitra(R.drawable.foto01, "50000","15.00","Barang sudah dikirim"));
        riwayatList.add(new RiwayatMitra(R.drawable.foto01, "25000","20 November 2018","Barang sudah dikirim"));
        riwayatList.add(new RiwayatMitra(R.drawable.foto01, "30000","10 November 2018","Barang sudah diterima"));
        riwayatList.add(new RiwayatMitra(R.drawable.foto01, "150000","9 November 2018","Barang sudah diterima"));
    }
}
