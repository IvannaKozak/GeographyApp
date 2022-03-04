package com.example.testapp.learnscreens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
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
import com.example.testapp.R
import com.example.testapp.navigation.Screen
import kotlinx.coroutines.delay

@Composable
fun GeneralGeography(navController: NavHostController){
    var completedTask by remember { mutableStateOf(false) }
    var completedTask1 by remember { mutableStateOf(false) }
    var completedTask2 by remember { mutableStateOf(false) }
    var completedTask3 by remember { mutableStateOf(false) }
    var completedTask4 by remember { mutableStateOf(false) }
    var completedTask5 by remember { mutableStateOf(false) }
    var completedTask6 by remember { mutableStateOf(false) }
    var completedTask7 by remember { mutableStateOf(false) }

    Box(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(if (isSystemInDarkTheme()) Color.Black else Color(0xFFBE8FE2))
        // don't understand why background color in light/dark mode isn't changing
        //contentAlignment = Alignment.Center
    ) {
        Column() {
            Text(text = "  Підрозділи", fontSize = 25.sp, color = if(isSystemInDarkTheme()) Color(0xFFFFB400) else Color.Black)
            Spacer(modifier = Modifier.height(20.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask = !completedTask
                    navController.navigate(com.example.testapp.navigation.Screen.First.route) }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Географічні відкриття, видатні мандрівники                              ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask1 = !completedTask1 },
            ) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask1) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Способи зображення Землі                        ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask2 = !completedTask2 }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask2) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Рух Землі як планети                                ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask3 = !completedTask3 }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask3) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Літосфера та рельєф                               ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask4 = !completedTask4 }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask4) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Атмосфера та клімат                   ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask5 = !completedTask5 }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask5) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Гідросфера. Світовий океан                                    ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask6 = !completedTask6 }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask6) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Біосфера та ґрунти                          ", fontSize = 23.sp)
                }
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.Gray else Color.White,
                contentColor = if (isSystemInDarkTheme()) Color.Black else Color.Black),
                onClick = { completedTask7 = !completedTask7 }) {
                Row() {
                    Image(painter = painterResource(id = if (completedTask7) {
                        R.drawable.completed
                    } else {
                        R.drawable.ellipse
                    }),
                        contentDescription = "completed", modifier = Modifier.size(30.dp))
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Природні комплекси. Географічна оболонка                          ", fontSize = 23.sp)
                }
            }
        }
    }
}


@Composable
@Preview
fun GeneralGeographyPreview() {
    GeneralGeography(navController = rememberNavController())
}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun GeneralGeographyDarkPreview() {
    GeneralGeography(navController = rememberNavController())
}