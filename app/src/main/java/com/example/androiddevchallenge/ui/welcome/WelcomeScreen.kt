package com.example.androiddevchallenge.ui.welcome

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.MainActivity
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.*

/**
 * @author jacky
 * @date 2021/3/15
 *
 * the Welcome screen
 */


@Composable
private fun Branding(modifier: Modifier = Modifier) {


    Box(
        modifier = modifier
            .background(green900)
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        BackgroundLogo(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        )
        Column(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Logo(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(start = 88.dp, top = 72.dp)
            )

            CreateAccount(modifier = Modifier.padding(top = 48.dp))
        }
    }
}

@Composable
private fun BackgroundLogo(modifier: Modifier, lightTheme: Boolean = MaterialTheme.colors.isLight) {
    val assetId = if (lightTheme) {
        R.drawable.light_welcome_bg
    } else {
        R.drawable.dark_welcome_bg
    }
    Image(
        painter = painterResource(id = assetId),
        modifier = modifier,
        contentDescription = null
    )
}


@Composable
private fun Logo(modifier: Modifier, lightTheme: Boolean = MaterialTheme.colors.isLight) {
    val assetId = if (lightTheme) {
        R.drawable.light_welcome_illos
    } else {
        R.drawable.dark_welcome_illos
    }
    Image(
        painter = painterResource(id = assetId),
        modifier = modifier,
        contentDescription = null
    )
}

@Composable
private fun AppStyle(
    modifier: Modifier,
    lightTheme: Boolean = MaterialTheme.colors.isLight
) {
    val assetId = if (lightTheme) {
        R.drawable.light_logo
    } else {
        R.drawable.dark_logo
    }
    Image(
        painter = painterResource(id = assetId),
        modifier = modifier,
        contentDescription = null
    )
}


@Composable
private fun CreateAccount(modifier: Modifier) {


    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AppStyle(modifier = modifier)

        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = stringResource(id = R.string.welcome_subtitle),
            style = MaterialTheme.typography.subtitle1,
            color = white
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 20.dp),
            shape = shapes.medium
        ) {
            Text(
                text = stringResource(id = R.string.create_account),
                style = MaterialTheme.typography.button,
            )
        }
        Text(
            modifier = Modifier
                .padding(top = 20.dp),
            text = stringResource(id = R.string.login_in),
            style = MaterialTheme.typography.button,
            color = white,
            onTextLayout = { onClick() }
        )
    }

}


private fun onClick() {

    val intent = Intent()
}


@Composable
@Preview(name = "Welcome light theme", widthDp = 360, heightDp = 640)
fun WelcomeScreenPreviewLight() {
    MyTheme {

    }
}

@Composable
@Preview(name = "Welcome dark theme", widthDp = 360, heightDp = 640)
fun WelcomeScreenPreviewDark() {
    MyTheme(darkTheme = true) {
        Branding(
            modifier = Modifier
                .fillMaxWidth()
        )

    }
}
