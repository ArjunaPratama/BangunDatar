package com.arjuna.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button
    Button btnPersegi, btnJajargenjang, btnLingkaran, btnSegitiga;

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

        //memanggil id button
        btnJajargenjang = (Button) findViewById(R.id.btnJajargenjang);
        //agar button btnJajargenjang bisa di klik
        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah k halaman k activty yang lain
                Intent a2 = new Intent(getApplicationContext(), JajargenjangActivity.class);
                //agar bisa pindah k activty maka kita harus nambahin start activity
                startActivity(a2);
            }
        });

        btnLingkaran = (Button) findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menambahkan intent agar pindah k halaman k activty yang lain
                Intent a3 = new Intent(getApplicationContext(), LingkaranActivity.class);
                //agar bisa pindah k activty maka kita harus nambahin start activity
                startActivity(a3);

            }
        });

        btnSegitiga = (Button) findViewById(R.id.btnSegitiga);
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menambahkan intent agar pindah k halaman k activty yang lain
                Intent a4 = new Intent(getApplicationContext(), SegitigaActivity.class);
                //agar bisa pindah k activty maka kita harus nambahin start activity
                startActivity(a4);
            }
        });
    }
}
