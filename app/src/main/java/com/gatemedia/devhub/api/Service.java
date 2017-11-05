package com.gatemedia.devhub.api;

import com.gatemedia.devhub.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tunji on 15/09/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();

}
