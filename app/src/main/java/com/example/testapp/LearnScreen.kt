package com.example.testapp

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
fun LearnScreen(){
    var completedTask by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2)),
        // don't understand why background color in light/dark mode isn't changing
        //contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask = !completedTask }) {
                Row() {
                        Image(painter = painterResource(id = if (completedTask) {
                            R.drawable.completed
                        } else {
                            R.drawable.ellipse
                        }),
                            contentDescription = "completed", modifier = Modifier.size(30.dp))
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(text = "Сектори економіки: первинний, вторинний, третинний")
                    }
                }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask = !completedTask }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Сектори економіки: первинний, вторинний, третинний")
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask = !completedTask }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Сектори економіки: первинний, вторинний, третинний")
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask = !completedTask }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Сектори економіки: первинний, вторинний, третинний")
                }
            }
            Spacer(modifier = Modifier.height(1.dp))

        }
    }
}


@Composable
@Preview
fun LearnScreenPreview() {
    LearnScreen()
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun LearnScreenDarkPreview() {
    LearnScreen()
}

