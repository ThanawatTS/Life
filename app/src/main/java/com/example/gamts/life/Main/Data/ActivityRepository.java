package com.example.gamts.life.Main.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by GamTS on 28/5/2560.
 */

public  class ActivityRepository {
    private ArrayList<ActivityName> activitynames;

    static ActivityRepository singleInstance = null;

    static public ActivityRepository getInstance(){
        if (singleInstance == null){
            singleInstance = new ActivityRepository();
        }
        return singleInstance;
    }

    public ActivityRepository(){
        activitynames = new ArrayList<ActivityName>();

        activitynames.add(new ActivityName("Sleep", 8));
        activitynames.add(new ActivityName("Work", 10));
        activitynames.add(new ActivityName("excer", 6));
    }

    public int getWork(){
        return activitynames.size();
    }

    public ActivityName getActivity(int index){
        return activitynames.get(index);
    }





}
