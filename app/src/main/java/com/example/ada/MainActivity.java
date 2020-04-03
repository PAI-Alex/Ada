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

import static com.example.ada.R.id.fio;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
//    Button add;
//    LinearLayout person;
//    LinearLayout layout;
//    TextView tv;
//
//
//
//    @SuppressLint("ResourceAsColor")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ScrollView sv = new ScrollView(this);
//        ScrollView lv = new ScrollView ( this );
//        layout = new LinearLayout(this);
//        layout.setOrientation(LinearLayout.VERTICAL);
//        layout.setDividerPadding(this.getResources().getDisplayMetrics().heightPixels / 20);
//
//        person = new LinearLayout ( this );
//        person.setOrientation ( LinearLayout.VERTICAL );
//        person.setBackgroundColor ( R.color.colorAccent );
//        person.setDividerPadding(this.getResources().getDisplayMetrics().heightPixels / 20);
//
//
//
//        Button b = new Button(this);
//        b.setText("Кнопка");
//        Button c = new Button(this);
//        c.setText("Кнопка");
//        b.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                TextView tv = new TextView(v.getContext());
//                tv.setText("Текст1");
//                TextView tv2 = new TextView(v.getContext());
//                tv2.setText("Текст2");
//                TextView tv3 = new TextView(v.getContext());
//                tv3.setText("Текст3");
//
//                ((MainActivity)v.getContext()).person.addView(tv, new ViewGroup.LayoutParams(300, 100));
//                ((MainActivity)v.getContext()).person.addView(tv2, new ViewGroup.LayoutParams(300, 100));
//                ((MainActivity)v.getContext()).person.addView(tv3, new ViewGroup.LayoutParams(300, 200));
//            }
//        });
//
//        layout.addView(b, new ViewGroup.LayoutParams(500, 200));
//
//        layout.addView ( person, new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, 600) );
//       sv.addView(layout);
//       //
//        addContentView(sv, new ViewGroup.LayoutParams(getResources().getDisplayMetrics().widthPixels,
//                getResources().getDisplayMetrics().heightPixels));
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    LinearLayout rl=findViewById(R.id.per);


    ll = new LinearLayout(this);
    ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
    ll.setOrientation(LinearLayout.VERTICAL);

    Button b = findViewById ( R.id.button );

    b.setOnClickListener ( new View.OnClickListener () {
        @Override
        public void onClick(View v) {
            EditText name = new EditText (v.getContext());
            name.setHint ( "Имя" );
            EditText surname = new EditText (v.getContext());
            surname.setHint ( "Фамилия" );
            EditText midName = new EditText (v.getContext());
            midName.setHint ( "Отчество" );
            EditText phone = new EditText (v.getContext());
            phone.setHint ( "Телефон" );
            EditText job = new EditText (v.getContext());
            job.setHint ( "Должность" );

            ll.addView ( name);
            ll.addView ( surname);
            ll.addView ( midName);
            ll.addView ( phone);
            ll.addView ( job);

        }
    } );




    rl.addView(ll);


}
}
