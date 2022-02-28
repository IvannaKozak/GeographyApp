package com.example.testapp

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
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
import com.example.testapp.navigation.Screen
import kotlinx.coroutines.delay


@Composable
fun TestScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2)),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(80.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Основна сесія 2021", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Додаткова сесія 2021", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Основна сесія 2020", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                    contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = {},
                shape = RoundedCornerShape(30.dp)
            ){
                Text(text = "Додаткова сесія 2020", fontSize = 30.sp)
            }
        }
    }
}


@Composable
@Preview
fun TestScreenPreview() {
    TestScreen()
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun TestScreenDarkPreview() {
    TestScreen()
}