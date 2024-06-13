package com.bc100520.logingoogle.present_user.user_detail

import com.bc100520.logingoogle.model.User

data class UserDetailState(
    val isLoading: Boolean = false,
    val user: User? = null,
    val error: String = ""
)
