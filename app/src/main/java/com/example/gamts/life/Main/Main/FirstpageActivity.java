package com.example.gamts.life.Main.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gamts.life.R;

public class FirstpageActivity extends AppCompatActivity {


    private Button btn_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        initCompo();
    }

    private void initCompo(){
        btn_main = (Button) findViewById(R.id.backtomain);
    }

    public void gototeenager(View view){
        Intent gotomain = new Intent(FirstpageActivity.this,MainActivity.class);
        startActivity(gotomain);
    }

    public void gotoadult(View view){
        Intent gotomain = new Intent(FirstpageActivity.this,MainActivity.class);
        startActivity(gotomain);
    }
}
