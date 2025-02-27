package com.nameisjayant.jetpack_compose_projects_yt.components


import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun AppImage(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
    contentScale: ContentScale = ContentScale.Crop
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = modifier,
        contentScale = contentScale
    )
}