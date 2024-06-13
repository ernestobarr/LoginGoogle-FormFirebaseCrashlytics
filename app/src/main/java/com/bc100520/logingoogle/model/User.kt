package com.bc100520.logingoogle.model

data class User(
    val id: String,
    val name: String,
    val email: String,
){
    constructor() : this("", "", "")
}
