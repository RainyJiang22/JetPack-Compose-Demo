package com.example.androiddevchallenge.ui.material

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jacky
 * @date 2021/3/12
 */

//文本域
@Composable
@Preview
fun TextFieldDemo() {

    Column(Modifier.padding(16.dp)) {
        val textState = remember { mutableStateOf(TextFieldValue()) }
        TextField(
            value = textState.value,
            onValueChange = { textState.value = it }
        )
        Text("The textfield has this text: " + textState.value.text)
    }
}