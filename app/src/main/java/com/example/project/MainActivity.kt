package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project.ui.theme.ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Layouts("Android")
                    Button()
                }
            }
        }
    }
}

@Composable
fun Layouts(name: String, modifier: Modifier = Modifier) {
    Surface(modifier = Modifier) {
        Box(modifier = Modifier){
            Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .background(color = colorResource(id = R.color.purple_500)))
                Row {
                    Text(
                        text = "Hello $name!",
                        modifier = Modifier
                            .background(colorResource(id = R.color.red))
                            .padding(10.dp)
                        //.align(Alignment.Center)
                        ,
                        color = colorResource(id = R.color.white,),
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    //Text(text = stringResource(id = R.string.app_name))
                }
                Box(modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .background(color = colorResource(id = R.color.purple_500)))
            }
        }
    }
}

@Composable
fun Button(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.size(200.dp,60.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.purple_700)),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, color = colorResource(id = R.color.red))
            )
        {
            Text(text = "Do your Magic 😱", fontSize = 15.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProjectTheme {
        //Layouts("Android")
        Button()
    }
}