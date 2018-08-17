package com.example.android_sandbox.presentation;

import com.example.android_sandbox.domain.NewsInteractor;

import java.util.ArrayList;
import java.util.Collections;

public class NewsPresenter implements Presenter {

    private final NewsInteractor newsInteractor;
    private final NewsView newsView;

    public NewsPresenter(NewsInteractor newsInteractor, NewsView newsView) {
        this.newsInteractor = newsInteractor;
        this.newsView = newsView;
    }

    @Override
    public void initPresenter() {
        newsInteractor.getNews().subscribe(
                news -> newsView.setNews(news),
                throwable -> newsView.setNews(Collections.emptyList()));
    }

}
