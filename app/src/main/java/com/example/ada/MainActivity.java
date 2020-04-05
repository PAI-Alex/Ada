package com.example.ada;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    private RecyclerView per,toWhom, whoApprove;
    private Adapter adapter;
    private toWhomAdapter toWhomAdapter;
    private WhoApproveAdapter whoApproveAdapter;
    private Button b;
    int i=1;

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    per=findViewById ( R.id.rv );
    toWhom = findViewById ( R.id.toWhom );
    whoApprove = findViewById ( R.id.whoApprove );

    LinearLayoutManager layoutManager = new LinearLayoutManager ( this );
    LinearLayoutManager layoutManager1 = new LinearLayoutManager ( this );
    LinearLayoutManager layoutManager2 = new LinearLayoutManager ( this );

    per.setLayoutManager ( layoutManager );
    toWhom.setLayoutManager ( layoutManager1 );
    whoApprove.setLayoutManager ( layoutManager2 );
//
   toWhomAdapter=new toWhomAdapter ( i );
    adapter= new Adapter ( i );
    whoApproveAdapter= new WhoApproveAdapter ( i );

    per.setAdapter ( adapter );
    toWhom.setAdapter ( toWhomAdapter );
    whoApprove.setAdapter ( whoApproveAdapter );

    b= findViewById ( R.id.button );
    b.setOnClickListener ( new View.OnClickListener () {
        @Override
        public void onClick(View v) {
            i++;
            per.getLayoutParams ().height+=500;
            adapter= new Adapter ( i );
            per.setAdapter ( adapter );


        }
    } );







}
}
