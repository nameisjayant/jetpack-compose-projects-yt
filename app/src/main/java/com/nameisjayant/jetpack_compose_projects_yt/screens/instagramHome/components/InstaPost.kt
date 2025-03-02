package com.nameisjayant.jetpack_compose_projects_yt.screens.instagramHome.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.jetpack_compose_projects_yt.R
import com.nameisjayant.jetpack_compose_projects_yt.components.AppIcon
import com.nameisjayant.jetpack_compose_projects_yt.components.AppImage
import com.nameisjayant.jetpack_compose_projects_yt.components.AppText
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.blue_38
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_54
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_99
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.gray_f9
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.interFont


@Composable
fun InstaUserProfile(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(
                horizontal = 16.dp
            )
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.weight(1f)

        ) {
            AppIcon(icon = R.drawable.photo_3, modifier = Modifier.size(32.dp))
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    AppText(
                        text = stringResource(R.string.joshua_i), style = TextStyle(
                            fontSize = 13.sp,
                            fontFamily = interFont,
                            fontWeight = FontWeight.W600,
                            color = gray_f9
                        )
                    )
                    AppIcon(icon = R.drawable.blue_tick, modifier = Modifier.size(9.dp))
                }
                AppText(
                    text = stringResource(R.string.tokoyo_japan), style = TextStyle(
                        fontSize = 11.sp,
                        fontFamily = interFont,
                        fontWeight = FontWeight.W400,
                        color = gray_f9
                    )
                )
            }
        }
        AppIcon(icon = R.drawable.more)
    }
}


@Composable
fun PostContentRow(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    HorizontalPager(
        modifier = modifier,
        state = pagerState
    ) {
        AppImage(image = R.drawable.post, modifier = Modifier.fillMaxWidth())
    }
}

@Composable
fun InstaPostAction(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppIcon(icon = R.drawable.like)
            AppIcon(icon = R.drawable.message)
            AppIcon(
                icon = R.drawable.share
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(pagerState.pageCount) {
                Spacer(
                    modifier = Modifier
                        .background(
                            color = if (pagerState.currentPage == it) blue_38 else gray_54,
                            shape = CircleShape
                        )
                        .size(8.dp)
                )
            }
        }
        AppIcon(
            icon = R.drawable.share
        )
    }
}

@Composable
fun PostDescriptionRow(
    modifier: Modifier = Modifier
) {
    val text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("Liked by")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W600
            )
        ) {
            append("craig_love")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("and")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W600
            )
        ) {
            append("44,444")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("others")
        }
    }

    val comment = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W600
            )
        ) {
            append("joshua_i")
        }
        append(" ")
        withStyle(
            style = SpanStyle(
                fontSize = 13.sp,
                fontFamily = interFont,
                color = gray_f9,
                fontWeight = FontWeight.W400
            )
        ) {
            append("The game in Japan was amazing and I want to share some photos")
        }
    }

    Column(
        modifier = modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            AppIcon(
                modifier = Modifier.size(17.dp),
                icon = R.drawable.photo_2
            )
            Text(text)
        }
        Text(comment)
        AppText(
            text = "September 20", style = TextStyle(
                color = gray_99,
                fontSize = 11.sp,
                fontFamily = interFont,
                fontWeight = FontWeight.W400
            )
        )
    }
}

@Composable
fun InstagramProfileRow(modifier: Modifier = Modifier) {
    val pager = rememberPagerState(
        initialPage = 0
    ) {
        3
    }
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        InstaUserProfile()
        PostContentRow(pagerState = pager)
        InstaPostAction(pagerState = pager)
        PostDescriptionRow()
    }
}

fun LazyListScope.postListItem() {
    items(10) {
        InstagramProfileRow()
    }
}