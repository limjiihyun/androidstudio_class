package kr.co.company.chap8lab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import androidx.annotation.Nullable;

import java.util.jar.Attributes;

public class MyView {
    private Paint makePaint(int color){
        Paint p=new Paint();
        p.setColor(color);
        return (p);
    };
    private Paint[] mForegrounds={
            makePaint(Color.BLACK), makePaint(Color.BLUE),
            makePaint(Color.RED), makePaint(Color.GREEN)
    };
    public MyView(Context context){
        super(context);
    }
    public MyView(Context context, @Nullable Attributes attrs){
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.YELLOW);
        canvas.drawColor(Color.YELLOW);
        int width = canvas.getWidth();
        int height= canvas.getHeight();

        //20개 랜덤 원 그리기
        for(int i=0; i<20;i++){
            float x=r.nextInt(width);

        }
    }
}
