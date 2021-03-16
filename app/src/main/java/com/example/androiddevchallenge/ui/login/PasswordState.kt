package com.example.androiddevchallenge.ui.login

/**
 * @author jacky
 * @date 2021/3/16
 */
class PasswordState :
    TextFieldState(validator = ::isPasswordValid, errorFor = ::passwordValidationError) {
}



private fun isPasswordValid(password: String): Boolean {
    return password.length > 7
}

@Suppress("UNUSED_PARAMETER")
private fun passwordValidationError(password: String): String {
    return "Invalid password"
}

