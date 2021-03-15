package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.bean.Browser
import com.example.androiddevchallenge.data.BrowserDataProvider
import com.example.androiddevchallenge.ui.theme.MyTheme

/**
 * @author jacky
 * @date 2021/3/15
 */

@Composable
fun BannerView(
    listState: LazyListState,
    list: List<Browser>,
    onClickItem: (browser: Browser) -> Unit
) {
    Column {
        Text(
            modifier = Modifier.padding(18.dp),
            text = "Browse themes",
            style = MaterialTheme.typography.h1
        )
        LazyRow(state = listState) {
            items(
                count = list.size,
                itemContent = {
                    BannerItem(
                        list[it],
                        Modifier.padding(start = 8.dp, end = 8.dp, bottom = 16.dp, top = 8.dp)
                    ) {
                        onClickItem.invoke(list[it])
                    }

                }
            )
        }
    }
}


@Composable
private fun BannerItem(
    browser: Browser,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    MyTheme {
        Card(
            shape = MaterialTheme.shapes.small,
            modifier = modifier
                .size(136.dp, 136.dp)
                .shadow(10.dp)
        ) {
            Box(modifier = Modifier.clickable { /*TODO*/ }) {
                val image = ImageBitmap.imageResource(browser.images.first())
                Image(
                    bitmap = image,
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )

                Column(
                    modifier = Modifier
                        .background(Color.White.copy(alpha = 1.0f))
                        .fillMaxWidth()
                        .padding(10.dp)
                        .height(20.dp)
                        .align(Alignment.BottomStart)
                ) {

                    Text(
                        text = browser.name,
                        style = MaterialTheme.typography.h2,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }


    }
}

@Preview
@Composable
fun PreviewHorizontalListItem() {
    val browser = BrowserDataProvider.DesertChic
    BannerItem(browser = browser, onClick = { /*TODO*/ })
}