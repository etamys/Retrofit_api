package com.example.api_data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface api {
    String BASE_URL = "http://mysita.com/app/api/index.php/";

    @Headers("Content-Type: application/json")
    @GET("LGLTaxLawyerList")
    Call<data> getdata();
}
