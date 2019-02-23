package com.example.nidal.cupaadoption;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class StaggeredRecyclerviewAdapter extends RecyclerView.Adapter<StaggeredRecyclerviewAdapter.ViewHolder>{

    private static final String TAG = "StaggeredRecyclerviewAd";

    private Context mContext;
    private ArrayList<String> mImageUrls;


    public StaggeredRecyclerviewAdapter(Context mContext, ArrayList<String> mImageUrls) {
        this.mImageUrls = mImageUrls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_successful_adoptions, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int pos) {
        Log.d(TAG, "onBindViewHolder: called.");

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_foreground);

        Glide.with(mContext)
                .load(mImageUrls.get(pos))
                .apply(requestOptions)
                .into(viewHolder.imagesa);

        /*viewHolder.imagesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });   **Click on image action**  */

    }

    @Override
    public int getItemCount() {
        return mImageUrls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagesa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imagesa = itemView.findViewById(R.id.imagesa);
        }
    }
}
