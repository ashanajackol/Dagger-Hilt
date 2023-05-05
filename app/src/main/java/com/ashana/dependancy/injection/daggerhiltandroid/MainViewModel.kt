package com.ashana.dependancy.injection.daggerhiltandroid

import androidx.lifecycle.ViewModel
import com.ashana.dependancy.injection.daggerhiltandroid.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor( //telling 'AppModule' to look for the injectors which in the constructor parameters
    private val repository: MyRepository
): ViewModel() {

    fun printSomethingFromRepository(){
        repository.printSomething()
    }
}