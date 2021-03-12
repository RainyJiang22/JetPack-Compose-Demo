package com.example.androiddevchallenge.ui.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author jacky
 * @date 2021/3/12
 */
@Composable
@Preview
fun ColumnDemo() {
    Column {
        Text(text = "Hello World")
        Text(text = "Hello World2")
    }
}