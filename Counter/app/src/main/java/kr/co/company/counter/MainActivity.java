package kr.co.company.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main-Activity";

    private TextView tvCount;
    private Button btnAdd, btnMinus, btninit;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.textView);
        tvCount.setText(count + "");
        btnAdd = findViewById(R.id.button);
        btnMinus = findViewById(R.id.button2);
        btninit = findViewById(R.id.button3);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: btnAdd : " + v.getClass().getName());
                count++;
                tvCount.setText(count + "");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 0) {
                    count--;
                    tvCount.setText(count + "");
                }
            }
        });
        btninit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>0)
                    count=0;
                    tvCount.setText(count +"");
            }
        });
    }
}