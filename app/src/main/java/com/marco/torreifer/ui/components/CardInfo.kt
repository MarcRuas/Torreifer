package com.marco.torreifer.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.torreifer.R

@Composable
fun CardInfo(nomeEsc: String, codEsc: String) {
    val img = painterResource(id = R.drawable.maquina)

    ElevatedCard(
        modifier = Modifier
            .size(width = 120.dp, height = 130.dp)
            .fillMaxSize(),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 8.dp
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = img,
                contentDescription = "",
                modifier = Modifier
                    .size(width = 80.dp, height = 80.dp)
            )

            Text(
                text = nomeEsc,
                fontSize = 10.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = codEsc,
                fontSize = 10.sp,
                fontFamily = FontFamily(Font(R.font.manrope)),
                fontWeight = FontWeight.Bold
            )
        }
    }
}
