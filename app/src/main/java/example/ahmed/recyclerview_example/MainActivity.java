package example.ahmed.recyclerview_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linear = new LinearLayoutManager(this);

        GridLayoutManager grid = new GridLayoutManager(this,2);

        recyclerView.setLayoutManager( linear );




        ArrayList<ImageData> list = new ArrayList<>();

        list.add(new ImageData("a","b"));
        list.add(new ImageData("c","d"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("c","d"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("c","d"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("c","d"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("c","d"));
        list.add(new ImageData("a","b"));
        list.add(new ImageData("c","d"));
        list.add(new ImageData("a","b"));

        RecyclerAdapter adapter = new RecyclerAdapter(list);


        recyclerView.setAdapter(adapter);

    }
}
