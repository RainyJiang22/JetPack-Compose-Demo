package com.example.androiddevchallenge.ui.material

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun ScaffoldDemo() {
    val materialBlue700 = Color(0xFF1976D2)
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            //topBar
            TopAppBar(
                title = { Text("TopAppBar") },
                backgroundColor = materialBlue700
            )
        },
        //悬浮按钮位置
        floatingActionButtonPosition = FabPosition.End,
        //悬浮按钮
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text("X")
            }
        },
        //抽屉内容
        drawerContent = { Text(text = "drawerContent") },
       //内容
        content = { Text("BodyContent") },
        //bottomBar
        bottomBar = { BottomAppBar(backgroundColor = materialBlue700) { Text("BottomAppBar") } }
    )
}