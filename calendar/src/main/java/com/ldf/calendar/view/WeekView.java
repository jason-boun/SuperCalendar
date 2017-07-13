package com.ldf.calendar.view;

import android.content.Context;
import android.util.AttributeSet;

import com.ldf.calendar.translator.ExpandableLayout;

/**
 * Created by ldf on 17/7/12.
 */

public class WeekView extends ExpandableLayout{
    
    private Week week;
    
    public WeekView(Context context) {
        super(context);
    }

    public WeekView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Week getWeekData() {
        return week;
    }

    public void setWeekData(Week week) {
        this.week = week;
    }


}
