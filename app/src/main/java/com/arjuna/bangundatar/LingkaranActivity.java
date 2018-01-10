package com.arjuna.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText etJarijari;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        //memanggil id widget
        etJarijari = (EditText)findViewById(R.id.etJarijari);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nJari = etJarijari.getText().toString();

                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nJari.isEmpty()){
                    //memberikan warning berupa eror
                    etJarijari.setError("Jari jari Tidak Boleh Kosong");
                }else {

                    //mengubah nilai dari String ke Interger
                    int aPanjang = Integer.parseInt(nJari);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (2 * 22 / 7 * aPanjang);
                    int hasilHitungLuas = 22 /7  * aPanjang * aPanjang;

                    //menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Keliling : " + hasilHitungKeliling + "  " + "Luas : " + hasilHitungLuas);

                }
            }
        });
    }
}
