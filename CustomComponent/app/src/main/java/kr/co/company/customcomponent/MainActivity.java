package kr.co.company.customcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;

@SuppressLint("AppCompatCustomView")
public class VolumeControll extends ImageView implements View.OnTouchListener{
    private double angle=0.0;//각도를 저장할 변수
    private KnobListener listener; //해당 뷰에서 이벤트를 감지할 리스너 객체 생성
    float x, y;//터치한 지점의 x와 y의 좌표
    float mx, my;//회전 각도를 위한 값

    public VolumeControll(Context context){
        super(context);
        this.setImageResource(R.drawable.knob);
        this.setOnTouchListener(this);
    }
    public VolumeControll(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
        this.setImageResource(R.drawable.knob);
        this.setOnTouchListener(this);
    }
    public interface KnobListener{
        public void onchanged(double angle);
    }
    public void setKnobListener(KnobListener lis){
        listener=lis;
    }

}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar rb=(RatingBar)findViewById(R.id.ratingBar);
        VolumeControll view=(VolumeControll) findViewById(R.id.vc);
        view.setKnobListener(new VolumeControll.KnobListener(){
            @Override
            public void onChanged(double angle){
                float rating=rb.getRating();
                if(angle>0&&rating<7.0){
                    //오른쪽으로 회전
                    rb.setRating(rating+0.5f);
                    Log.v("현재 별점", String.valueOf(rb.getRating()));
                }else if(rating>0.0){
                    //왼쪽으로 회전
                    rb.setRating(rating-0.5f);
                    Log.v("현재 별점", String.valueOf(rb.getRating()));
                }
            }
        });
    }
}