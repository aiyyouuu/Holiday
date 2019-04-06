package com.example.holiday;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.holiday.R;
import com.example.holiday.AllModel;

import java.util.ArrayList;
import java.util.List;

public class AllAdapter extends RecyclerView.Adapter<AllAdapter.ViewHolder> {
    Context context;
    List<AllModel> allModels = new ArrayList<>();

    public AllAdapter(Context context, List<AllModel> allModels){
        this.context = context;
        this.allModels = allModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_view, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i){
        viewHolder.tvTanggal.setText(allModels.get(i).getTanggal());
        viewHolder.tvNama.setText(allModels.get(i).getNamaHariBesar());
        viewHolder.tvOverview.setText(allModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, allModels.get(i).getNamaHariBesar(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int getItemCount(){return allModels.size();}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTanggal;
        TextView tvNama;
        TextView tvOverview;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvTanggal = itemView.findViewById(R.id.tv_tgl);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvOverview = itemView.findViewById(R.id.tv_overview);
        }
    }
}
