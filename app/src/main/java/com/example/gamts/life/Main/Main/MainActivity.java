package com.example.gamts.life.Main.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gamts.life.Main.Data.ActivityName;
import com.example.gamts.life.Main.Data.ActivityRepository;
import com.example.gamts.life.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements LifeView {

   // ArrayList<Float> convertAcTime ;
    //ArrayList<String> convertAcName;
    //LifePresenter presenter;
    //ArrayAdapter<ActivityName> Activity;
    //ArrayList<ActivityName> arrAcName;
    //ArrayList<ActivityTime> arrAcTime;
//    String gam[] = {"gam1", "gam2", "gam3"};
//    float gamfloat[] = {2.8f,4.5f,5.5f};
//    String[] gamkub = {"gam", "gam2", "gam4"};
//    ActivityName nameee = new ActivityName(gamkub);
//    ArrayList<ActivityName> activityNames = new ArrayList<ActivityName>();
//    List<String> test = new ArrayList<>(activityNames.size());
//    String[] testarr ;
    private LifePresenter presenter;
    private ActivityRepository activityrepository;

    private TextView describetion;
    private PieChart chart;

    public Button btntime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityrepository = ActivityRepository.getInstance();
        presenter = new LifePresenter(activityrepository, this);

        initID();
        setupPie();
        Describe();

    }

    private void initID() {
        PieChart chart = (PieChart) findViewById(R.id.piechart);
        btntime = (Button) findViewById(R.id.btnadjusttime);
        describetion = (TextView) findViewById(R.id.describe);
    }

    public void Describe(){
        describetion.setText("Today didn't update anything yet");
    }


    @Override
    public void setupPie(){
        List<PieEntry> pieEntrydata = new ArrayList<>();
        for (int i = 0 ; i < activityrepository.getWork(); i++){
            pieEntrydata.add(new PieEntry(activityrepository.getActivity(i).getTime(),activityrepository.getActivity(i).toString()));
        }
        PieDataSet dataSet = new PieDataSet(pieEntrydata,"");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data = new PieData(dataSet);

        PieChart chart = (PieChart) findViewById(R.id.piechart);
        chart.setData(data);
        chart.animateY(1000);
        chart.invalidate();
        Description des = new Description();
        des.setText("");
        chart.setDescription(des);
    }

    @Override
    public void adjustTime(View view) {
        Intent gototimepage = new Intent(MainActivity.this,TimepageActivity.class);
        startActivity(gototimepage);
    }




}
