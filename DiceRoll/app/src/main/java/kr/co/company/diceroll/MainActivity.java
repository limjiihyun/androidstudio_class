package kr.co.company.diceroll;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    Button button;
    int[] diceArray = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four,
            R.drawable.five, R.drawable.six};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //화면구성 사용선언
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button);

        //버튼 클릭시 이벤트
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Random 함수 선언
                Random ran = new Random();
                //6개의 이미지 중에 랜덤으로 하나 생성
                int num1 = ((Random) ran).nextInt(6);
                int num2 = ((Random) ran).nextInt(6);
                //랜덤으로 생성한 값을 imageview자리에 출력한다
                imageView.setImageResource(diceArray[num1]);
                imageView2.setImageResource(diceArray[num2]);
            }
        });
    }
}



