package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components.InstaLine
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components.InstagramHomeHeader
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components.InstagramHomeRow
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components.instaStoryItemList
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components.postListItem

@Composable
fun InstagramHomeScreen(
    modifier: Modifier = Modifier
) {
    InstagramHomeRow(
        modifier = modifier,
        header = {
            InstagramHomeHeader()
        },
        stories = {
            instaStoryItemList()
        },
        line = {
            InstaLine()
        },
        posts ={
            postListItem()
        }
    )
}