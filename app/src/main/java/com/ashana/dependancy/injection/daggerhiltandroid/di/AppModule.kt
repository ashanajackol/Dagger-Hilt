package com.ashana.dependancy.injection.daggerhiltandroid.di

import android.app.Application
import com.ashana.dependancy.injection.daggerhiltandroid.data.remote.MainApi
import com.ashana.dependancy.injection.daggerhiltandroid.data.repository.MyRepositoryImpl
import com.ashana.dependancy.injection.daggerhiltandroid.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //all the di's live long as application exists
object AppModule {

    @Provides //define this is a dependency (MainApi)
    @Singleton //only one instance of 'MainApi' is created for the entire app
    fun provideMainApi(): MainApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MainApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(
        api: MainApi,
        app: Application,
        @Named("string1")stringOne: String): MyRepository {
        return MyRepositoryImpl(api, app)
    }

    /**
     * when there are multiple dependancies with same type
     * we can separate them by using @Named annotation
     * usage - check above 'provideMyRepository' function
     */
    @Provides
    @Singleton
    @Named("string1")
    fun provideStringOne() = "String One"

    @Provides
    @Singleton
    @Named("string2")
    fun provideStringTwo() = "String Two"
}