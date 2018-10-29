package com.appsolutions.initializer.repo;

import com.appsolutions.initializer.model.MovieData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RepoService {

    @GET("?apikey=5df1c91c&t={title}&y={year}&plot=short&r=json")
    Call<MovieData> getMovieWithYear(@Path("title") String title, @Path("year") String year);

    @GET("?apikey=5df1c91c&t={title}&plot=short&r=json")
    Call<MovieData> getMovie(@Path("title") String title);
}
