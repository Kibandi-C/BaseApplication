package com.example.baseapp.ui.theme.screens.display

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.baseapp.ui.theme.BaseAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddDataScreen(navController:NavHostController){

}

@Composable
@Preview(showBackground = true)
fun AddDataScreenPreview(){
    BaseAppTheme {
        AddDataScreen( rememberNavController())
    }
}