package de.ronnyritscher.mvvm_recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.ronnyritscher.mvvm_recyclerviewexample.adapter.CostomAdapter;
import de.ronnyritscher.mvvm_recyclerviewexample.model.News;
import de.ronnyritscher.mvvm_recyclerviewexample.viewModel.NewsModel;


/**
 * in der Buld.gradle noch das dataBinding auf enabled setzen!
 */
public class MainActivity extends AppCompatActivity {

    //RecyclerView
    private RecyclerView recyclerView;

    //CostomAdapter & List
    private CostomAdapter costomAdapter;
    private List<NewsModel> newsList;   //change News -> NewsModel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Recyclerview
        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
        newsList = new ArrayList<>();

        costomAdapter = new CostomAdapter(newsList);
        recyclerView.setAdapter(costomAdapter);
        setData();

    }

    private void setData() {

        //Hier werden die daten geladen --> todo  Anbindung n die Datenbanken

        //Add over News
//        newsList.add(new News("Title 1" , "Description title 1 "));
//        newsList.add(new News("Title 2" , "Description title 2 "));
//        newsList.add(new News("Title 3" , "Description title 3 "));
//        newsList.add(new News("Title 4" , "Description title 4 "));
//        newsList.add(new News("Title 5" , "Description title 5 "));

        //change the adding
        //Add overNewsModel
        NewsModel newsModel = new NewsModel();
        newsModel.Title = "First Title";
        newsModel.Desc = "this is the first title";
        newsList.add(newsModel);

        NewsModel newsModel2 = new NewsModel();
        newsModel2.Title = "First Title";
        newsModel2.Desc = "this is the first title";
        newsList.add(newsModel2);


    }
}
