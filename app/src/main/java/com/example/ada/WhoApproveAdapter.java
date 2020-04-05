package com.example.ada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WhoApproveAdapter extends RecyclerView.Adapter<WhoApproveAdapter.WhoApprove> {
    private int number;
    WhoApproveAdapter(int num){
        number=num;
    }
    @NonNull
    @Override
    public WhoApprove onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        Context context= parent.getContext ();
        int id=R.layout.list_3;
        LayoutInflater inflater = LayoutInflater.from ( context ); //создание нового представления
        View view = inflater.inflate ( id , parent , false );
        WhoApprove whoApprove= new WhoApprove ( view );
        return whoApprove;

    }

    @Override
    public void onBindViewHolder(@NonNull WhoApprove holder , int position) {


    }

    @Override
    public int getItemCount() {
        return number;
    }

    class WhoApprove extends RecyclerView.ViewHolder {
        EditText fio;

        public WhoApprove(@NonNull View itemView) {

            super ( itemView );
            fio=itemView.findViewById ( R.id.fioWhoApprove );


        }
    }
}
