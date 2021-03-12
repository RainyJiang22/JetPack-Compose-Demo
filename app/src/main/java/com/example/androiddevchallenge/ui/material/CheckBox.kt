package com.example.androiddevchallenge.ui.material

import android.widget.CheckBox
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun CheckBoxDemo() {
    val checkedState = remember { mutableStateOf(true) }
    Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it }
    )
}
