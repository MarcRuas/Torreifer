package com.marco.torreifer.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.torreifer.R
import com.marco.torreifer.ui.components.BtnOutlined
import com.marco.torreifer.ui.components.BtnText
import com.marco.torreifer.ui.theme.spacingXLarge


@Composable
fun MainContest() {

    Column(
        modifier = Modifier
            .padding(spacingXLarge)
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(
            text = "Bem-vindo.",
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 50.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Text(
            text = "Comece a usar sua máquina agora mesmo!",
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Image(
            painter = painterResource(id = R.drawable.group),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(top = 100.dp)
        )

        Spacer(modifier = Modifier.height(86.dp))

        BtnOutlined(text = "Concluir cadastro") {
            
        }

        BtnText(text = "Já tenho cadastro") {
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainContestPreview() {
    MainContest()
}