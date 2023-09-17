package com.marco.torreifer.ui.view

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.torreifer.R
import com.marco.torreifer.ui.components.BtnOutlined
import com.marco.torreifer.ui.components.BtnText
import com.marco.torreifer.ui.components.TxtField

@Composable
fun SignIn() {

    val imgSignIn = painterResource(id = R.drawable.group)

    val currentConfiguration = LocalConfiguration.current

    var newvalue by rememberSaveable {
        mutableStateOf("")
    }

    var key by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Entrar",
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 40.sp
        )

        Text(
            text = "Digite seu número de fábrica e sua senha",
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        if(currentConfiguration.orientation == Configuration.ORIENTATION_PORTRAIT){
            Image(
                painter = imgSignIn,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(275.dp)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        TxtField(value = newvalue, onValueChange = {newvalue = it}, label = "Número de fábrica")
        
        Spacer(modifier = Modifier.height(30.dp))
        
        TxtField(value = key, onValueChange = {key = it}, label = "Senha")

        Spacer(modifier = Modifier.height(30.dp))

        BtnOutlined(text = "Concluir") {

        }

        BtnText(text = "Voltar") {

        }

    }
}
