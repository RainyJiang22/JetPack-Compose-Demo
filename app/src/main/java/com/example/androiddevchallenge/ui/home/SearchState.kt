package com.example.androiddevchallenge.ui.home

import com.example.androiddevchallenge.ui.login.TextFieldState

/**
 * @author jacky
 * @date 2021/3/16
 */
class SearchState :
    TextFieldState(validator = ::isSearchValid, errorFor = ::searchValidationError) {}



private fun isSearchValid(search: String): Boolean {
    return search.isNotEmpty()
}

@Suppress("UNUSED_PARAMETER")
private fun searchValidationError(search: String): String {
    return "Invalid search"
}
