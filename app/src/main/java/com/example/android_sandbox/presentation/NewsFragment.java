package com.example.android_sandbox.presentation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android_sandbox.R;
import com.example.android_sandbox.data.RxNewsRepository;
import com.example.android_sandbox.domain.DefaultNewsInteractor;
import com.example.android_sandbox.domain.News;

import java.util.List;

public class NewsFragment extends Fragment implements NewsView {

    private Presenter presenter;

    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        initRecyclerView(view);
        presenter = new NewsPresenter(new DefaultNewsInteractor(new RxNewsRepository()), this);
        presenter.initPresenter();
        return view;
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.main_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        newsAdapter = new NewsAdapter();
        recyclerView.setAdapter(newsAdapter);
    }

    @Override
    public void setNews(List<News> newsList) {
        newsAdapter.setNewsList(newsList);
        newsAdapter.notifyDataSetChanged();
    }

    public static Fragment newInstance() {
        return new NewsFragment();
    }

}
