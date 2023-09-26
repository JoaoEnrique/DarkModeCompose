package com.example.buttonscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.botonesapp.components.BotonIcono
import com.example.botonesapp.components.BotonNormal
import com.example.botonesapp.components.BotonNormal2
import com.example.botonesapp.components.BotonOutline
import com.example.botonesapp.components.BotonSwitch
import com.example.botonesapp.components.BotonTexto
import com.example.botonesapp.components.DarkMode
import com.example.botonesapp.components.FloatingAction
import com.example.botonesapp.components.Space
import com.example.buttonscompose.ui.theme.ButtonsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false) }

            ButtonsComposeTheme(darkTheme = darkMode.value) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        DarkMode(darkMode = darkMode)
        Space()
        FloatingAction()
    }

}