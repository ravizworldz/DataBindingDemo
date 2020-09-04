package com.demo.databindingdemo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    //repositories?q=newyork
    @GET("repositories")
   fun getDataFromAPI(@Query("q")query : String):Call<RecyclerList>
}