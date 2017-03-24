package com.example.alumno.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        TextView tv = (TextView)super.findViewById(R.id.txtSaludo);
        tv.setText("Otro texto");

        Button btn1 = (Button) super.findViewById(R.id.btn1);
        btn1.setText("Cambiar texto");

        MyListener listenr = new MyListener();

        btn1.setOnClickListener(listenr);




    }
}































