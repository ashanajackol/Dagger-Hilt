package com.ashana.dependancy.injection.daggerhiltandroid.data.remote

import retrofit2.http.GET

interface MainApi {

    @GET("test")
    suspend fun doNetworkCall()
}