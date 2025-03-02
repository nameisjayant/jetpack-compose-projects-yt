package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun InstagramHomeRow(
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    stories: (LazyListScope.() -> Unit)? = null,
    line: (@Composable () -> Unit)? = null,
    posts: (LazyListScope.() -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        header?.invoke()
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 10.dp)
        ) {
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    stories?.invoke(this)
                }
            }
            item {
                line?.invoke()
            }
            posts?.invoke(this)
        }
    }
}