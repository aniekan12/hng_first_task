package com.ani.hngfirsttask

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.ani.hngfirsttask.composables.AppButton
import com.ani.hngfirsttask.ui.theme.HngFirstTaskTheme
import com.ani.hngfirsttask.composables.CircleAvatar
import com.ani.hngfirsttask.composables.Heading1Text
import com.ani.hngfirsttask.utils.Constants

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
    Scaffold() {
        Content()
    }

}

@Composable

fun Content() {
    val context = LocalContext.current
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
            openGitHubProfile(context, Constants.MY_GITHUB_URL)
        }, buttonText = R.string.open_github, padding = 10)
    }
}


fun openGitHubProfile(context: Context, url: String) {
    val gitHubUrl = Intent(Intent.ACTION_VIEW)
    gitHubUrl.data = android.net.Uri.parse(url)
    ContextCompat.startActivity(context, gitHubUrl, null)
}

