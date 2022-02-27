package com.example.testapp


import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
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
            Text(
                text = "Підготовка до ЗНО", fontSize = 30.sp,
                color = if (isSystemInDarkTheme()) Color(0xFFFFB400) else Color.Black)
            Text(text = "з географії", fontSize = 22.sp,
                color = if (isSystemInDarkTheme()) Color(0xFFFFB400) else Color.Black)
        }
    }
}


@Composable
@Preview
fun HomeScreenPreview() {

}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun HomeScreenDarkPreview() {

}

