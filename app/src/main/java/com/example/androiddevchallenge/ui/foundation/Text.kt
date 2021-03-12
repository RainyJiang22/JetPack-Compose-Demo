package com.example.androiddevchallenge.ui.foundation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jacky
 * @date 2021/3/12
 */
@Composable
@Preview
fun TextExample(){
    Column {

        //普通文字
        Text("Jacky Tallow")
        //草书文字
        Text("Text with cursive font", style = TextStyle(fontFamily = FontFamily.Cursive))
        //带有LineThrough的文本
        Text(
            text = "Text with LineThrough",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        //带有下划线的文字
        Text(
            text = "Text with underline",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        //带下划线，粗体和直行的文字
        Text(
            text = "Text with underline, linethrough and bold",
            style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.Underline,
                        TextDecoration.LineThrough
                    )
                ), fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
@Preview(widthDp = 260,heightDp = 260)
fun NormalTextExample(){
    Text("Hello World")
}