//package com.ashana.dependancy.injection.daggerhiltandroid.di.repositoryModule
//
//import com.ashana.dependancy.injection.daggerhiltandroid.data.repository.MyRepositoryImpl
//import com.ashana.dependancy.injection.daggerhiltandroid.domain.repository.MyRepository
//import dagger.Binds
//import dagger.Module
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//abstract class MyRepositoryModule {
//
//    @Binds
//    @Singleton
//    abstract fun bindMyRepositoryModule(
//        myRepositoryImpl: MyRepositoryImpl
//    ): MyRepository
//}