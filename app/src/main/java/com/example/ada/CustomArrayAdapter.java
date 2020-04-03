package com.example.ada;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class CustomArrayAdapter implements ListAdapter {
    private Context context;
    private String[] stringValues;

    public CustomArrayAdapter (Context context, String[] stringValues)
    {
        super();
        this.context = context;
        this.stringValues = stringValues;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.fio, parent, false);
        EditText name = view.findViewById ( R.id.editText );
        EditText name1 = view.findViewById ( R.id.editText2 );
        EditText name2 = view.findViewById ( R.id.editText3 );
        EditText name3 = view.findViewById ( R.id.editText4 );
        EditText name4 = view.findViewById ( R.id.editText5 );


        name.setText(stringValues[position]);
        name1.setText(stringValues[position]);
        name2.setText(stringValues[position]);
        name3.setText(stringValues[position]);
        name4.setText(stringValues[position]);

        // String s = stringValues[position];


        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}