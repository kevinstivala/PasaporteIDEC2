package com.ingeniovirtual.pasaporteidec2.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ingeniovirtual.pasaporteidec2.screens.Pasaporte2Screen
import com.ingeniovirtual.pasaporteidec2.screens.PasaporteScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Pasaporte1.route){
        composable(route = AppScreens.Pasaporte1.route) {
            PasaporteScreen(navController = navController)
        }
        composable(route = AppScreens.Pasaporte2.route) {
            Pasaporte2Screen(navController = navController)
        }
    }
}