package com.ani.hngfirsttask.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ani.hngfirsttask.ui.theme.Black

@Composable
fun CircleAvatar(imageId: Int, contentDescription: String, circleSize: Int) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = contentDescription,
        modifier = Modifier.size(size = circleSize.dp)
            .clip(CircleShape)
            .border(3.dp, Black, CircleShape),
    )
}