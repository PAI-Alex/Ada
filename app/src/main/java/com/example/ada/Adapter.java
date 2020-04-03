package com.example.ada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ADA> {
    private int number;

    public Adapter(int num) {
        number = num;
    }

    @NonNull
    @Override
    public ADA onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {

        Context context = parent.getContext ();
        int id = R.layout.list;
        LayoutInflater inflater = LayoutInflater.from ( context ); //создание нового представления
        View view = inflater.inflate ( id , parent , false );
        ADA ada = new ADA ( view );
        return ada;


    }

    @Override
    public void onBindViewHolder(@NonNull ADA holder , int position) {
        holder.bind ( position );

    }

    @Override
    public int getItemCount() {
        return number;
    }

    class ADA extends RecyclerView.ViewHolder {
        EditText name, surname;

        public ADA(@NonNull View itemView) {
            super ( itemView );
            name = itemView.findViewById ( R.id.name );
            surname = itemView.findViewById ( R.id.surname );
        }

        void bind(int i) {
            //element.setText (String.valueOf ( i )  );
        }
    }
}
