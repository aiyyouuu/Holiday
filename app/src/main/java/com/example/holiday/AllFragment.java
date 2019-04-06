package com.example.holiday;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllFragment extends Fragment implements MainView {
    List<AllModel> allModels = new ArrayList<>();
    AllAdapter adapter;

    public AllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_all, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv1);
        adapter = new AllAdapter(getContext(), allModels);
        recyclerView.setAdapter(adapter);
        AllPresenter data = new AllPresenter(this,getContext());
        data.setData();
    }

    @Override
    public void onSuccess(List<AllModel> allModels) {
        this.allModels.clear();
        this.allModels.addAll(allModels);
        this.adapter.notifyDataSetChanged();
    }
}
