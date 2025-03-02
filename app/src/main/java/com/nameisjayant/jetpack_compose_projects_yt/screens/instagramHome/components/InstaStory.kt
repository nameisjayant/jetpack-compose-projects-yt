package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.nameisjayant.jetpack_compose_projects_yt.components.AppIcon
import com.nameisjayant.jetpack_compose_projects_yt.components.AppText
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.domain.InstaStory
import com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.domain.instaStoryList
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_f9
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.interFont
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.story_gradient


@Composable
fun InstaStoryRow(
    modifier: Modifier = Modifier,
    data: InstaStory
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppIcon(
            icon = data.icon,
            modifier = modifier
                .size(56.dp)
                .drawBehind {
                    drawCircle(
                        brush = story_gradient,
                        style = Stroke(
                            width = 2.dp.toPx()
                        )
                    )
                }
                .padding(3.dp)
        )
        AppText(
            text = data.name, style = TextStyle(
                color = gray_f9,
                fontFamily = interFont,
                fontWeight = FontWeight.W400
            )
        )
    }
}

fun LazyListScope.instaStoryItemList() {
    items(instaStoryList, key = { it.id }) {
        InstaStoryRow(data = it)
    }
}