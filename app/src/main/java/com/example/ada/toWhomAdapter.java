package com.example.ada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class toWhomAdapter extends RecyclerView.Adapter<toWhomAdapter.ToWhom> {
    private int number;
    public toWhomAdapter(int num) {
        number = num;
    }
    @NonNull
    @Override
    public ToWhom onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        Context context = parent.getContext ();
        int id = R.layout.list_2;
        LayoutInflater inflater = LayoutInflater.from ( context ); //создание нового представления
        View view = inflater.inflate ( id , parent , false );
        toWhomAdapter.ToWhom toWhom = new toWhomAdapter.ToWhom ( view );
        return toWhom;
    }

    @Override
    public void onBindViewHolder(@NonNull ToWhom holder , int position) {

    }

    @Override
    public int getItemCount() {
            return number;
    }

    class ToWhom extends RecyclerView.ViewHolder {

        public ToWhom(@NonNull View itemView) {
            super ( itemView );
            EditText fio, unit;
            fio = itemView.findViewById ( R.id.fioToWhom );
        }
    }
}
