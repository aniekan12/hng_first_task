package com.ani.hngfirsttask.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ani.hngfirsttask.ui.theme.Typography


@Composable
fun Heading1Text(text: Int, padding: Int? = 0) {
    Text(
        text = stringResource(text),
        style = Typography.h3.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(top = padding!!.dp)
    )
}
