package com.example.androiddevchallenge.ui.animation

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jacky
 * @date 2021/3/12
 */
@Composable
@Preview
fun CrossFadeDemo() {
    var currentColor by remember { mutableStateOf(MyColor.Red) }

    Column {
        Row {
            MyColor.values().forEach { myColors ->
                Button(
                    onClick = { currentColor = myColors },
                    Modifier
                        .weight(1f, true)
                        .height(48.dp)
                        .background(myColors.color),
                    colors = ButtonDefaults.buttonColors(backgroundColor = myColors.color)
                ) {
                    Text(text = myColors.name)
                }
            }
        }
        Crossfade(targetState = currentColor) {
            Crossfade(targetState = currentColor, animationSpec = tween(3000)) { selectedColor ->
                Box(modifier = Modifier.fillMaxSize().background(selectedColor.color))
            }
        }
    }
}

enum class MyColor(val color: Color) {
    Red(Color.Red),
    Green(Color.Green),
    Blue(Color.Blue)
}
