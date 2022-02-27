package com.example.testapp


import android.content.Context
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2)),
       contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Підготовка до ЗНО", fontSize = 30.sp,
                color = if (isSystemInDarkTheme()) Color(0xFFFFB400) else Color.Black)
            Text(text = "з географії", fontSize = 22.sp,
                color = if (isSystemInDarkTheme()) Color(0xFFFFB400) else Color.Black)
            Spacer(modifier = Modifier.height(80.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {
                          navController.navigate(com.example.testapp.navigation.Screen.Learn.route)
                },
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Вчитися", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Тести", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Прогрес", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Налаштування", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(100.dp))
            Row() {
                Image(painterResource(R.drawable.insta),
                    contentDescription = "instagram",
                    modifier = Modifier
                        .height(90.dp)
                        .width(90.dp)
                        .clickable(onClick = {}))
                Image(painterResource(R.drawable.teleg),
                    contentDescription = "instagram",
                    modifier = Modifier
                        .height(90.dp)
                        .width(90.dp)
                        .clickable(onClick = {}))
                Image(painterResource(R.drawable.ds),
                    contentDescription = "instagram",
                    modifier = Modifier
                        .height(90.dp)
                        .width(90.dp)
                        .clickable(onClick = {}))
            }
        }
    }
}


@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun HomeScreenDarkPreview() {
    HomeScreen(navController = rememberNavController())
}

