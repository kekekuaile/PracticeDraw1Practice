package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

        Paint paint = new Paint();
    Paint paint1 = new Paint();
    Paint paint2 = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawCircle(20,20,20,paint);
            paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(60,20,20,paint);
        paint1.setColor(Color.BLUE);
        canvas.drawCircle(20,60,20,paint1);
        paint2.setStrokeWidth(20);
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(60,60,20,paint2);

    }
}
