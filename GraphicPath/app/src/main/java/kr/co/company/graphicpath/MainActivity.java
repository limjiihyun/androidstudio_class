package kr.co.company.graphicpath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

    class GraphicPath extends View {
    public GraphicPath(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }
    public GraphicPath(Context context, AttributeSet attrs){
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        Paint paint = new Paint();

        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(20, 400);
        path.lineTo(300, 800);
        path.cubicTo(450, 120, 600, 1200, 900, 800);

        paint.setColor(Color.BLUE);
        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setTextSize(200);
        canvas.drawTextOnPath("This is a test!!", path, 0, 0, paint);
    }
}


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            GraphicPath w= new GraphicPath(this);
            setContentView(w);

        }

    }
