package com.qadri.blitz_meet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.qadri.blitz_meet.ui.screens.auth.AuthNav
import com.qadri.blitz_meet.ui.screens.auth.AuthScreen

@Composable
fun BlitzMeetNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = AuthNav) {
        composable<AuthNav> {
            AuthScreen()
        }
    }
}