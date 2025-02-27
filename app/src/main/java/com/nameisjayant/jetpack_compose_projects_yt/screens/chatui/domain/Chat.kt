package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.domain

import androidx.annotation.DrawableRes
import com.nameisjayant.jetpack_compose_projects_yt.R

data class ChatModal(
    val id: Int,
    val name: String,
    @DrawableRes val image: Int,
    val isGroup: Boolean = false,
    val isTyping: Boolean = false,
    val messagePending: Boolean = false,
    val isDoubleTick: Boolean = false,
    val isOnline: Boolean = false,
    val message: String,
    val time: String,
    val receive: Boolean = true
)

val chatModalList = listOf(
    ChatModal(
        1,
        "John",
        R.drawable.photo,
        message = "Ovlia is typing...",
        time = "12:35",
        isDoubleTick = true,
        isOnline = true
    ),
    ChatModal(
        2,
        "Emily",
        R.drawable.photo_2,
        message = "Nice Work I love it.",
        time = "Yesterday",
        isTyping = true
    ),
    ChatModal(
        3,
        "Product Design",
        R.drawable.photo_3,
        message = "When the meeting is schedule",
        time = "Today",
        isDoubleTick = true,
        isGroup = true
    ),
    ChatModal(
        4,
        "Olivia",
        R.drawable.photo_3,
        message = "How are you?",
        time = "02:34",
        isDoubleTick = true,
        receive = false
    ),
    ChatModal(
        5, "Darcy", R.drawable.photo_5, message = "I am good!", time = "12/04/2024"
    ),
    ChatModal(
        6,
        "John",
        R.drawable.photo_5,
        message = "Good Work John",
        time = "01:40",
        isDoubleTick = true,
        receive = false
    ),
    ChatModal(
        7,
        "Emily",
        R.drawable.photo_6,
        message = "Nice to see you girl!l",
        time = "Yesterday",
        isDoubleTick = true

    ),
    ChatModal(
        8,
        "Ashely",
        R.drawable.photo_4,
        message = "Hey",
        time = "Today",
        isDoubleTick = true,
        isGroup = true
    ),
    ChatModal(
        9,
        "Olivia",
        R.drawable.photo_2,
        message = "How are you?",
        time = "02:34",
        isDoubleTick = true
    ),
)