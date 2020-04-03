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

    private RecyclerView per;
    private Adapter adapter;
    private Button b;
    int i=1;

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    per=findViewById ( R.id.rv );

    LinearLayoutManager layoutManager = new LinearLayoutManager ( this );
    per.setLayoutManager ( layoutManager );
    adapter= new Adapter ( i );
    per.setAdapter ( adapter );
    b= findViewById ( R.id.button );
    b.setOnClickListener ( new View.OnClickListener () {
        @Override
        public void onClick(View v) {
            i++;
            adapter= new Adapter ( i );
            per.setAdapter ( adapter );


        }
    } );







}
}
