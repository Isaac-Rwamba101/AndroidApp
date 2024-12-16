package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidapp.ui.theme.AndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidAppTheme {

                   Column {
                       Login()
                       Spacer(modifier = Modifier.height(10.dp))
                       Button(onClick = {
                           val intent = Intent(this@MainActivity,
                               DashBoardActivity::class.java)
                           startActivity(intent)
                       }) {
                           Text(text = "To dashboard")

                       }
                   }
                }
            }
        }
    }


@Composable
fun Login() {
    var email by remember {
        mutableStateOf(value = "")
    }
    var password by remember {
        mutableStateOf(value = "")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "Please Login Here",
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Black)
                .padding(20.dp)
                .fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(
                id = R.drawable.logo
            ),
            contentDescription = "Pixabay logo"
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {newEmail -> email = newEmail},
            label = { Text(text = "Enter Email") },
            placeholder = { Text(text = "Please enter Email") },
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {newPassword -> password = newPassword},
            label = { Text(text = "Enter Password") },
            placeholder = { Text(text = "Please enter Password") },
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
            }

        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                color = Color.White,
                text = "LOGIN HERE"
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        ClickableText(
            text = AnnotatedString("Don't have an account?Register here"),
            onClick = {},
            style = TextStyle(color = Color.Blue, fontSize = 16.sp, textAlign = TextAlign.Center),
        )

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    AndroidAppTheme {
       Login()
    }
}