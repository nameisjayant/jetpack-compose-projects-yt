package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_54

@Composable
fun InstaLine(
    modifier: Modifier = Modifier
) {
    Spacer(
        modifier = modifier
            .background(gray_54)
            .fillMaxWidth()
            .height(0.2.dp)
    )
}