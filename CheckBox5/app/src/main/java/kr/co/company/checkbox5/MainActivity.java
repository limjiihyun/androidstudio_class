package kr.co.company.checkbox5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview1, imageview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview1 = (ImageView) findViewById(R.id.imageView);
        imageview2 = (ImageView) findViewById(R.id.imageView2);
    }
    public void onCheckboxClicked(View view){
        boolean checked=((CheckBox)view).isChecked();
        switch(view.getId()){
            case R.id.checkBox:
                if(checked)imageview1.setImageResource(R.drawable.sandwich);
                else imageview1.setImageResource(0);
                break;
            case R.id.checkBox2:
                if(checked)imageview2.setImageResource(R.drawable.cheese);
                else imageview2.setImageResource(0);
                break;
        }
    }
}