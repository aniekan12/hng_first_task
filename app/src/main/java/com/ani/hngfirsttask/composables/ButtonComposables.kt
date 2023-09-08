package com.ani.hngfirsttask.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ani.hngfirsttask.ui.theme.Purple200
import com.ani.hngfirsttask.ui.theme.Typography
import com.ani.hngfirsttask.ui.theme.White

@Composable
fun AppButton(onClick: () -> Unit, buttonText: Int, padding: Int) {
    Button(
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            backgroundColor = Purple200,
        ),
        shape = RoundedCornerShape(60),
        modifier = Modifier
            .padding(top = padding.dp)
            .width(200.dp)
            .height(50.dp)
    ) {
        Text(
            text = stringResource(id = buttonText),
            style = Typography.body1.copy(color = White, fontWeight = FontWeight.Bold)
        )
    }
}