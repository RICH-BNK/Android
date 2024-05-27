package com.example.bnk_booking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Home_stretch : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            dipcatfuga()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun dipcatfuga() {
    Column (
        modifier= Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding (20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "BNK DEVELOPERS",
            fontSize = 30.sp,
            color = Color.White,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.W900

        )
        Spacer(
            modifier = Modifier
                .height(5.dp)
        )
        Text(
            text = "CODE SMATER ,NOT HARDER",
            fontSize = 10.sp,
            fontFamily = FontFamily.Serif,
            color = Color(0xff6633ff),
            fontWeight = FontWeight.W900
        )

        Text(
            text = "welcome to our application",
            color = Color(0xff3399cc)
        )
        Spacer(modifier = Modifier)

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = ButtonDefaults.outlinedShape
        ) {
            Text(text = "pay in for the services")
        }
        Image(
            modifier = Modifier
                .size(100.dp),
            painter = painterResource(id =R.drawable.logo),
            contentDescription =""
        )

     }

    }



