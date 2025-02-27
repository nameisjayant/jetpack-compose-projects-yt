package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.domain

import androidx.annotation.DrawableRes
import com.nameisjayant.jetpack_compose_projects_yt.R

data class Story(
    val id: Int,
    val name: String,
    @DrawableRes val icon: Int
)
val storyData = listOf(
    Story(
        1,
        "John",
        R.drawable.photo_2
    ),
    Story(
        2,
        "Emily",
        R.drawable.photo_3
    ),
    Story(
        3,
        "Ashley",
        R.drawable.photo_4
    ),
    Story(
        4,
        "Travis",
        R.drawable.photo_5
    ),
    Story(
        5,
        "Paul",
        R.drawable.photo_6
    ),
    Story(
        6,
        "John",
        R.drawable.photo_3
    ),
    Story(
        7,
        "Emily",
        R.drawable.photo
    )
)
