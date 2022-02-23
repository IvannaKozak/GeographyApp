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
fun AnimatedSplashScreen(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        )
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(4000)
        navController.popBackStack()
        navController.navigate(com.example.testapp.navigation.Screen.Home.route)
    }
    Splash(alpha = alphaAnim.value)
}


@Composable
fun Splash(alpha: Float){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2)),
    contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.geographybg),
                contentDescription = "Значок электронной почты",
                modifier = Modifier
                    .size(120.dp)
                    .alpha(alpha = alpha)
            )
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
fun SplashScreenPreview() {
    Splash(alpha = 1f)
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun SplashScreenDarkPreview() {
    Splash(alpha = 1f)
}


// if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2)