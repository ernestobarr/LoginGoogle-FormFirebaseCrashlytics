package com.bc100520.logingoogle.navigation

import androidx.navigation.NamedNavArgument

sealed class Destination(
    val route: String,
    val arguments: kotlin.collections.List<NamedNavArgument>
){
    object Add : Destination("Add", emptyList())
    object Detail: Destination("Detail", emptyList())
}
