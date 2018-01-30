package com.example.recyclrview;

import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by 갓현수 on 2018-01-29.
 */

public class MyRecyclrViewAdpater extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int images[] = {R.drawable.desert, R.drawable.penguins, R.drawable.tulips};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        int width = parent.getResources().getDisplayMetrics().widthPixels/3;

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        view.setLayoutParams(new LinearLayoutCompat.LayoutParams(width,width));
        //xml 디자인 한 부분 적용
        return new RowCell(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((RowCell) holder).imageView.setImageResource(images[position]);
        //xml디자인한 부분의 안의 내요을 변경
    }

    @Override
    public int getItemCount() {
        //아이템을 측정하는 카운터
        return images.length;
    }


    private static class RowCell extends RecyclerView.ViewHolder {

        public ImageView imageView;

        public RowCell(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.recyclerview_item_imageview);
        }
    }
}