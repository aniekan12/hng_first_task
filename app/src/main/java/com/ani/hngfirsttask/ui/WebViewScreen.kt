package com.ani.hngfirsttask.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.ani.hngfirsttask.R
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngfirsttask.utils.Constants

@Composable
fun WebViewScreen() {
    Scaffold(
        topBar = {
            AppBar(text= R.string.aniekans_github)
        },
    ) {
        AndroidView(
            factory = {
                WebView(it).apply {
                    webViewClient = WebViewClient()
                    loadUrl(Constants.MY_GITHUB_URL)
                }
            }, update = {
                it.loadUrl(Constants.MY_GITHUB_URL)
            }
        )
    }
}

