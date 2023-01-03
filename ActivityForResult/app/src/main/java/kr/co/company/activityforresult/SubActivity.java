package kr.co.company.activityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    EditText edit;
    private TextView text;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sub);

        text=(TextView) findViewById(R.id.textView4);
        edit=(EditText) findViewById(R.id.editTextDate4);
        Button button_ok=(Button)findViewById(R.id.button2);

        Intent intent = getIntent();
        text.setText(""+intent.getIntExtra("number1", 0)+"+"+intent.getIntExtra("number2",0)+": ");
        button_ok.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent();
                intent.putExtra("RESULT", Integer.parseInt(edit.getText().toString()));
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        Button button_cancel=(Button)findViewById(R.id.button3);
        button_cancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}
