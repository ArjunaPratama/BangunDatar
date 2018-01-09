package com.arjuna.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //memanggil id widget
        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        btnHitung = (Button) findViewById(R.id.btnHitungPersegi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);


        //aksi ketika button btnHitung di klik
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();



                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nPanjang.isEmpty()){
                    //memberikan warning berupa eror
                    etPanjang.setError("Panjang Tidak Boleh Kosong");
                }else if (nLebar.isEmpty()){
                    //Kondisi ketika lebarnya kosong
                    etLebar.setError("Lebar Tidak Boleh Kosong");
                }else{

                    //mengubah nilai dari String ke Interger
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (2 * aPanjang) + (2 * aLebar);
                    int hasilHitungLuas = aPanjang * aLebar;

                    //menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + "  " + "Luas : " + hasilHitungLuas);
                }
            }
        });
    }
}
