package com.example.android_sandbox.data;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public enum ApiFactory {

    INSTANCE;

    private final NewsApi newsApi;

    ApiFactory() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        newsApi = retrofit.create(NewsApi.class);
    }

    public NewsApi getNewsApi() {
        return newsApi;
    }
}
