package com.ingeniovirtual.pasaporteidec2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ingeniovirtual.pasaporteidec2.navigation.AppNavigation
import com.ingeniovirtual.pasaporteidec2.ui.theme.PasaporteIDEC2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PasaporteIDEC2Theme {
                AppNavigation()
            }
        }
    }
}
