package com.example.gamts.life.Main.Main;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.gamts.life.R;

public class TimepageActivity extends AppCompatActivity {


    private ProgressBar progressBarSleep,progressBarEx,progressBarWork,progressBarSleeprest,progressBarExrest, progressBarWorkrest;
    private Button addbar,addbarEx,addbarWork,minussleep,minusEx,minusWork;
    private int progressStatussleep = 0, progressStatusEx = 0 ,progressStatusWork = 0,progressStatussleeprest = 0,progressStatusExrest = 0, progressStatusWorkrest = 0;
    private TextView textViewsleep, textViewEx , textViewWorkrest, textViewsleeprest, textViewExrest , textViewWorkdone;
    private Handler handler = new Handler();
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepage);

        initCompo();

    }

    private void initCompo(){
        btn_back = (Button) findViewById(R.id.backtomain);
        progressBarSleep = (ProgressBar) findViewById(R.id.progressbarsleepdone);
        progressBarEx = (ProgressBar) findViewById(R.id.progressbarExdone);
        textViewsleep = (TextView) findViewById(R.id.textsleep);
        addbar = (Button) findViewById(R.id.addprogress);
        textViewEx = (TextView) findViewById(R.id.textexcersice);
        progressBarWork = (ProgressBar) findViewById(R.id.progressbarWorkdone);
        textViewWorkdone = (TextView) findViewById(R.id.textsWork);

        //--------------------------------
        progressBarSleeprest = (ProgressBar) findViewById(R.id.progressbarsleep);
        textViewsleeprest = (TextView) findViewById(R.id.sleeprest);
        progressStatussleeprest = progressBarSleep.getMax();
        

        progressBarExrest = (ProgressBar) findViewById(R.id.progressbarEx);
        textViewExrest = (TextView) findViewById(R.id.Exrest);
        progressStatusExrest = progressBarEx.getMax();

        progressBarWorkrest = (ProgressBar) findViewById(R.id.progressbarWork);
        textViewWorkrest = (TextView) findViewById(R.id.textworkrest);
        progressStatusWorkrest =  progressBarWork.getMax();



    }

    public void back(View view){
        Intent backtomain = new Intent(TimepageActivity.this,MainActivity.class);
        startActivity(backtomain);
    }

    public void addprosleep (View view){
        if(progressStatussleep < 10){
            progressStatussleep += 1;
            progressStatussleeprest -= 1;
        }

        progressBarSleep.setProgress(progressStatussleep);
        textViewsleep.setText("Sleep(hours): " + progressStatussleep + "/" + progressBarSleep.getMax());
        textViewsleeprest.setText("Sleep(hours): " + progressStatussleeprest + "/" + progressBarSleeprest.getMax());

    }

    public void addproEx (View view){
        if(progressStatusEx < 10){
            progressStatusEx += 1;
            progressStatusExrest -= 1;
        }

        progressBarEx.setProgress(progressStatusEx);
        textViewEx.setText("Excersice(hours): " + progressStatusEx + "/" + progressBarEx.getMax());
        textViewExrest.setText("Excersice(hours): "+ progressStatusExrest + "/" + progressBarExrest.getMax());
    }

    public void addproWork (View view){
        if(progressStatusWork < 10){
            progressStatusWork += 1;
            progressStatusWorkrest -= 1;
        }

        progressBarWork.setProgress(progressStatusWork);
        textViewWorkdone.setText("Work(hours): " + progressStatusWork + "/" + progressBarWork.getMax());
        textViewWorkrest.setText("Work(hours): " + progressStatusWorkrest+ "/" + progressBarWorkrest.getMax());
    }

    public void minusprosleep(View view){
        if(progressStatussleep <= 10 && progressStatussleep > 0){
            progressStatussleep -= 1;
            progressStatussleeprest += 1;
        }

        progressBarSleep.setProgress(progressStatussleep);
        textViewsleep.setText("Sleep(hours): " + progressStatussleep + "/" + progressBarSleep.getMax());
        textViewsleeprest.setText("Sleep(hours): " + progressStatussleeprest + "/" + progressBarSleeprest.getMax());

    }

    public void minusproEx(View view){
        if(progressStatusEx <= 10 && progressStatusEx > 0){
            progressStatusEx -= 1;
            progressStatusExrest += 1;
        }
        progressBarEx.setProgress(progressStatusEx);
        textViewEx.setText("Excersice(hours): " + progressStatusEx + "/" + progressBarEx.getMax());
        textViewExrest.setText("Excersice(hours): "+ progressStatusExrest + "/" + progressBarExrest.getMax());

    }

    public void minusproWork(View view){
        if(progressStatusWork <= 10 && progressStatusWork > 0){
            progressStatusWorkrest += 1;
            progressStatusWork -= 1;
        }
        progressBarWork.setProgress(progressStatusWork);
        textViewWorkdone.setText("Work(hours): " + progressStatusWork + "/" + progressBarWork.getMax());
        textViewWorkrest.setText("Work(hours): " + progressStatusWorkrest + "/" + progressBarWorkrest.getMax());

    }

}
