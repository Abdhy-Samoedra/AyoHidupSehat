package com.example.ayohidupsehat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_Jaga_Diri);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivity2 = findViewById(R.id.btn_Cuci_Tangan);
        btnMoveActivity2.setOnClickListener(this);

        Button btnMoveActivity3 = findViewById(R.id.btn_Pakai_masker);
        btnMoveActivity3.setOnClickListener(this);

        Button btnMoveActivity4 = findViewById(R.id.btn_Hidup_sehat);
        btnMoveActivity4.setOnClickListener(this);
    }
    @Override
	    public void onClick(View v) {
               switch (v.getId()) {
            	            case R.id.btn_Jaga_Diri:
            	                Intent moveIntent = new Intent(MainActivity.this,Jaga_Diri.class);
            	                startActivity(moveIntent);
                	                break;
                   case R.id.btn_Cuci_Tangan:
                       Intent moveIntent2 = new Intent(MainActivity.this,Cuci_Tangan.class);
                       startActivity(moveIntent2);
                       break;
                   case R.id.btn_Pakai_masker:
                       Intent moveIntent3 = new Intent(MainActivity.this,Pakai_masker.class);
                       startActivity(moveIntent3);
                       break;
                   case R.id.btn_Hidup_sehat:
                       Intent moveIntent4 = new Intent(MainActivity.this,HIdup_Sehat.class);
                       startActivity(moveIntent4);
                       break;
            	        }
            }


}