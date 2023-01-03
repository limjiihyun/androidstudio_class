package kr.co.company.imagebutton2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageview=(ImageView)findViewById(R.id.imageView);
        ImageButton button1=(ImageButton)findViewById(R.id.imageButton2);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imageview.setImageResource(R.drawable.image1);
            }
        });
        ImageButton button2=(ImageButton)findViewById(R.id.imageButton3);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imageview.setImageResource(R.drawable.image2);
            }
        });
    }
}