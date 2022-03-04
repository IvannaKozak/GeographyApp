package com.example.testapp.navigation

sealed class Screen(val route: String) {
    object Splash: Screen("splash_screen")
    object Home: Screen("home_screen")
    object Learn: Screen("learn_screen")
    object Progress: Screen("progress_screen")
    object Settings: Screen("settings_screen")
    object Test: Screen("test_screen")

    object GenGeo: Screen("general_geography")
    object First: Screen("first_screen")
}