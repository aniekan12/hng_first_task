package com.ani.hngfirsttask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ani.hngfirsttask.ui.SlackIdentity
import com.ani.hngfirsttask.ui.WebViewScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route){
            SlackIdentity(navController = navController)
        }
        composable(route = Screen.WebViewScreen.route){
            WebViewScreen()
        }
    }
}