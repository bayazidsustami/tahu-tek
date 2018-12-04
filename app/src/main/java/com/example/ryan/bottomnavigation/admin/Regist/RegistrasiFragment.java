package com.example.ryan.bottomnavigation.admin.Regist;

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

public class RegistrasiFragment extends Fragment {

    View v;

    private RecyclerView nRecyclerView;
    private List<Regis> regisList;

    private Button tambahuser;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_registrasi, container, false);
        nRecyclerView = (RecyclerView) v.findViewById(R.id.regis_recyclerview);
        RecyclerViewAdapterRegis recyclerViewAdapterRegis = new RecyclerViewAdapterRegis(getContext(), regisList);
        nRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        nRecyclerView.setAdapter(recyclerViewAdapterRegis);

        tambahuser = v.findViewById(R.id.btn_tambahuser);
        tambahuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TambahUserActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        regisList = new ArrayList<>();
        regisList.add(new Regis(R.drawable.foto01, "Michael"));
        regisList.add(new Regis(R.drawable.foto02, "Ronaldo"));
    }

}
