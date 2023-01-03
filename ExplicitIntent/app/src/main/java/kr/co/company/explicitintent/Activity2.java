package kr.co.company.explicitintent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        Button button2 = (Button) findViewById(R.id.Button01);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });
    }
}

