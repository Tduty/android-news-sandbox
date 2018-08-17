package com.example.android_sandbox.data;

import com.example.android_sandbox.domain.News;

import java.util.List;

import io.reactivex.Observable;

public class RxNewsRepository implements NewsRepository {

    private final static String API_KEY = "da7566d9c7fc481f9dba47cd49a1de2c";

    @Override
    public Observable<List<News>> getNews(String country, String category) {
        NewsApi newsApi = ApiFactory.INSTANCE.getNewsApi();
        return newsApi.getTopNews(country, category, API_KEY).flatMap(dto -> Observable.fromArray(NewsMapper.getNews(dto)));
    }

}
