package com.bc100520.logingoogle.authgoogle.login

data class LoginState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
