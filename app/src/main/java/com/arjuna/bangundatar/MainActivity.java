package com.arjuna.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button
    Button btnPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil id button
        btnPersegi = (Button) findViewById(R.id.btnPersegi);
        //agar button btnpersegi bisa di klik
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //menambahkan intent agar pindah ke halaman k activy yang lain
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //agar bisa pindah ke activity maka kita harus nambahin startActivity
                startActivity(a1);
            }
        });
    }
}
