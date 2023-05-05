 package com.ashana.dependancy.injection.daggerhiltandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ashana.dependancy.injection.daggerhiltandroid.ui.theme.DaggerHiltAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

 @AndroidEntryPoint //if we need to inject something to the android components (Activities, Fragments, Services..which comes with the android framework)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltAndroidTheme {

                val viewModel: MainViewModel by viewModels()
                viewModel.printSomethingFromRepository()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaggerHiltAndroidTheme {
        Greeting("Android")
    }
}