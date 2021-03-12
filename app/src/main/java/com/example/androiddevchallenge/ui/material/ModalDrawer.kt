package com.example.androiddevchallenge.ui.material

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun ModalDrawerSample() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()


    ModalDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column {
                Text("Text in Drawer")
                Button(onClick = {
                    scope.launch {
                        drawerState.close()
                    }
                }) {
                    Text("Close Drawer")
                }
            }
        }, content = {
            Column {
                Text(text = "Text in BodyContext")
                Button(onClick = {
                    scope.launch { 
                        drawerState.open()
                    }
                }) {
                    Text(text = "Click to open")
                }
            }
        })
}
