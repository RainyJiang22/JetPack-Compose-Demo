package com.example.androiddevchallenge.ui.foundation

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.R

/**
 * @author jacky
 * @date 2021/3/12
 */

@Composable
@Preview
fun ImageResource() {
    val image: Painter = painterResource(R.drawable.lagotto_romagnolo)
    Image(painter = image, contentDescription = null)
}