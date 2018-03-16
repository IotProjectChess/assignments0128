package net.iot.somaproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by user on 2018-01-31.
 */

public class MyGridAdapter extends BaseAdapter {
    Context context;
    ImageView[] imageView = new ImageView[64];
    int[] images = new int[64];
    Utiles utile = new Utiles();

    public MyGridAdapter(Context c){
        setPiecesid();
        context = c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position){ return images[position]; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        utile.setImageView(imageView,position,parent,images,context);
        return imageView[position];
    }

    public void setPiecesid(){
        boolean sw = true;
        for(int i=0; i<images.length; i++){
            if(i%8==0) sw = !sw;
            images[i] = sw == true ?
                    ((i + 1) % 2 == 0 ? R.drawable.dark_brown_block : R.drawable.brown_block) :
                    ((i + 1) % 2 == 0 ? R.drawable.brown_block : R.drawable.dark_brown_block);
        }
    }


}
