package com.marco.torreifer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.marco.torreifer.ui.theme.TorreiferTheme
import com.marco.torreifer.ui.view.MainContest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            TorreiferTheme {
                MainContest()
            }
        }
    }
}

