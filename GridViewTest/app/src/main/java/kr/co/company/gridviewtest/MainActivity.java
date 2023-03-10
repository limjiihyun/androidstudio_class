package kr.co.company.gridviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
        MyAdapter.ItemClickListener{

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.rview);
        int columns=3;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position){
        Log.i("TAG", "item: "+adapter.getItem(position)+"number: "+ position);
    }
}
