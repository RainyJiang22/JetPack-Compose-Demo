package com.example.androiddevchallenge.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.*

/**
 * @author jacky
 * @date 2021/3/15
 */

private val DarkColorPalette = darkColors(
    primary = green900,
    primaryVariant = green900,
    secondary = green300,
    background = gray,
    surface = white150,
    onPrimary = white,
    onSecondary = gray,
    onBackground = white,
    onSurface = white850
)


@Composable
private fun Branding(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Logo(
            modifier = Modifier
                .align(Alignment.End)
                .padding(start = 88.dp, top = 72.dp)
        )

        CreateAccount(modifier = Modifier.padding(top = 48.dp))
    }

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
        Button(
            onClick = { /*TODO*/ },
            modifier = modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 40.dp)
        ) {
            Text(
                text = stringResource(id = R.string.create_account),

                style = MaterialTheme.typography.button,
            )
        }
    }

}


@Composable
@Preview(name = "Welcome light theme", widthDp = 360, heightDp = 640)
fun WelcomeScreenPreviewLight() {
    MyTheme {
        /*  Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
              CreateAccount(modifier = Modifier)
          }*/

    }
}

@Composable
@Preview(name = "Welcome dark theme", widthDp = 360, heightDp = 640)
fun WelcomeScreenPreviewDark() {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = typography,
        shapes = shapes
    ) {
        Branding(
            modifier = Modifier
                .fillMaxWidth()
        )

    }
}
