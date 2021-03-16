package com.example.androiddevchallenge

/**
 * @author jacky
 * @date 2021/3/15
 */
sealed class Screen {
    object WelcomeScreen : Screen()
    object LoginScreen : Screen()
    object HomeScreen : Screen()
}