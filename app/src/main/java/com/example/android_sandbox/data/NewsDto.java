package com.example.android_sandbox.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class NewsDto {

    @Expose
    private int totalResults;
    @SerializedName("articles")
    @Expose
    private List<NewsInfoDto> newsInfoDtoList;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsInfoDto> getNewsInfoDtoList() {
        return newsInfoDtoList;
    }

    public void setNewsInfoDtoList(List<NewsInfoDto> newsInfoDtoList) {
        this.newsInfoDtoList = newsInfoDtoList;
    }

    public static class NewsInfoDto {

        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String text;
        @SerializedName("publishedAt")
        @Expose
        private Date date;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

}
