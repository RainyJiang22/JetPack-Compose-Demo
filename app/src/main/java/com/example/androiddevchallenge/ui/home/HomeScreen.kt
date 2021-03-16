package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.bean.Browser
import com.example.androiddevchallenge.data.BrowserDataProvider
import com.example.androiddevchallenge.ui.login.TextFieldError
import com.example.androiddevchallenge.ui.login.TextFieldState

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

    val list = remember { BrowserDataProvider.browserList }

    val onClickItem: (Browser) -> Unit = remember { { } }

    Spacer(modifier = Modifier.height(40.dp))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val searchState = remember { SearchState() }
        SearchBar(label = stringResource(R.string.search), searchState = searchState)
        BannerView(bannerListState, bannerList, onClickItem)


        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth()) {

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    modifier = Modifier.padding(horizontal = 18.dp),
                    text = stringResource(R.string.home_garden),
                    style = MaterialTheme.typography.h1
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.FilterList,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 20.dp,bottom = 8.dp)
                )
            }
        }


        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn {
            items(list.size) { index ->
                val browser  = list[index]
                VerticalListItem(browser = browser)
                ListItemDivider()
            }
        }



    }

}


//the search bar
@Composable
private fun SearchBar(
    label: String,
    searchState: TextFieldState,
    modifier: Modifier = Modifier,
    imeAction: ImeAction = ImeAction.Next,
    onImeAction: () -> Unit = {}
) {

    OutlinedTextField(
        value = searchState.text,
        onValueChange = {
            searchState.text = it
            searchState.enableShowErrors()
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .onFocusChanged { focusState ->
                val focused = focusState == FocusState.Active
                searchState.onFocusChange(focused)
                if (!focused) {
                    searchState.enableShowErrors()
                }
            },
        textStyle = MaterialTheme.typography.body1,
        label = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.body1
                )
            }
        },
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null
                )
            }
        },
        isError = searchState.showErrors(),
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction),
        keyboardActions = KeyboardActions(
            onDone = {
                onImeAction()
            }
        )
    )

    searchState.getError()?.let { error -> TextFieldError(textError = error) }

}

//the list item divider
@Composable
private fun ListItemDivider() {
    Divider(
        modifier = Modifier.padding(top = 2.dp, bottom = 8.dp, start = 90.dp, end = 12.dp),
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
    )
}

