package com.example.testapp.navigation

sealed class Screen(val route: String) {
    object Splash: Screen("splash_screen")
    object Home: Screen("home_screen")
    object Learn: Screen("learn_screen")
    object Progress: Screen("progress_screen")
    object Settings: Screen("settings_screen")
}