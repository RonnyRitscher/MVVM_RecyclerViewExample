package de.ronnyritscher.mvvm_recyclerviewexample.viewModel;

import de.ronnyritscher.mvvm_recyclerviewexample.model.News;

public class NewsModel {

    public String Title , Desc;

    //Constructor  (inhalt der einzelnen News übergeben)
    public NewsModel(News news) {
        this.Title = news.Title;
        this.Desc = news.Desc;
    }
    public NewsModel() {
    }





}
