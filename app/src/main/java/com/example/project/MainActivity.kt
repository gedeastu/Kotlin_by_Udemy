@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.project

//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
                    //Component()
                    //CheckBox()
                    //Radio()
                    //theSwitch()
                    //theDropdown()
                    ToastMessageComponent()
                    //DropdownMenuExample01()
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

//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Component(){

    val valueButton = remember {
        mutableStateOf(true)
    }

    val valueTextField = remember {
        mutableStateOf("")
    }

    val valuePassword = remember {
        mutableStateOf("")
    }

    val result = remember {
        mutableStateOf("")
    }

    val imageAndroid = remember {
        mutableStateOf(R.drawable.ic_launcher_foreground)
    }

    val rotateImage = remember {
        mutableStateOf(180.0F)
    }
//    val bgImageAndroid = remember {
//        mutableStateOf()
//    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.teal_700)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier){
            //Image(painter = painterResource(id = bgImageAndroid.value) , contentDescription = "Android", modifier = Modifier.size(300.dp), contentScale = ContentScale.FillBounds)
            Image(painter = painterResource(id = imageAndroid.value) , contentDescription = "Android", modifier = Modifier
                .size(300.dp)
                .rotate(rotateImage.value), contentScale = ContentScale.FillBounds)
        }


        Spacer(modifier = Modifier.height(5.dp))

        TextField(
            value = valueTextField.value,
            onValueChange = {
            valueTextField.value = it
            },
            label = {
                Text(text = "Enter your email")
            },
            modifier = Modifier.width(300.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = colorResource(id = R.color.purple_700),
                focusedLabelColor = colorResource(id = R.color.purple_700),
                unfocusedLabelColor = colorResource(id = R.color.teal_700)
            ),
            textStyle = TextStyle.Default.copy(fontWeight = FontWeight.Medium),
            maxLines = 1
        )

        Spacer(modifier = Modifier.height(5.dp))

        TextField(
            value = valuePassword.value,
            onValueChange = {
                valuePassword.value = it
            },
            label = {
                Text(text = "Enter your password")
            },
            modifier = Modifier.width(300.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = colorResource(id = R.color.purple_700),
                focusedLabelColor = colorResource(id = R.color.purple_700),
                unfocusedLabelColor = colorResource(id = R.color.teal_700)
            ),
            textStyle = TextStyle.Default.copy(fontWeight = FontWeight.Medium),
            maxLines = 1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(15.dp))

        //Checkbox(checked = , onCheckedChange = )

        //Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {result.value = valueTextField.value}) {
            Text(text = "Submit")
        }

        Text(text = "Result : ${result.value}", color = colorResource(id = R.color.white))

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = { valueButton.value = !valueButton.value }, modifier = Modifier.size(200.dp,60.dp), colors = ButtonDefaults.buttonColors(
                if (valueButton.value){
                    rotateImage.value = 0.0F
                    colorResource(id = R.color.purple_700)
                }else{
                    rotateImage.value = 180.0F
                    colorResource(id = R.color.red)
                }
            ),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, color = colorResource(id = R.color.red))
        )
        {
            Text(text = "Do your Magic 😱", fontSize = 15.sp, color = (
                if (valueButton.value) {
                    colorResource(id = R.color.white)
                }
                else {
                    colorResource(id = R.color.black)
                }
            ))
        }

        Text(text = "the value is ${valueButton.value}",color = colorResource(id = R.color.white))
    }
}

@Composable
fun CheckBox(){
    val resultValue = remember {
        mutableStateOf("")
    }

    val questionText = remember {
        mutableStateOf("Who is the GOAT of NBA ?")
    }

    val firstValue = remember {
        mutableStateOf(false)
    }

    val secondValue = remember {
        mutableStateOf(false)
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.purple_200)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {

            Box(modifier = Modifier
                //.wrapContentSize()
                .background(color = colorResource(id = R.color.purple_700))) {
                Text(modifier = Modifier.padding(30.dp), text = "${questionText.value} ${resultValue.value}", color = colorResource(id = R.color.white), fontWeight = FontWeight.Bold)
            }


            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = firstValue.value, onCheckedChange = {
                    firstValue.value = it
                    if(firstValue.value){
                        resultValue.value = "Lebron James"
                        secondValue.value = false
                    }else{
                        resultValue.value = ""
                    }
                },colors =  CheckboxDefaults.colors(colorResource(id = R.color.purple_700)))
                Text(text = "Lebron James", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }

            Row(modifier = Modifier,  verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = secondValue.value, onCheckedChange = {
                    secondValue.value = it
                    if(secondValue.value){
                        resultValue.value = "Michael Jordan"
                        firstValue.value = false
                    }else{
                        resultValue.value = ""
                    }
                },
                colors =  CheckboxDefaults.colors(colorResource(id = R.color.purple_700))
                )
                Text(text = "Michael Jordan", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }

        }
    }
}

@Composable
fun Radio(){
    val bgColor = remember {
        mutableStateOf(Color.Red)
    }

    val radioIndex = remember {
        mutableStateOf(0)
    }

    val radioContentList = listOf("Red","Blue","Green","Cyan")
    val colorContentList = listOf(Color.Red, Color.Blue, Color.Green, Color.Cyan)

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = bgColor.value),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        radioContentList.forEachIndexed(){index,name ->
            Row(modifier = Modifier.clickable { radioIndex.value = index },horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = name == radioContentList[radioIndex.value], onClick = {
                    radioIndex.value = index
                    bgColor.value = colorContentList[radioIndex.value]
                }, colors = RadioButtonDefaults.colors(
                    colorResource(id = R.color.white)))
                Text(modifier = Modifier.padding(10.dp), text = radioContentList[index], color = colorResource(id = R.color.white))
            }
        }
    }
}

@Composable
fun theSwitch(){
    val stateSwitch = remember {
        mutableStateOf(false)
    }

    val textSwitch = remember {
        mutableStateOf("The Image is visible")
    }

    val alphaValue = remember {
        mutableStateOf(1F)
    }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Switch(checked = stateSwitch.value, onCheckedChange = {
            stateSwitch.value = it
            if (!stateSwitch.value){
                alphaValue.value = 1F
            }else{
                alphaValue.value = 0F
                textSwitch.value = "The Image is Invisible"
            }
        }, colors = SwitchDefaults.colors(
            checkedTrackColor = Color.Blue,
            checkedThumbColor = Color.Green
        ))

        Spacer(modifier = Modifier.height(50.dp))

        Image(modifier = Modifier.alpha(alphaValue.value), painter = painterResource(id = R.drawable._2f3ff283_d927_48a9_b967_f4994e313332), contentDescription = "blackmist")

        Spacer(modifier = Modifier.height(50.dp))
        
        Text(text = textSwitch.value, fontWeight = FontWeight.Bold, fontSize = 30.sp)
    }
}

@Composable
fun DropdownMenuExample01(){
    val expanded = remember {
        mutableStateOf(false)
    }
    val levelIndexValue = remember {
        mutableStateOf(0)
    }

    val levelValue = stringArrayResource(id = R.array.level_list)

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Select the Level : ${levelValue[levelIndexValue.value]}", fontSize = 25.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier){
                Row(modifier = Modifier.clickable { expanded.value = true }, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                    Text(text = levelValue[levelIndexValue.value], modifier = Modifier.padding(start = 10.dp), fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Icon(modifier = Modifier.size(35.dp), painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24), contentDescription = "icon")
                }
                DropdownMenu(expanded = expanded.value, onDismissRequest = { expanded.value = false }) {
                        levelValue.forEachIndexed { index, level ->
                            DropdownMenuItem(
                                text = { Text(level) },
                                onClick = {
                                    expanded.value = false
                                    levelIndexValue.value = index
                                },


                            )
                        }
                    }
        }
    }
}

@Composable
fun DropdownMenuExample02() {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
    ) {
        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Default.MoreVert, contentDescription = "Localized description")
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("Edit") },
                onClick = { /* Handle edit! */ },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Edit,
                        contentDescription = null
                    )
                })
            DropdownMenuItem(
                text = { Text("Settings") },
                onClick = { /* Handle settings! */ },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Settings,
                        contentDescription = null
                    )
                })
            //HorizontalDivider()
            DropdownMenuItem(
                text = { Text("Send Feedback") },
                onClick = { /* Handle send feedback! */ },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Email,
                        contentDescription = null
                    )
                },
                trailingIcon = { Text("F11", textAlign = TextAlign.Center) })
        }
    }
}


@Composable
fun ToastMessageComponent(){
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            Toast.makeText(context,"Hello Astu Nugraha",Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Show Toast Message")
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProjectTheme {
        //Layouts("Android")
        //Component()
        //CheckBox()
        //Radio()
        //theSwitch()
        //theDropdown()
        ToastMessageComponent()
        //DropdownMenuExample01()
    }
}