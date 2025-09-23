/*
HANDLES NAVIGATION BETWEEEN SCREENS

FIRST CREATE THE SCREEN IN SCREEN PACAKAGE
SECOND ADD THE ROUTE TO THE ROUTES.KT FILE
THIRD ADD THE ROUTE TO THE NAVHOST FUNCTION
*/


package com.example.baseapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baseapp.ui.theme.screens.display.AddDataScreen
import com.example.baseapp.ui.theme.screens.display.ViewDataScreen
import com.example.baseapp.ui.theme.screens.home.HomeScreen
import com.example.baseapp.ui.theme.screens.login.LoginScreen
import com.example.baseapp.ui.theme.screens.signup.SignUpScreen
import com.example.baseapp.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier)
    {
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignUpScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
            //added

        composable(ADD_DATA_URL){
            AddDataScreen(navController = navController)
        }

        composable(VIEW_DATA_URL){
            ViewDataScreen(navController = navController)
        }

        composable(SPLASH_URL){
            SplashScreen(navController = navController)
        }
    }
}