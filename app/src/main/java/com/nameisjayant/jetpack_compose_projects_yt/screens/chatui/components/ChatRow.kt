package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ChatRow(
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    searchBar: (@Composable () -> Unit)? = null,
    stories: (LazyListScope.() -> Unit)? = null,
    line: (@Composable () -> Unit)? = null,
    chats: (LazyListScope.() -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .padding(vertical = 24.dp)
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        header?.invoke()
        searchBar?.invoke()
        LazyRow(
            contentPadding = PaddingValues(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            stories?.invoke(this)
        }
        line?.invoke()
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            contentPadding = PaddingValues(horizontal = 24.dp)
        ) {
            chats?.invoke(this)
        }
    }
}