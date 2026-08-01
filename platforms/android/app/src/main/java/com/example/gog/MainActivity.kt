package com.example.gog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gog.ui.theme.GogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        try {
            JffiAndroidInit.initNdkContext(applicationContext)
        } catch (e: UnsatisfiedLinkError) {
            // JffiAndroidInit not generated - ndk-context not needed
        }
        
        enableEdgeToEdge()
        setContent {
            GogTheme {

            }
        }
    }
}

