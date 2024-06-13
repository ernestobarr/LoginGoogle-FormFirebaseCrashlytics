package com.bc100520.logingoogle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bc100520.logingoogle.navigation.Destination
import com.bc100520.logingoogle.present_user.user_detail.UserDetailScreen
import com.bc100520.logingoogle.present_user.user_detail.UserDetailViewModel
import com.bc100520.logingoogle.ui.theme.ComposeGoogleSignInCleanArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint
import com.bc100520.logingoogle.present_user.user_add.UserAddScreen

@AndroidEntryPoint
class MainActivity2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeGoogleSignInCleanArchitectureTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Destination.Add.route,
                ){
                    addUser(navController)

                    addUserDetail()
                }
            }
        }
    }
}


fun NavGraphBuilder.addUser(
    navController: NavController
){
    composable(
        route = Destination.Add.route
    ){
        UserAddScreen(
            navigateToUserDetail = {
                navController.navigate(Destination.Detail.route)
            }
        )
    }
}

fun NavGraphBuilder.addUserDetail() {
    composable(
        route = Destination.Detail.route
    ){

        val viewModel: UserDetailViewModel = hiltViewModel()
        val state = viewModel.state.value

        UserDetailScreen(
            state = state,
            addNew = viewModel::addNew
        )
    }
}