package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.domain

import androidx.annotation.DrawableRes
import com.nameisjayant.jetpack_compose_projects_yt.R

data class InstaStory(
    val id: Int, val name: String, @DrawableRes val icon: Int
)


val instaStoryList = listOf(
    InstaStory(
        1, "Your Story", R.drawable.photo_3
    ), InstaStory(
        2, "Karanne", R.drawable.photo_6,
    ), InstaStory(
        3, "Zackjohn", R.drawable.photo_4
    ), InstaStory(
        4, "koren", R.drawable.photo_5
    ), InstaStory(
        5, "Neneo", R.drawable.photo
    ), InstaStory(
        6, "nameen", R.drawable.photo_4
    ), InstaStory(
        7, "Zackjohn", R.drawable.photo_2
    )
)