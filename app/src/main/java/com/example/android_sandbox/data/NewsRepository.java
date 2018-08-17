package com.example.android_sandbox.data;

import com.example.android_sandbox.domain.News;

import java.util.List;

import io.reactivex.Observable;

public interface NewsRepository {

    Observable<List<News>> getNews(String country, String category);

}
