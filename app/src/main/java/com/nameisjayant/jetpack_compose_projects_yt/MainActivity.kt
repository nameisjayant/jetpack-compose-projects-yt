package com.nameisjayant.jetpack_compose_projects_yt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.ui.ChatUIScreen
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.ui.InstagramHomeScreen
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.JetpackComposeProjectsYTTheme
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_12

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(gray_12.toArgb(), gray_12.toArgb()),
            navigationBarStyle = SystemBarStyle.auto(gray_12.toArgb(), gray_12.toArgb())
        )
        setContent {
            JetpackComposeProjectsYTTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    InstagramHomeScreen(
                        modifier = Modifier
                            .background(gray_12)
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}