package com.example.androiddevchallenge.ui.material

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun CardDemo() {
    Card(
        Modifier
            .fillMaxSize()
            .padding(8.dp),elevation = 8.dp) {
        Text(text = "This is a Card")

    }
}