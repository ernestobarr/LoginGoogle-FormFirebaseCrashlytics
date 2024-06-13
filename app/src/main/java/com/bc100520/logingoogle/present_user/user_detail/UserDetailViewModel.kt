package com.bc100520.logingoogle.present_user.user_detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.bc100520.logingoogle.model.User
import com.bc100520.logingoogle.repositories.UserRepository
import java.util.*
import javax.inject.Inject

@HiltViewModel
class UserDetailViewModel
@Inject
constructor(
    private val userRepository: UserRepository
): ViewModel() {

    //private var userIdCounter = 0 // Contador para generar ID único
    private val _state: MutableState<UserDetailState> = mutableStateOf(UserDetailState())
    val state: State<UserDetailState>
        get() = _state

    fun addNew(name: String, email: String) {
        val user = User(
            id = UUID.randomUUID().toString(),
            //id = (userIdCounter++).toString(),
            name = name,
            email = email,
        )
        userRepository.addNew(user)
    }

}












