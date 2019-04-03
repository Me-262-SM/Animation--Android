package com.edu.sicnu.cs.zzy.animation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircleView extends View {
    private int paintColor = Color.RED;
    private float strokeWidth = 10;
    private int count=0;

    public int getPaintColor() {
        return paintColor;
    }

    public float getStrokeWidth() {
        return strokeWidth;
    }

    public void setPaintColor(int paintColor) {
        this.paintColor = paintColor;
        invalidate();   //
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public CircleView(Context context) {
        super(context);
    }

    public void Increment(){
        count++;
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.CircleView);
        paintColor = typedArray.getColor(R.styleable.CircleView_color,Color.RED);
        strokeWidth = typedArray.getFloat(R.styleable.CircleView_stroke,10);
        //这样XML文件可以修改属性
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(paintColor);
        paint.setStrokeWidth(strokeWidth);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(100);

        float radius = getWidth() > getHeight()?getHeight()/2 : getWidth()/2;
        radius = radius - paint.getStrokeWidth();
        canvas.drawCircle(getWidth()/2,getHeight()/2,radius,paint);
        canvas.drawText(""+count,getWidth()/2,getHeight()/2,paint);
    }
}
