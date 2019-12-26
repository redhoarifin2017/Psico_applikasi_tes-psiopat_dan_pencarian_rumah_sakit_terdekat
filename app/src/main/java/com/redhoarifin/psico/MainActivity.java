package com.redhoarifin.psico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dasboard);


    }
//method untuk keluar
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Keluar dari aplikasi?");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("")
                .setIcon(R.drawable.ic_error_black_24dp)
                .setCancelable(true)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }


    public void about(View view){
        finish();
        Intent a = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(a);
    }
    public void iq(View view){
        finish();
        Intent b = new Intent(MainActivity.this, IQtest.class);
        startActivity(b);
    }
    public void psiko(View view){
        finish();
        Intent c = new Intent(MainActivity.this, Psikopattest.class);
        startActivity(c);
    }
    public void peta(View view){
        finish();
        Intent d = new Intent(MainActivity.this,MapsActivity.class);
        startActivity(d);
    }
    public void video(View view){
        finish();
        Intent e = new Intent(MainActivity.this,VideoActivity.class);
        startActivity(e);
    }
}
