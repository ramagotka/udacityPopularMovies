package com.example.android.popularmovies;

import java.io.Serializable;

/**
 * Created by hania on 02.02.16.
 */
public class MovieData implements Serializable {
    private String url;
    private String orginal_title;
    private String overview;
    private String vote_average;
    private String release_date;
    private String popularity;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrginal_title() {
        return orginal_title;
    }

    public void setOrginal_title(String orginal_title) {
        this.orginal_title = orginal_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
}
