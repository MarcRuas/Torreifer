package com.marco.torreifer.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.marco.torreifer.R
import com.marco.torreifer.ui.components.BtnOutlined
import com.marco.torreifer.ui.components.CardInfo
import com.marco.torreifer.ui.components.TxtField

@Composable
fun SignUpScreen() {
    var nome by rememberSaveable {
        mutableStateOf("")
    }

    var cod by rememberSaveable {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Obrigado por nos escolher!",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 40.sp,
                modifier = Modifier.padding(bottom = 10.dp)

            )

            Text(
                text = "Escolha seu nome e digite o código de sua máquina.",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(37.dp))

            TxtField(value = nome, onValueChange = { nome = it }, label = "Nome")

            Spacer(modifier = Modifier.height(37.dp))

            TxtField(value = cod, onValueChange = { cod = it }, label = "Código")

            Spacer(modifier = Modifier.height(100.dp))

            CardInfo(nomeEsc = nome, codEsc = cod)

            Spacer(modifier = Modifier.height(15.dp))
            
            BtnOutlined(text = "Concluir") {
                
            }
        }

        // Imagem de fundo
        Image(
            painter = painterResource(id = R.drawable.back_1),
            contentDescription = "image description",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .zIndex(-1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}
