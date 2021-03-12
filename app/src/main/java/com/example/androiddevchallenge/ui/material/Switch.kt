package com.example.androiddevchallenge.ui.material

import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun SwitchDemo() {

    //持久化状态
    val checkedState = remember { mutableStateOf(true) }

    Switch(checked = checkedState.value, onCheckedChange = { checkedState.value = it })
}

