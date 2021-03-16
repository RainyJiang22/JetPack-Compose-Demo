package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.androiddevchallenge.Screen
import com.example.androiddevchallenge.bean.Browser
import com.example.androiddevchallenge.data.BrowserDataProvider

/**
 * @author jacky
 * @date 2021/3/15
 */

@Composable
fun HomeScreen() {
    VerticalListView()
}

@Composable
private fun VerticalListView() {

    val bannerList = remember { BrowserDataProvider.banner }
    val bannerListState = rememberLazyListState()


    val onClickItem: (Browser) -> Unit = remember { { /*TODO*/ } }


    LazyColumn {
        item {
            BannerView(bannerListState, bannerList, onClickItem)
        }
    }

}