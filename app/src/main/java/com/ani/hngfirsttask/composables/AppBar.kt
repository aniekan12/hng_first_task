package com.ani.hngfirsttask.composables

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun AppBar(text: Int, isAnotherScreen: Boolean, onBackButtonPressed: () -> Unit) {
    if(isAnotherScreen)
    TopAppBar(
        navigationIcon =   {
            IconButton(onClick = onBackButtonPressed) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
        },
        title = {
            Text(stringResource(id = text))
        }
    )
    else
        TopAppBar(
            title = {
                Text(stringResource(id = text))
            }
        )
}
