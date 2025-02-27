package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.jetpack_compose_projects_yt.components.AppIcon
import com.nameisjayant.jetpack_compose_projects_yt.components.AppText
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.domain.Story
import com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.domain.storyData
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.interFont
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.photo_gradient
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.violet_a4


@Composable
fun ChatStoryRow(
    modifier: Modifier = Modifier,
    data: Story
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppIcon(icon = data.icon, modifier = Modifier
            .size(50.dp)
            .drawBehind {
                drawCircle(
                    brush = photo_gradient,
                    style = Stroke(
                        width = 2.dp.toPx()
                    )
                )
            }
            .padding(2.dp)
        )
        AppText(
            text = data.name, style = TextStyle(
                fontSize = 13.sp,
                color = violet_a4,
                fontFamily = interFont,
                fontWeight = FontWeight.W400
            )
        )
    }
}

fun LazyListScope.chatStoryList() {
    items(storyData, key = { it.id }) {
        ChatStoryRow(data = it)
    }
}