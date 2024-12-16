package com.example.androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidapp.ui.theme.AndroidAppTheme

class DashBoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidAppTheme {
                DashBoard()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoard(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "dashboard background",
            contentScale = ContentScale.FillBounds)
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
            TopAppBar(title = { androidx.compose.material3.Text(text = "Equity Bank")},
                navigationIcon = {
                    androidx.compose.material3.IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(imageVector = Icons.Filled.Home,
                            contentDescription ="Home")

                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Red,
                    navigationIconContentColor = Color.Blue
                ),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Person,
                            contentDescription = "My Profile")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Search,
                            contentDescription = "Search Here")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Menu,
                            contentDescription = "Menu")
                    }
                })
        Row (modifier = Modifier.wrapContentWidth()){
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box (modifier = Modifier.height(100.dp)){
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "New Client")
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(27.dp),
                        contentAlignment = Alignment.Center) {
                        Text(color = Color.Blue,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "NEW ClIENT")
                    }
                }

            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box (modifier = Modifier.height(100.dp)){
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "New Client")
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(27.dp),
                        contentAlignment = Alignment.Center) {
                        Text(color = Color.Blue,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "NEW ClIENT")
                    }
                }

            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box (modifier = Modifier.height(100.dp)){
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "New Client")
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(27.dp),
                        contentAlignment = Alignment.Center) {
                        Text(color = Color.Blue,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "NEW ClIENT")
                    }
                }

            }
        }
        Row (modifier = Modifier.wrapContentWidth()){
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box (modifier = Modifier.height(100.dp)){
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "New Client")
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(27.dp),
                        contentAlignment = Alignment.Center) {
                        Text(color = Color.Blue,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "NEW ClIENT")
                    }
                }

            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box (modifier = Modifier.height(100.dp)){
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "New Client")
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(27.dp),
                        contentAlignment = Alignment.Center) {
                        Text(color = Color.Blue,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "NEW ClIENT")
                    }
                }

            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box (modifier = Modifier.height(100.dp)){
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "New Client")
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(27.dp),
                        contentAlignment = Alignment.Center) {
                        Text(color = Color.Blue,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "NEW ClIENT")
                    }
                }

            }
        }



    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashBoardPreview() {
    AndroidAppTheme {
        DashBoard()
    }
}