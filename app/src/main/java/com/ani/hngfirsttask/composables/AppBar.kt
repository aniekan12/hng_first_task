package com.ani.hngfirsttask.composables

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun AppBar(text:Int){
    TopAppBar(
        title = {
            Text(stringResource(id = text))
        }
    )
}
