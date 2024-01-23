package com.example.byUdemy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.project.R

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route){
        composable(route = Screen.MainScreen.route){
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.ProfileScreen.route + "/{name}",
            arguments = listOf(navArgument("name")
            {
                type = NavType.StringType
                defaultValue = "Astu Nugraha"
                nullable = true
            }
        )){entry->
            ProfileScreen(name = entry.arguments?.getString("name"))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController){
    var textValue by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        TextField(
            value = textValue, onValueChange = {textValue = it},
            label = { Text(text = "Enter your Name")},
            colors = TextFieldDefaults.textFieldColors(
                focusedLabelColor = colorResource(id = R.color.teal_700),
                unfocusedLabelColor = colorResource(id = R.color.teal_200),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
        ),modifier = Modifier.width(300.dp), textStyle = TextStyle.Default.copy(fontWeight = FontWeight.Medium),
            maxLines = 1,
            shape = RoundedCornerShape(10.dp)
        )
        
        Spacer(modifier = Modifier.height(10.dp))
        
        Button(onClick = {
            navController.navigate(Screen.ProfileScreen.route)
        }) {
            Text(text = "To Profile")
        }
    }
}

@Composable
fun ProfileScreen(name:String?){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(text = "Hello $name")
    }
}
