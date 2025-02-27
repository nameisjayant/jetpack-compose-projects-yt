package com.nameisjayant.jetpack_compose_projects_yt.screens.chatui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.jetpack_compose_projects_yt.R
import com.nameisjayant.jetpack_compose_projects_yt.components.AppIcon
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.black_1a
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.interFont
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.red_eb


@Composable
fun ChatHeader(
    modifier: Modifier = Modifier
) {
    val text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = black_1a,
                fontFamily = interFont,
                fontWeight = FontWeight.W500,
                fontSize = 16.sp
            )
        ) {
            append(stringResource(R.string.hello))
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                color = black_1a,
                fontFamily = interFont,
                fontWeight = FontWeight.W600,
                fontSize = 16.sp
            )
        ) {
            append(stringResource(R.string.david))
        }
    }

    Row(
        modifier = modifier.padding(horizontal = 24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppIcon(
                icon = R.drawable.photo, modifier = Modifier.size(46.dp)
            )
            Text(text)
        }
        Box {
            AppIcon(icon = R.drawable.notification, modifier = Modifier.size(24.dp))
            Spacer(
                modifier = Modifier
                    .size(8.dp)
                    .background(
                        red_eb, CircleShape
                    )
                    .align(Alignment.TopEnd),
            )
        }

    }
}