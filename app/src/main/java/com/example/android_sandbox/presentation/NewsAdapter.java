package com.example.android_sandbox.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android_sandbox.R;
import com.example.android_sandbox.domain.News;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MainViewHolder> {

    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    private List<News> newsList;

    public NewsAdapter() {
        newsList = new ArrayList();
    }

    public NewsAdapter(List<News> newsList) {
        this.newsList = newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_element, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(newsList.get(position));
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView text;
        private TextView date;

        public MainViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            text = view.findViewById(R.id.text);
            date = view.findViewById(R.id.date);
        }

        private void bind(News news) {
            title.setText(news.getTitle());
            text.setText(news.getText());
            date.setText(DATE_FORMAT.format(news.getDate()));
        }

    }

}
