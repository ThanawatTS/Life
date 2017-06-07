package com.example.gamts.life.Main.Main;

import com.example.gamts.life.Main.Data.ActivityName;
import com.example.gamts.life.Main.Data.ActivityRepository;
import com.example.gamts.life.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by GamTS on 28/5/2560.
 */

public class LifePresenter {

    private ActivityRepository repository;
    private LifeView view;
    private ActivityName activitynames;
    private int indexactivity;


    public LifePresenter(ActivityRepository repository, LifeView view){
        this.repository = repository;
        this.view = view;

        indexactivity = 0;
    }

    public void initstart(){
        indexactivity = 0;
        ActivityName curActivity = repository.getActivity(indexactivity);

    }

    public void adjustTime(){

    }




}
