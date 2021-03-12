package com.example.androiddevchallenge.ui.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jacky
 * @date 2021/3/12
 */
@Composable
@Preview
fun PreviewShapeDemo() {

    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)) {
        //矩形形状
        ExampleBox(shape = RectangleShape)
        //圆形形状
        ExampleBox(shape = CircleShape)
        //带圆角的矩形形状
        ExampleBox(shape = RoundedCornerShape(8.dp))
        //带有切角的矩形形状
        ExampleBox(shape = CutCornerShape(10.dp))
    }
}


//形状
@Composable
fun ExampleBox(shape: Shape) {
    Box(modifier = Modifier
        .size(100.dp)
        .clip(shape)
        .background(Color.Red))
}


//自定义形状
@Composable
fun GenericShapeDemo() {

}

