package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components.ChatHeader
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components.ChatLine
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components.ChatRow
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components.ChatSearchbar
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components.chatStoryList
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components.chattingList


@Composable
fun ChatUIScreen(modifier: Modifier = Modifier) {

    ChatRow(
        modifier = modifier,
        header = {
            ChatHeader()
        },
        searchBar = {
            ChatSearchbar()
        },
        stories = {
            chatStoryList()
        },
        line = {
            ChatLine()
        },
        chats = {
            chattingList()
        }
    )
}