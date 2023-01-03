package kr.co.company.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bPlus=(Button)findViewById(R.id.button);
        Button bMinus=(Button)findViewById(R.id.button2);
        Button bMultiple=(Button)findViewById(R.id.button3);
        Button bDivide=(Button)findViewById(R.id.button4);
        EditText eText1=(EditText)findViewById(R.id.editTextDate);
        EditText eText2=(EditText)findViewById(R.id.editTextDate2);
        EditText eText3=(EditText)findViewById(R.id.editTextDate3);
        bPlus.setOnClickListener(e-> {
            String s1=eText1.getText().toString();
            String s2=eText2.getText().toString();
            int result=Integer.parseInt(s1)+Integer.parseInt(s2);
            eText3.setText(""+result);
        });
        bMinus.setOnClickListener(e-> {
            String s1=eText1.getText().toString();
            String s2=eText2.getText().toString();
            int result=Integer.parseInt(s1)-Integer.parseInt(s2);
            eText3.setText(""+result);
        });
        bMultiple.setOnClickListener(e-> {
            String s1=eText1.getText().toString();
            String s2=eText2.getText().toString();
            int result=Integer.parseInt(s1)*Integer.parseInt(s2);
            eText3.setText(""+result);
        });
        bDivide.setOnClickListener(e-> {
            String s1=eText1.getText().toString();
            String s2=eText2.getText().toString();
            int result=Integer.parseInt(s1)/Integer.parseInt(s2);
            eText3.setText(""+result);
        });

    }
}