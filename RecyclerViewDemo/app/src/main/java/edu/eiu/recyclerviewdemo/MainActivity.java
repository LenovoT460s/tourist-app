package edu.eiu.recyclerviewdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import edu.eiu.recyclerviewdemo.datamodel.WikipediaPage;

public class MainActivity extends AppCompatActivity {

    private TouristRecyclerAdapter touristRecyclerAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //setup RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        //handles places View Model
        LiveData<List<WikipediaPage>> liveData = ViewModelProviders.of(this).get(PlacesViewModel.class).getTouristSitesData();

        //this will listen to anything and make changes when needed
        liveData.observe(this, new Observer<List<WikipediaPage>>() {
            @Override
            public void onChanged(@Nullable List<WikipediaPage> data_shops) {

                touristRecyclerAdapter = new TouristRecyclerAdapter(data_shops);

                recyclerView.setAdapter(touristRecyclerAdapter);

            }
        });




    }

}
