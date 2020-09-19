package com.application.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.application.customlistview.adapter.MyListAdapter;
import com.application.customlistview.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Hero> heroList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callItem();
        addItemToArray();

        MyListAdapter adapter = new MyListAdapter(this, R.layout.list_item, heroList);
        listView.setAdapter(adapter);
    }

    public void callItem() {
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
    }

    public void addItemToArray() {
        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "InjusticeGang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));
    }
}