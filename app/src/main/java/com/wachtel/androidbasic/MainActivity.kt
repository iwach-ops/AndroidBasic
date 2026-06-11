package com.wachtel.androidbasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wachtel.androidbasic.ui.theme.AndroidBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicTheme {
                Scaffold { innerPadding ->
                       CourseStartScreen(innerPadding)
                }
            }
        }
    }
}


@Composable
fun CourseStartScreen(innerPadding: PaddingValues, modifier: Modifier = Modifier){
 Column(modifier = modifier
     .padding(innerPadding)
     .fillMaxSize(),
     horizontalAlignment = Alignment.CenterHorizontally) {

     WorkshopHeader("Willkommen", "Android Kotlin Workshop")
     Spacer(modifier = Modifier.height(16.dp))
     TopicInfo("@Composable functions")
     Spacer(modifier = Modifier.height(16.dp))
     StartButton("Start")

 }
}

@Composable
fun WorkshopHeader(
    title:String,
    subtitle: String
){
    Text(title)
    Text(subtitle)
}

@Composable
fun TopicInfo(topic: String){
    Text("Thema: $topic")
}


@Composable
fun StartButton(text: String) {
    Button(onClick = {}) { Text (text) }
}




@Preview(showBackground = true)
@Composable
fun CourseStartScreenPreview(){
    AndroidBasicTheme {
        CourseStartScreen(PaddingValues())
    }
}