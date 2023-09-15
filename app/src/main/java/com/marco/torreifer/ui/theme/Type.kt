package com.marco.torreifer.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.marco.torreifer.R

val torreiferFont = FontFamily(Font(R.font.manrope))

fun typography(onBackground: Color): Typography{
    return Typography(
        bodyLarge = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp,

        ),

        headlineLarge = TextStyle(
            fontFamily = torreiferFont,
            fontSize = fontXXLarge,
            fontWeight =FontWeight.Bold,
            color = onBackground
        )
    )
}
