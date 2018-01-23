package com.example.admin.finaltest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.finaltest.Model.CountryClass;
import com.example.admin.finaltest.R;

import java.util.ArrayList;

/**
 * Created by Dell on 23-01-2018.
 */

public class CountryAdapter extends BaseAdapter {

    ArrayList<CountryClass> data = new ArrayList<CountryClass>();
    LayoutInflater inflater;
    Context context;




    public CountryAdapter(Context context, ArrayList<CountryClass> myList) {
        this.data = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }


    @Override
    public int getCount() {
        return data==null?0:data.size();
    }

    @Override
    public CountryClass getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.dcountry, parent, false);
            mViewHolder = new MyViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }
        CountryClass data = getItem(position);
        mViewHolder.tvDepartmentName.setText(data.getDepartmentName());
        return convertView;
    }

    private class MyViewHolder {
        TextView tvDepartmentName;

        public MyViewHolder(View item) {
            tvDepartmentName = (TextView)item.findViewById(R.id.tvDepartmentName);
        }
    }
}