package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.line_gradient


@Composable
fun ChatLine(
    modifier: Modifier = Modifier
) {
    Spacer(
        modifier = modifier
            .background(
                brush = line_gradient
            )
            .fillMaxWidth()
            .height(0.5.dp)
    )
}