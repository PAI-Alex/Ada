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
    String nameText, surnameText, middleNameText, phoneText, jobText;
   Person person= new Person (nameText, surnameText, middleNameText, phoneText, jobText);

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
        holder.bind ( position);

    }

    @Override
    public int getItemCount() {
        return number;
    }

    class ADA extends RecyclerView.ViewHolder {

        EditText name, surname, middleName, phone,job;

        public ADA(@NonNull View itemView) {
            super ( itemView );
            name = itemView.findViewById ( R.id.name );
            surname = itemView.findViewById ( R.id.surname );
            middleName=itemView.findViewById ( R.id.middleName );
            phone = itemView.findViewById ( R.id.phone );
            job=itemView.findViewById ( R.id.job );

//            nameText=String.valueOf (  name.getText ());
//            surnameText=String.valueOf (  surname.getText ());
//            middleNameText=String.valueOf (  middleName.getText ());
//            phoneText=String.valueOf (  phone.getText ());
//            jobText=String.valueOf (  job.getText ());
        }

        void bind(int i) {
            //element.setText (String.valueOf ( i )  );
//            name.setText ( person.getName () );
        }
    }
}
