package com.example.androiddevchallenge.ui.material

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun ButtonExample() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
    ) {
        Text("Button")
    }

}
