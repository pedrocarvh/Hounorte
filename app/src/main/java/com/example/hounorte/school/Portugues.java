package com.example.hounorte.school;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.hounorte.R;
import com.google.android.material.button.MaterialButton;

public class Portugues extends AppCompatActivity {

    private MaterialButton setaVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugues);
        IniciarComponentes();

        setaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void IniciarComponentes(){
        setaVoltar = findViewById(R.id.btn_back_quiz);
    }
}