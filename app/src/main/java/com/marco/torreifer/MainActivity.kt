package com.marco.torreifer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.marco.torreifer.ui.theme.TorreiferTheme
import com.marco.torreifer.ui.view.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            TorreiferTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    HomeScreen()
                }

            }
        }
    }
}