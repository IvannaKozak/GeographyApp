package com.example.testapp

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.geometry.*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.testapp.navigation.Screen
import kotlinx.coroutines.delay
import androidx.compose.ui.graphics.drawscope.DrawScope as DrawScope1


@Composable
fun ProgressScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Твій прогрес:",
                color = if (isSystemInDarkTheme()) Color.White else Color.Black, fontSize = 30.sp)
            CustomComponent()
        }
    }
}

@Composable
fun CustomComponent(
    canvasSize: Dp = 300.dp,
    earthSize: Dp = 750.dp,
    indicatorValue: Int = 0,
    maxIndicatorValue: Int = 100,
    backgroundIndicatorColor: Color = if (isSystemInDarkTheme()) Color.Gray.copy(alpha = 0.4f) else Color.White,
    backgroundIndicatorStrokeWidth: Float = 100f
) {
    Box() {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .size(canvasSize)
                .drawBehind {
                    val componentSize = size / 1.25f
                    backgroundIndicator(
                        componentSize = componentSize,
                        indicatorColor = backgroundIndicatorColor,
                        indicatorStrokeWidth = backgroundIndicatorStrokeWidth,
                    )
                }
        ) {
            Image(painterResource(R.drawable.earth2), contentDescription = "Earth",
                modifier = Modifier.size(earthSize))
        }
    }
}

fun DrawScope1.backgroundIndicator(
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float

    ){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 120f,
        sweepAngle = 300f,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f,
            y = (size.height - componentSize.height) / 2f
        )

    )
}


@Composable
@Preview
fun ProgressScreenPreview() {
    ProgressScreen()
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun ProgressScreenDarkPreview() {
    ProgressScreen()
}
