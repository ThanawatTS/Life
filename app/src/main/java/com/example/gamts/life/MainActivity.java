package com.example.gamts.life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    float testgam[] = {55.5f, 42.3f};
    String gamtest[] = {"Gam", "love"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPie();
    }

    private void setupPie(){
        List<PieEntry> pieEntrygam = new ArrayList<>();
        for (int i = 0 ; i < testgam.length; i++){
            pieEntrygam.add(new PieEntry(testgam[i], gamtest[i]));
        }
        PieDataSet dataSetgam = new PieDataSet(pieEntrygam,"");
        dataSetgam.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData datagam = new PieData(dataSetgam);

        PieChart chart = (PieChart) findViewById(R.id.piechart);
        chart.setData(datagam);
        chart.animateY(1000);
        chart.invalidate();
    }
    public void addWater(View view){
        display(2);
    }

    private void display(int number){
        TextView test = (TextView) findViewById(R.id.test_textview);
        test.setText(""+number);
    }
}
