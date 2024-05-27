package com.example.bnk_booking

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.VectorConverter
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bnk_booking.ui.theme.Bnk_bookingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KIM()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KIM() {
    val about = LocalContext.current




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


        Image(
            modifier = Modifier
                .size(100.dp),
            painter = painterResource(id =R.drawable.png_logo),
            contentDescription =""
        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        Text(
            text = "CODE SMATER ,NOT HARDER",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color(0xff6633ff),
            fontWeight = FontWeight.W900
        )

        Text(
            text = "",
            color = Color(0xff3399cc)
        )
        Spacer(modifier = Modifier)

        Button(
            onClick = {
about.startActivity(Intent(about,About::class.java))


            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = ButtonDefaults.outlinedShape
        ) {
            Text(text = "contact")
        }


    }

}
