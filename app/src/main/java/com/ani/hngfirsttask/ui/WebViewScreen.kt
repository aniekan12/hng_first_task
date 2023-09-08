package com.ani.hngfirsttask.ui

import android.graphics.Bitmap
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.ani.hngfirsttask.R
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngfirsttask.ui.theme.Purple200
import com.ani.hngfirsttask.utils.Constants

@Composable
fun WebViewScreen() {
    val visibility = remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            AppBar(text = R.string.aniekans_github)
        },
    ) {
        if (visibility.value) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CircularProgressIndicator(
                    color = Purple200,
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                )
            }
        }
        AndroidView(
            factory = {
                WebView(it).apply {
                    webViewClient = object : WebViewClient() {
                        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                            visibility.value = true
                        }

                        override fun onPageFinished(view: WebView?, url: String?) {
                            visibility.value = false
                        }
                    }
                    loadUrl(Constants.MY_GITHUB_URL)

                }
            }, update = {
                it.loadUrl(Constants.MY_GITHUB_URL)
            }
        )
    }
}

