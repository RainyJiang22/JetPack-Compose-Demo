package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.bean.Browser
import com.example.androiddevchallenge.data.BrowserDataProvider
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

/**
 * @author jacky
 * @date 2021/3/16
 */
@Composable
fun VerticalListItem(browser: Browser) {

    var checkedState by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = {
                checkedState = !checkedState
            })

            .padding(16.dp)
    ) {
        ItemImage(
            browser,
            Modifier.padding(end = 16.dp)
        )

        Column(modifier = Modifier.weight(1f)) {
            ItemTitle(browser.name)
            ItemInfo(browser.describe)
        }

        Checkbox(
            checked = checkedState,
            onCheckedChange = { selected ->
                checkedState = selected
            },
            colors = CheckboxDefaults.colors(
                checkedColor = MaterialTheme.colors.primary
            ),
            modifier = Modifier.padding(top = 15.dp)
        )


    }
}


@Composable
fun ItemImage(browser: Browser, modifier: Modifier = Modifier) {
    val image = ImageBitmap.imageResource(browser.images.first())
    Image(
        bitmap = image,
        contentScale = ContentScale.Crop,
        contentDescription = null,
        modifier = modifier
            .size(64.dp, 64.dp)
            .clip(MaterialTheme.shapes.small)
    )
}

@Composable
private fun ItemTitle(str: String) {
    Text(str, style = typography.h2, maxLines = 1, overflow = TextOverflow.Ellipsis)
}

@Composable
private fun ItemInfo(str: String) {
    Text(str, style = typography.body1, maxLines = 1, overflow = TextOverflow.Ellipsis)

}


@Preview
@Composable
fun VerticalItemPreview() {

    val browser = BrowserDataProvider.Monstera
    MyTheme {
        VerticalListItem(browser = browser)
    }

}
