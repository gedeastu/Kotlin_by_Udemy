package com.example.byUdemy

sealed class Screen(val route:String){
    object MainScreen : Screen("MainPage")
    object ProfileScreen : Screen("ProfilePage")
    object FavoriteScreen : Screen("FavoritePage")
}
