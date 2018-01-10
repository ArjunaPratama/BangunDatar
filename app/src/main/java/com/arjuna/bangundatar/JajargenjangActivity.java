package com.arjuna.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajargenjangActivity extends AppCompatActivity {

    EditText etAlas, etTinggi;
    Button btnHitung;
    TextView txtHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        //memanggil id widget
        etTinggi = (EditText) findViewById(R.id.etTinggi);
        etAlas = (EditText) findViewById(R.id.etAlas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nAlas = etAlas.getText().toString();
                String nTinggi = etTinggi.getText().toString();

                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if (nAlas.isEmpty()) {
                    //memberikan warning berupa eror
                    etAlas.setError("Panjang Tidak Boleh Kosong");
                } else if (nTinggi.isEmpty()) {
                    //Kondisi ketika lebarnya kosong
                    etTinggi.setError("Lebar Tidak Boleh Kosong");
                } else {

                    //mengubah nilai dari String ke Interger
                    int aAlas = Integer.parseInt(nAlas);
                    int aTinggi = Integer.parseInt(nTinggi);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (2 * (aAlas + aTinggi));
                    int hasilHitungLuas = aAlas * aTinggi;

                    //menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + "  " + "Luas : " + hasilHitungLuas);
                }
            }
        });
    }

}

