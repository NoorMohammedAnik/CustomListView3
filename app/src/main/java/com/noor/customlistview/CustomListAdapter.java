package com.noor.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Noor Mohammed on 09-Aug-2017.
 */

public class CustomListAdapter extends BaseAdapter {

    String countryList[];
    int flag[];
    LayoutInflater inflater;

    public CustomListAdapter(Context context,String countryList[],int flags[])
    {
        this.countryList=countryList;
        this.flag=flags;
        inflater=(LayoutInflater.from(context));


    }


    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view =inflater.inflate(R.layout.list_items,null);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);

        textView.setText(countryList[position]);
        imageView.setImageResource(flag[position]);


        return view;
    }
}
