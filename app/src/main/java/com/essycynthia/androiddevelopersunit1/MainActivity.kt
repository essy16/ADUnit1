package com.essycynthia.androiddevelopersunit1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.essycynthia.androiddevelopersunit1.ui.theme.AndroidDevelopersUnit1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDevelopersUnit1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .wrapContentSize(Alignment.Center)


        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.ic_android_black_24dp),
                    contentDescription = "AndroidIcon",
                    modifier = Modifier
                        .size(30.dp)
                        .align(Alignment.Center)
                )

            }
            Text(text = "Esther Cynthia", fontSize = 20.sp, textAlign = TextAlign.Center)
            Text(text = "Android developer", fontSize = 20.sp, textAlign = TextAlign.Center)


        }
        Row() {
            Image(
                painter = painterResource(id = R.drawable.baseline_email_24),
                contentDescription = "EmailIcon",
                modifier = Modifier
                    .size(30.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "essycynthia7@gmail.com", fontSize = 20.sp, textAlign = TextAlign.Center)


        }
        Spacer(modifier = Modifier.height(5.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.baseline_local_phone_24),
                contentDescription = "PhoneIcon",
                modifier = Modifier
                    .size(30.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "+25471234567", fontSize = 20.sp, textAlign = TextAlign.Center)


        }
        Spacer(modifier = Modifier.height(5.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.baseline_people_24),
                contentDescription = "SocialMediaIcon",
                modifier = Modifier
                    .size(30.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "I am not in any social media ",
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )


        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    AndroidDevelopersUnit1Theme {
        BusinessCard()
    }
}