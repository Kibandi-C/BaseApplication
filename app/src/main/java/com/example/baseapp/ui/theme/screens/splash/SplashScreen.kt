package com.example.baseapp.ui.theme.screens.splash


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.baseapp.ui.theme.BaseAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Red,
                        Color.Black
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ){
        //MAIN COLUMN CONTENT START
        Text(
            text = "Welcome To My App",
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = {navController.navigate("login")},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(
                text = "Get Started",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }

        //MAIN COLUMN CONTENT END
    }
}



@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    BaseAppTheme {
        SplashScreen(navController = rememberNavController())
    }
}