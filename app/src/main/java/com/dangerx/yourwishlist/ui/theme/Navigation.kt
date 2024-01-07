package com.dangerx.yourwishlist.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.dangerx.yourwishlist.AddEditDetailedView
import com.dangerx.yourwishlist.HomeView
import com.dangerx.yourwishlist.Screen
import com.dangerx.yourwishlist.WishViewModel

@Composable
fun Navigation (viewModel: WishViewModel = viewModel(), navController: NavHostController = rememberNavController()){
    NavHost(navController = navController,
        startDestination = Screen.HomeScreen.route)
    {
        composable(Screen.HomeScreen.route){
            HomeView(navController, viewModel)
        }

        composable(Screen.AddScreen.route + "/{id}",
            arguments = listOf(
                navArgument("id"){
                    type = NavType.LongType
                    defaultValue = 0L
                    nullable = false
                }
            )
        ){entry->
            val id = if(entry.arguments != null) entry.arguments!!.getLong("id") else 0L
            AddEditDetailedView(id = id, viewModel = viewModel, navController = navController)
        }
    }
}