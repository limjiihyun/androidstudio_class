package kr.co.company.visualtool;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //버튼 선언
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 객체 생성
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                //rgb에 들어갈 변수 객체 생성
                int red=0;
                int blue=0;
                int green=0;
                //랜덤으로 값을 넣는다 0~255
                red=(int)(Math.random() * 255);
                blue=(int)(Math.random() * 255);
                green=(int)(Math.random() * 255);
                //버튼 색상 변경
                    button.setBackgroundColor(Color.rgb(red, green, blue));

            }//onClick()
        });//changeBtn.setOnClickListener
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                //rgb에 들어갈 변수 객체 생성
                int red=0;
                int blue=0;
                int green=0;
                //랜덤으로 값을 넣는다 0~255
                red=(int)(Math.random() * 255);
                blue=(int)(Math.random() * 255);
                green=(int)(Math.random() * 255);
                //버튼 색상 변경
                button2.setBackgroundColor(Color.rgb(red, green, blue));

            }//onClick()
        });//changeBtn.setOnClickListener
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                //rgb에 들어갈 변수 객체 생성
                int red=0;
                int blue=0;
                int green=0;
                //랜덤으로 값을 넣는다 0~255
                red=(int)(Math.random() * 255);
                blue=(int)(Math.random() * 255);
                green=(int)(Math.random() * 255);
                //버튼 색상 변경
                button3.setBackgroundColor(Color.rgb(red, green, blue));

            }//onClick()
        });//changeBtn.setOnClickListener
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                //rgb에 들어갈 변수 객체 생성
                int red=0;
                int blue=0;
                int green=0;
                //랜덤으로 값을 넣는다 0~255
                red=(int)(Math.random() * 255);
                blue=(int)(Math.random() * 255);
                green=(int)(Math.random() * 255);
                //버튼 색상 변경
                button4.setBackgroundColor(Color.rgb(red, green, blue));

            }//onClick()
        });//changeBtn.setOnClickListener
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                //rgb에 들어갈 변수 객체 생성
                int red=0;
                int blue=0;
                int green=0;
                //랜덤으로 값을 넣는다 0~255
                red=(int)(Math.random() * 255);
                blue=(int)(Math.random() * 255);
                green=(int)(Math.random() * 255);
                //버튼 색상 변경
                button5.setBackgroundColor(Color.rgb(red, green, blue));

            }//onClick()
        });//changeBtn.setOnClickListener
    }//onCreate()

}