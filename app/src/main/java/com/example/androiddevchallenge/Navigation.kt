package com.example.androiddevchallenge

import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author jacky
 * @date 2021/3/15
 */
class Navigation  : ViewModel() {
    private val _screen = MutableLiveData<Screen>(Screen.WelcomeScreen)

    val curScreen: LiveData<Screen> = _screen


    @MainThread
    fun onBack() : Boolean {
        if(_screen.value != Screen.WelcomeScreen) {
           _screen.value = Screen.WelcomeScreen
            return true
        }
        return false
    }


    // go to login
    @MainThread
    fun navigationToLogin() {
        _screen.value = Screen.LoginScreen
    }


    //go to home
    @MainThread
    fun navigationToHome() {
        _screen.value = Screen.HomeScreen
    }

}