package kr.co.company.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton button1, button2, button3;
    Button button;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mainactivity.xml에 설정된 뷰 가져옴
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button1 = (RadioButton) findViewById(R.id.radioButton3);
        button2 = (RadioButton) findViewById(R.id.radioButton2);
        button3 = (RadioButton) findViewById(R.id.radioButton);
        button = (Button) findViewById(R.id.button);
        image = (ImageView) findViewById(R.id.imageView);

        View.OnClickListener listener=new View.OnClickListener() {
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId())//라디오그룹의 체크되어있는 부분에 따라
                {
                    //각 라디오버튼의 그림이 나오게함
                    case R.id.radioButton:
                        image.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radioButton2:
                        image.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioButton3:
                        image.setImageResource(R.drawable.bird);
                        break;
                }
            }
        };
        button.setOnClickListener(listener);

    }
}