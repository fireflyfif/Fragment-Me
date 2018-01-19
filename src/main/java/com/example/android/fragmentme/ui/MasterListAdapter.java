package com.example.android.fragmentme.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by fifiv on 19/01/2018.
 * Adapter class that displays a list of images in a GridView
 */

public class MasterListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Integer> mImageIds;

    /**
     * Constructor
     * @param context
     * @param imageIds The list of images to display
     */
    public MasterListAdapter(Context context, List<Integer> imageIds) {
        mContext = context;
        mImageIds = imageIds;
    }

    /**
     * @return Number of items the adapter will display
     */
    @Override
    public int getCount() {
        return mImageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /*
    Creates a new ImageView for each item references by the adapter
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if(convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        // Set the image resource and return the newly created ImageView
        imageView.setImageResource(mImageIds.get(position));

        return imageView;
    }
}
