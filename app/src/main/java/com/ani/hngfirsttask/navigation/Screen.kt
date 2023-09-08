package com.ani.hngfirsttask.navigation

import com.ani.hngfirsttask.navigation.routes.Routes

sealed class Screen(val route: String) {
    object HomeScreen : Screen(route = Routes.homeScreenRoute)
    object WebViewScreen : Screen(route = Routes.webViewScreenRoute)
}