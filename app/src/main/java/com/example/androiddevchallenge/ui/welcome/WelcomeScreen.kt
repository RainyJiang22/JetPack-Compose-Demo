package com.example.androiddevchallenge.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Navigation
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.*

/**
 * @author jacky
 * @date 2021/3/15
 *
 * the Welcome screen
 */
@Composable
fun WelcomeScreen(vm: Navigation) = Branding(modifier = Modifier, vm)


@Composable
private fun WelcomeBackground(
    modifier: Modifier,
    lightTheme: Boolean = MaterialTheme.colors.isLight,
    onClickItem: () -> Unit
) {
    val bgColor = if (lightTheme) {
        pink100
    } else {
        green900
    }

    Box(
        modifier = modifier
            .background(bgColor)
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

            CreateAccount(modifier = Modifier.padding(top = 48.dp), onClickItem)
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
private fun CreateAccount(modifier: Modifier, onClickItem: () -> Unit) {


    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AppStyle(modifier = modifier)

        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = stringResource(id = R.string.welcome_subtitle),
            style = MaterialTheme.typography.subtitle1)

        Button(
            onClick = { },
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
                .padding(top = 20.dp)
                .clickable {
                    onClickItem()
                },
            text = stringResource(id = R.string.login_in),
            style = MaterialTheme.typography.button)
    }

}


@Composable
private fun Branding(modifier: Modifier = Modifier, vm: Navigation) {

    val onClickItem: () -> Unit = remember { { vm.navigationToLogin() } }

    WelcomeBackground(modifier = modifier, onClickItem = { onClickItem() })

}

