package com.example.alita_pc.alikawulansari_1202152332_studycase4;


import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

public class Picture extends AppCompatActivity {
        //mendeklarasikan variabel yang dibutuhkan
        ImageView picture;
        EditText sumber;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_picture);
            setTitle("AsyncTask"); //set title pada tampilan

            //memanggil variabel yang ada pada layout
            picture = (ImageView)findViewById(R.id.picture);
            sumber = (EditText)findViewById(R.id.link);
        }
        //method saat button ditekan
        public void cari(View view) {
            //loading gambar dari internet ke imageview
            Picasso.with(Picture.this).load(sumber.getText().toString())
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.mipmap.ic_launcher)
                    .into(picture);
        }
}
