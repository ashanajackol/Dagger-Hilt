package com.ashana.dependancy.injection.daggerhiltandroid

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.ashana.dependancy.injection.daggerhiltandroid.domain.repository.MyRepository
import javax.inject.Inject

//services cannot have constructors, so cannot constructor injection
class MyService: Service(){

    //field injection
    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
        repository.printSomething()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

}