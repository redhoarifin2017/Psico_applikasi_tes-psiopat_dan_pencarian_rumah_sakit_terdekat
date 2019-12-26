package com.redhoarifin.psico;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Diagnosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnosa);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
    // TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Terduga Psikopat: " + score + "%");

//        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
//        int highscore = mypref.getInt("highscore",0);
//        if(highscore>= score)
//            txtHighScore.setText("High score: "+highscore);
//        else
//        {
//            txtHighScore.setText("New highscore: "+score);
//            SharedPreferences.Editor editor = mypref.edit();
//            editor.putInt("highscore", score);
//            editor.commit();
//        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(Diagnosa.this, Psikopattest.class);
        startActivity(intent);
    }
    public void onBackPressed() {
        finish();
        Intent on = new Intent(Diagnosa.this, MainActivity.class);
        startActivity(on);
    }
    public void rst(View view){
        finish();
        Intent rs = new Intent(Diagnosa.this,MapsActivity.class);
        startActivity(rs);
    }
}

