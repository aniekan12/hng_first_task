package com.ani.hngfirsttask.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.ani.hngfirsttask.R
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngfirsttask.composables.AppButton
import com.ani.hngfirsttask.composables.CircleAvatar
import com.ani.hngfirsttask.composables.Heading1Text
import com.ani.hngfirsttask.navigation.Screen

@Composable
fun SlackIdentity(navController: NavController) {
    Scaffold(
        topBar = {
            AppBar(text= R.string.aniekans_slack_identity)
        },
    ) {
        Content(navController = navController)
    }

}

@Composable

fun Content(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
    ) {
        CircleAvatar(imageId = R.drawable.ani, contentDescription = "fine ani", circleSize = 200)
        Heading1Text(text = R.string.slack_name, padding = 10)
        AppButton(onClick = {
            navController.navigate(Screen.WebViewScreen.route)
        }, buttonText = R.string.open_github, padding = 10)
    }
}
