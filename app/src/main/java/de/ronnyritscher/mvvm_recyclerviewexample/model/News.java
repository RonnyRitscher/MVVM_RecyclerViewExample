package de.ronnyritscher.mvvm_recyclerviewexample.model;

public class News {

    public String Title, Desc;

    //Constructor
    public News() {
    }
    public News(String title, String desc) {
        Title = title;
        Desc = desc;
    }


    //Getter/Setter

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
