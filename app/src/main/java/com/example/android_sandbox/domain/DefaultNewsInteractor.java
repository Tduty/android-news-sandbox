package com.example.android_sandbox.domain;

import com.example.android_sandbox.data.NewsRepository;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DefaultNewsInteractor implements NewsInteractor {

    private final static String COUNTRY = "us";
    private final static String CATEGORY = "business";

    private NewsRepository newsRepository;

    public DefaultNewsInteractor(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public Observable<List<News>> getNews() {
        return newsRepository.getNews(COUNTRY, CATEGORY)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

}
