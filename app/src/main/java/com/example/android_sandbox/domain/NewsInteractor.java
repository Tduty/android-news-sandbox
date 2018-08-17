package com.example.android_sandbox.domain;

import java.util.List;

import io.reactivex.Observable;

public interface NewsInteractor {

    Observable<List<News>> getNews();

}
