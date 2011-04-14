package com.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class RSSItemAdapter extends ArrayAdapter<RSSItem> {

    private final Context context;

    public RSSItemAdapter(Context context, int textViewResourceId, List<RSSItem> items) {
        super(context, textViewResourceId, items);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.rssitem, null);
        }
        final RSSItem item = getItem(position);
        TextView tv = (TextView) v.findViewById(R.id.title);
        tv.setText(item.getTitle());
        return v;
    }
}