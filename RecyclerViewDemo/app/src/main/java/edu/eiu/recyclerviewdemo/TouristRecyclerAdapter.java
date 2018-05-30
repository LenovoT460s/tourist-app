package edu.eiu.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import edu.eiu.recyclerviewdemo.datamodel.WikipediaPage;

public class TouristRecyclerAdapter extends RecyclerView.Adapter<TouristRecyclerAdapter.TouristHolder> {
    List<WikipediaPage> touristSites;

    public TouristRecyclerAdapter(List<WikipediaPage> touristSites) {
        this.touristSites = touristSites;
    }

    @NonNull
    @Override
    public TouristHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        TextView v = (TextView) inflater.inflate(R.layout.itemview, parent, false);

        TouristHolder holder = new TouristHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TouristHolder holder, int position) {
        WikipediaPage site = touristSites.get(position);
        holder.bindView(site);
    }

    @Override
    public int getItemCount() {
        return touristSites.size();
    }

    public static class TouristHolder extends RecyclerView.ViewHolder {
        private TextView view;

        public TouristHolder(View itemView) {
            super(itemView);
            this.view = (TextView) itemView;
        }

        public void bindView(WikipediaPage touristItem) {
            view.setText(touristItem.getTitle());
        }
    }
}