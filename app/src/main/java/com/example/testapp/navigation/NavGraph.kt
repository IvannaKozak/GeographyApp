package com.example.testapp.navigation

import android.window.SplashScreen
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.testapp.AnimatedSplashScreen
<<<<<<< HEAD
=======
import com.example.testapp.HomeScreen
>>>>>>> 0266f8b (SplashScreen and HomeScreen)

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ){
        composable(route = Screen.Splash.route){
            AnimatedSplashScreen(navController = navController)
        }
<<<<<<< HEAD
        composable(route = Screen.Home.route){
            Box(modifier = Modifier.fillMaxSize())
=======
        /*composable(route = Screen.Home.route){
            Box(modifier = Modifier.fillMaxSize())
        } */
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
>>>>>>> 0266f8b (SplashScreen and HomeScreen)
        }
    }
}