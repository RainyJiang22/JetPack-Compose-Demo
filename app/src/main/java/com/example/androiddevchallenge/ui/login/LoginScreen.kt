package com.example.androiddevchallenge.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.ui.theme.MyTheme

/**
 * @author jacky
 * @date 2021/3/15
 */
@Composable
fun LoginScreen() {

}


@Composable
private fun SignInContent(
    modifier: Modifier = Modifier,
    onSignInSubmitted: (email: String, password: String) -> Unit
) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


    }
}