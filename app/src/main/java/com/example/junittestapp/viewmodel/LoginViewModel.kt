package com.example.junittestapp.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class LoginViewModel : ViewModel() {

    var username = MutableLiveData<String>()
    var pass = MutableLiveData<String>()
    var edittext = MutableLiveData<String>()
    var status = MutableLiveData<String>()

    fun updateUserName(v: View) {
        loginUser()
    }

    fun loginUser() {
        logUser(username.value.toString(), pass.value.toString())
    }

    fun logUser(user: String, pass: String): Boolean {
        if (pass.equals("") || user.equals("")) {
            return false
        } else {
            return true
        }
    }
}