package com.redhoarifin.psico;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void beck(View view){
        finish();
        Intent beck = new Intent(ProfilActivity.this,MainActivity.class);
        startActivity(beck);

    }

    public void ig(View view){
        finish();
        Intent ig = new Intent(Intent.ACTION_VIEW,Uri.parse("https://instagram.com/redhoarifin"));
        startActivity(ig);
    }
    public void fb(View view){
        finish();
        Intent fb = new Intent(Intent.ACTION_VIEW,Uri.parse("https://facebook.com/gon"));
        startActivity(fb);
    }
    public void lk(View view){
        finish();
        Intent lk = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/redho-arifin-983372196/"));
        startActivity(lk);
    }
    public void onBackPressed() {
        finish();
        Intent on = new Intent(ProfilActivity.this, MainActivity.class);
        startActivity(on);
    }
}
