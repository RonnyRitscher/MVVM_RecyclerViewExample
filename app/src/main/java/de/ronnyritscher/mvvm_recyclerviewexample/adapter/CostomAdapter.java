package de.ronnyritscher.mvvm_recyclerviewexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.ronnyritscher.mvvm_recyclerviewexample.R;
import de.ronnyritscher.mvvm_recyclerviewexample.databinding.NewsBinding;
import de.ronnyritscher.mvvm_recyclerviewexample.model.News;
import de.ronnyritscher.mvvm_recyclerviewexample.viewModel.NewsModel;

//0. Class extends Adapter
//1. innerClass xView mit ViewHolder erstellen
//2. Class extends our View
//4. implement Methods
//5. List erstellen und die sice in getItemCount angeben!
//6. View und Layout
//7. create and return out new (Costom)View

//9. Fields of Item in CostomView
//8. Binding in Holder
//10. get List (newsList)
//11. binde die Daten und die TextViews


public class CostomAdapter extends RecyclerView.Adapter<CostomAdapter.CostomView> { //0,2

    private static final String TAG = CostomAdapter.class.getSimpleName();

    //Fields
    List<NewsModel> newsList; //change News -> NewsModel
    private LayoutInflater layoutInflater;

    //Constructor (empty)
    public CostomAdapter(List<NewsModel> newsList) {

        this.newsList = newsList;
    }

    @NonNull
    @Override
    public CostomView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //LAYOUT  ->
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_layout , viewGroup , false);//6
//        return new CostomView(view);//7

        //return new CostomView(view);

        //changes**
        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(viewGroup.getContext()); //ünergebe den Context
        }

        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater , viewGroup , false);  //Hier das Layout inflaten
        return new CostomView(newsBinding); //
    }

    @Override
    public void onBindViewHolder(@NonNull CostomView holder, int position) {


        //Binding in Holder
//        News news = newsList.get(position);//11
//        holder.title.setText(news.getTitle());//11
//        holder.desc.setText(news.getDesc());//11

        //now Bind our Data    (lessCode)
        NewsModel newsModel = newsList.get(position);
        holder.bind(newsModel);   //übergebe das newsModel

    }

    @Override
    public int getItemCount() {
        return newsList.size(); //5
    }

    public class CostomView extends RecyclerView.ViewHolder { //1

        //NewsBinding
        private NewsBinding newsBinding;

        //Fields of Item
        //TextView title,  desc; **

        public CostomView(NewsBinding newsBinding) {  //change the View itemView-> NewsBinding newsBinding
            super(newsBinding.getRoot());  //itemView -> newsBinding.getRoot()

            //**Durch das Binding brauchen wir die spezifischen TextView initialisierungen nicht mehr
            this.newsBinding = newsBinding;
            //title = itemView.findViewById(R.id.rv_title); **
            //desc = itemView.findViewById(R.id.rv_desc); **

        }

        //innerClass zum Binding
        public void bind(NewsModel newsModel){
            this.newsBinding.setNewsview(newsModel);
        }

        //um auf newsBinding außerhalb zugreifen zu können:
        public NewsBinding getNewsBinding(){
            return newsBinding;
        }
    }
}
