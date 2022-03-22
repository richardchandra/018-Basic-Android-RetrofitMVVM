package com.example.a018retrofitmvvm.api

import com.example.a018retrofitmvvm.models.ResponseApi
import com.example.a018retrofitmvvm.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int

    ): Response<ResponseApi>

}