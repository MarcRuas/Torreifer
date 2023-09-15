package com.marco.torreifer.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.marco.torreifer.ui.theme.Gray
import com.marco.torreifer.ui.theme.Orange
import com.marco.torreifer.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TxtField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String
) {
    val isDarkMode = isSystemInDarkTheme()

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label)},
        modifier = Modifier
            .width(326.dp)
            .height(54.dp),
        colors = TextFieldDefaults.textFieldColors(
            textColor = if (isDarkMode) White else Gray,
            containerColor = MaterialTheme.colorScheme.onBackground,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            cursorColor = if (isDarkMode) White else Orange,
            focusedLabelColor = if (isDarkMode) White else Gray,
            unfocusedLabelColor = if (isDarkMode) White else Gray
        ),
        shape = RoundedCornerShape(30.dp)

    )
}
