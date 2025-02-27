package com.nameisjayant.jetpack_compose_projects_yt.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nameisjayant.jetpack_compose_projects_yt.R


val poppinsFont = FontFamily(
    Font(R.font.poppins_thin, FontWeight.W100),
    Font(R.font.poppins_extra_light, FontWeight.W200),
    Font(R.font.poppins_light, FontWeight.W300),
    Font(R.font.poppins_regular, FontWeight.W400),
    Font(R.font.poppins_medium, FontWeight.W500),
    Font(R.font.poppins_medium, FontWeight.W600),
    Font(R.font.poppins_bold, FontWeight.W700),
    Font(R.font.poppins_extra_bold, FontWeight.W800),
    Font(R.font.poppins_black, FontWeight.W900)
)

val interFont = FontFamily(
    Font(R.font.inter_thin, FontWeight.W100),
    Font(R.font.inter_extra_light, FontWeight.W200),
    Font(R.font.inter_light, FontWeight.W300),
    Font(R.font.inter_regular, FontWeight.W400),
    Font(R.font.inter_medium, FontWeight.W500),
    Font(R.font.inter_semibold, FontWeight.W600),
    Font(R.font.inter_bold, FontWeight.W700),
    Font(R.font.inter_extra_bold, FontWeight.W800),
    Font(R.font.inter_black, FontWeight.W900)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = interFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)