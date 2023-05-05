package com.ashana.dependancy.injection.daggerhiltandroid

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp //to make application context as a di
class MyApplication: Application() {
}