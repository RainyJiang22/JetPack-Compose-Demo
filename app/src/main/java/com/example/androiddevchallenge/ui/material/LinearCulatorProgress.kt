package com.example.androiddevchallenge.ui.material

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.OutlinedButton
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jacky
 * @date 2021/3/12
 */
@Composable
@Preview
fun LinearProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(Modifier.height(30.dp))
        Text("LinearProgressIndicator with undefined progress")
        LinearProgressIndicator()
        Spacer(Modifier.height(30.dp))
        Text("LinearProgressIndicator with progress set by buttons")
        LinearProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.height(30.dp))
        OutlinedButton(
            onClick = {
                if (progress < 1f) progress += 0.1f
            }
        ) {
            Text("Increase")
        }

        OutlinedButton(
            onClick = {
                if (progress > 0f) progress -= 0.1f
            }
        ) {
            Text("Decrease")
        }
    }
}
