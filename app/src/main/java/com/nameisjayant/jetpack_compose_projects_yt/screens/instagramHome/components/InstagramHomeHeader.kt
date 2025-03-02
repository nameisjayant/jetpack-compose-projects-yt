package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nameisjayant.jetpack_compose_projects_yt.R
import com.nameisjayant.jetpack_compose_projects_yt.components.AppIcon
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_12

@Composable
fun InstagramHomeHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .background(gray_12)
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        AppIcon(icon = R.drawable.camera_icon, modifier = Modifier.size(22.dp))
        AppIcon(icon = R.drawable.instagram_logo)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppIcon(icon = R.drawable.igtv, modifier = Modifier.size(22.dp))
            AppIcon(icon = R.drawable.share, modifier = Modifier.size(22.dp))
        }
    }
}