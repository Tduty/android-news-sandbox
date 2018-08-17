package com.example.android_sandbox.data;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {

    @GET("top-headlines")
    Observable<NewsDto> getTopNews(@Query("country") String country,
                                   @Query("category") String category,
                                   @Query("apiKey") String key);

}
