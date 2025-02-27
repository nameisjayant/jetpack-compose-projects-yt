package com.nameisjayant.jetpack_compose_projects_yt.components


import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.nameisjayant.jetpack_compose_projects_yt.ui.theme.interFont


@Composable
fun AppText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = LocalTextStyle.current.copy(
        color = Color.Black,
        fontFamily = interFont,
        fontWeight = FontWeight.W400
    )
) {
    Text(
        text = text, modifier = modifier, style = style
    )
}