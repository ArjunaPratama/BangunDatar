package com.arjuna.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText etAlas, etTinggi, etSisi, etSisia, etSisiaa;
    TextView txtHasil;
    Button btnHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        //memanggil id widget
        etAlas = (EditText)findViewById(R.id.etAlas);
        etTinggi = (EditText)findViewById(R.id.etTinggi);
        etSisi = (EditText)findViewById(R.id.etSisi);
        etSisiaa = (EditText)findViewById(R.id.etSisiaa);
        etSisia = (EditText)findViewById(R.id.etSisia);
        btnHasil = (Button) findViewById(R.id.btnHasil);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nAlas = etAlas.getText().toString();
                String nTinggi = etTinggi.getText().toString();
                String nSisi = etSisi.getText().toString();
                String nSisia = etSisia.getText().toString();
                String nSisiaa = etSisiaa.getText().toString();



                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nAlas.isEmpty()){
                    //memberikan warning berupa eror
                    etAlas.setError("Panjang Tidak Boleh Kosong");
                }else if (nTinggi.isEmpty()){
                    //Kondisi ketika lebarnya kosong
                    etTinggi.setError("Lebar Tidak Boleh Kosong");
                }else {

                    //mengubah nilai dari String ke Interger
                    int aPanjang = Integer.parseInt(nAlas);
                    int aLebar = Integer.parseInt(nTinggi);
                    int aSisi = Integer.parseInt(nSisi);
                    int aSisia = Integer.parseInt(nSisia);
                    int aSisiaa = Integer.parseInt(nSisiaa);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (aSisi + aSisia + aSisiaa);
                    int hasilHitungLuas = aPanjang * aLebar /2;

                    //menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + "  " + "Luas : " + hasilHitungLuas);
                }
            }
        });
    }
}
