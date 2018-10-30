package com.example.yucong.broadcastoffline;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    public static List<Activity> activities=new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 全部关闭所有活动
     */
    public static void finishAll(){
        for (Activity  activity   :  activities){
              if(!activity.isFinishing()){
                  activity.finish();
              }

        }
    }

}
