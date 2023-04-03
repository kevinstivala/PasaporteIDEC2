package com.ingeniovirtual.pasaporteidec2.navigation

sealed class AppScreens(val route: String){
    object Pasaporte1: AppScreens ("pasaporte1_screen")
    object Pasaporte2: AppScreens ("pasaporte2_screen")
}
