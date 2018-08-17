package com.example.android_sandbox.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.reactivex.Observable;

public class StubNewsInteractor implements NewsInteractor {

    private final static int AMOUNT_NEWS = 15;
    private final static String EXAMPLE_TITLE = "Example ";
    private final static String RANDOM_TEXT = "Not far stuff she think the jokes. " +
            "Going as by do known noise he wrote round leave. Warmly put branch " +
            "people narrow see. Winding its waiting yet parlors married own feeling. " +
            "Marry fruit do spite jokes an times. Whether at it unknown warrant herself " +
            "winding if. Him same none name sake had post love. An busy feel form hand am up help. " +
            "Parties it brother amongst an fortune of. Twenty behind wicket why age now itself ten.";
    private final static Date EXAMPLE_DATE = new Date();

    private List<News> newsList;

    public StubNewsInteractor() {
        newsList = new ArrayList<>();
        for (int i = 1; i <= AMOUNT_NEWS; i++)
            newsList.add(new News(EXAMPLE_TITLE + i, RANDOM_TEXT, EXAMPLE_DATE));
    }

    @Override
    public Observable<List<News>> getNews() {
        return Observable.just(newsList);
    }

}
