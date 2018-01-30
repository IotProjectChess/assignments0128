package com.jhjin9225.errortest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by 20104 on 2018-01-29.
 */

public class MyRecyclerVeiwAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    int images[] = {R.drawable.image_1,R.drawable.image_2,R.drawable.basketball};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);


        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        System.out.println("pusiton"+position);
        ((RowCell)holder).imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    private static class RowCell extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public RowCell(View view) {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.recyclerview_item_imageview);

        }
    }
}
