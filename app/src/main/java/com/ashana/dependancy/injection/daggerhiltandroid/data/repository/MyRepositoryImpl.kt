package com.ashana.dependancy.injection.daggerhiltandroid.data.repository

import android.app.Application
import com.ashana.dependancy.injection.daggerhiltandroid.R
import com.ashana.dependancy.injection.daggerhiltandroid.data.remote.MainApi
import com.ashana.dependancy.injection.daggerhiltandroid.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MainApi,
    private val context: Application
): MyRepository {

    init {
        val appName = context.getString(R.string.app_name)
        println("HILT. Hello, this is how application context injected in: $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }

    override fun printSomething(){
        println("HILT. This is repository impl printing something")
    }
}