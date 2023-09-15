package com.marco.torreifer.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BtnOutlined(text: String, onClick: () -> Unit) {
    OutlinedButton(
        onClick,
        modifier = Modifier
            .width(326.dp)
            .height(60.dp)
            .padding(vertical = 8.dp)
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Composable
fun BtnText(text: String, onClick: () -> Unit) {
    TextButton(onClick) {
        Text(text = text, color = MaterialTheme.colorScheme.onBackground)
    }
}