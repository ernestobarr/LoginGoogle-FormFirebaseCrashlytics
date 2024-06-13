package com.bc100520.logingoogle.repositories

import com.google.firebase.firestore.CollectionReference
import com.bc100520.logingoogle.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository
@Inject
constructor(
    private val userAdd: CollectionReference
){
    fun addNew(user: User) {
        try {
            userAdd.document(user.id).set(user)
        } catch (e: Exception){
            e.printStackTrace()
        }
    }

}










