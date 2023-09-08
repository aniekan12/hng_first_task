package com.ani.hngfirsttask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ani.hngfirsttask.composables.AppButton
import com.ani.hngfirsttask.ui.theme.HngFirstTaskTheme
import com.ani.hngfirsttask.composables.CircleAvatar
import com.ani.hngfirsttask.composables.Heading1Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HngFirstTaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SlackIdentity()
                }
            }
        }
    }
}

@Composable
fun SlackIdentity() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
    ) {
        CircleAvatar(imageId = R.drawable.ani, contentDescription = "fine ani", circleSize = 200)
        Heading1Text(text = R.string.slack_name, padding = 10)
        AppButton(onClick = { /*TODO*/ }, buttonText = R.string.open_github, padding = 10)
    }
}
