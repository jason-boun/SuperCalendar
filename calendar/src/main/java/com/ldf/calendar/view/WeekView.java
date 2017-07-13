package com.ldf.calendar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.ldf.calendar.Const;
import com.ldf.calendar.interf.IDayRenderer;
import com.ldf.calendar.model.Week;
import com.ldf.calendar.translator.ExpandableLayout;

/**
 * Created by ldf on 17/7/12.
 */

public class WeekView extends ExpandableLayout{
    
    private Week week;
    private IDayRenderer renderer;
    
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

    public IDayRenderer getRenderer() {
        return renderer;
    }

    public void setRenderer(IDayRenderer renderer) {
        this.renderer = renderer;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(week != null && week.days != null) {
            for (int i = 0 ; i < Const.TOTAL_COL ; i ++)
                renderer.drawDay(canvas , week.days[i]);
        }
    }
}
