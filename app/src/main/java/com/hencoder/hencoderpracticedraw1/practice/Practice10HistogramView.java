package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    String[] mStrings = new String[]{"Froyo","GB","ICS","JB","KitKat","L","M"};
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3f);
        canvas.drawLine(100,20,100,500,paint);
        canvas.drawLine(100,500,500,500,paint);
        //绘制Froyo
        paint.setColor(Color.WHITE);
        paint.setTextSize(20f);
        canvas.drawText(mStrings[0],130,520,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(128,52,148,500,paint);
        //绘制GB

        canvas.drawText(mStrings[1],160,520,paint);
        canvas.drawRect(158,50,178,500,paint);




    }
}
