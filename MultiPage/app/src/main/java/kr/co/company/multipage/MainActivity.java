package kr.co.company.multipage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onClick(View view){
            if(view.getId()==R.id.button1){
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
            if(view.getId()==R.id.button2){
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
            if(view.getId()==R.id.button3){
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }


    }

}