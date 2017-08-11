package com.frogermcs.recipes.dagger_activities_multibinding.widget;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

public class Pen {
    Paint paint;
    TextPaint paintText;
    private int curStep;

    public Pen() {
        initPaint();
    }

    private void initPaint() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintText = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    }

    public void resetData(int width, int height) {

    }

    public void initData(int curStep) {
        this.curStep = curStep;
    }

    public void onDraw(Canvas canvas) {
        
    }
}
