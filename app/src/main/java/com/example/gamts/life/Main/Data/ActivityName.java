package com.example.gamts.life.Main.Data;

/**
 * Created by GamTS on 28/5/2560.
 */

public class ActivityName {
    private float time;
    private String name ;

    public ActivityName(String name, float time){
        this.name = name;
        this.time = time;
    }

    public String toString(){
        return name;
    }

    public void setName(String setname){
        this.name = setname;
    }

    public float getTime(){
        return time;
    }

    public void setTime(Float settime){
        this.time = settime;
    }

}
