package com.ashana.dependancy.injection.daggerhiltandroid.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
    fun printSomething()
}