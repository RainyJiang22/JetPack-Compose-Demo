package com.example.androiddevchallenge.bean

/**
 * @author jacky
 * @date 2021/3/15
 *
 * the bean of browser
 */
data class Browser(
    val id: Int,
    val name: String,
    val describe: String,
    val images: List<Int> = emptyList()
)