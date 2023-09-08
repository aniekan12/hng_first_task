package com.ani.hngfirsttask.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ani.hngfirsttask.ui.theme.Purple200
import com.ani.hngfirsttask.ui.theme.Typography

@Composable
fun AppButton(onClick: () -> Unit, buttonText: Int, padding:Int) {
    Button(
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            backgroundColor = Purple200,
        ),
        modifier = Modifier.padding(top = padding.dp)
    ) {
        Text(text = stringResource(id = buttonText), style = Typography.body1)
    }
}