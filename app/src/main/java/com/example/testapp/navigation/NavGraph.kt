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
import com.example.testapp.*
import com.example.testapp.learnscreens.FirstScreen
import com.example.testapp.learnscreens.GeneralGeography

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ){
        composable(route = Screen.Splash.route){
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Learn.route){
            LearnScreen(navController = navController)
        }
        composable(route = Screen.Progress.route){
            ProgressScreen()
        }
        composable(route = Screen.Settings.route){
            SettingsScreen()
        }
        composable(route = Screen.Test.route){
            TestScreen()
        }

        composable(route = Screen.GenGeo.route){
            GeneralGeography(navController = navController)
        }
        composable(route = Screen.First.route){
            FirstScreen()
        }
    }
}