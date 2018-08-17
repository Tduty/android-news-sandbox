package com.example.android_sandbox.data;

import com.example.android_sandbox.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsMapper {

    public static List<News> getNews(NewsDto newsDto) {
        List<News> newsList = new ArrayList<>();
        for (NewsDto.NewsInfoDto newsInfoDto : newsDto.getNewsInfoDtoList())
            newsList.add(new News(newsInfoDto.getTitle(), newsInfoDto.getText(), newsInfoDto.getDate()));
        return newsList;
    }

}
