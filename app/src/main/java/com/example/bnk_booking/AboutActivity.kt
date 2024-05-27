package com.example.bnk_booking

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class About : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            contact()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun contact(){
    var click= LocalContext.current

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {



Text(text = "Contact us : ",
    fontSize = 20.sp,
    fontFamily = FontFamily.Serif,
    color = Color.Black,
    fontWeight = FontWeight.W900
    )


        Spacer(
            modifier = Modifier
                .height(60.dp)
        )


Row {
    Image(
        modifier = Modifier
            .size(30.dp),
        painter = painterResource(id =R.drawable.icon1),
        contentDescription =""
    )

    Spacer(
        modifier = Modifier
            .width(77.dp)
    )


    Text(text = "+254727700955  ",
        fontSize = 20.sp,
        fontFamily = FontFamily.Serif,
        color = Color.Black,
        fontWeight = FontWeight.W900
    )

}

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        Row {
            Image(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id =R.drawable.appicon),
                contentDescription =""
            )

            Spacer(
                modifier = Modifier
                    .width(77.dp)
            )


            Text(text = "+254727004144  ",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black,
                fontWeight = FontWeight.W900
            )

        }

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )


        Row {
            Image(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id =R.drawable.gramicon),
                contentDescription =""
            )

            Spacer(
                modifier = Modifier
                    .width(50.dp)
            )


            Text(text = " BNKDEVELOPERS ",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black,
                fontWeight = FontWeight.W900
            )

        }

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        Row {
            Image(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id =R.drawable.fbicon),
                contentDescription =""
            )

            Spacer(
                modifier = Modifier
                    .width(50.dp)
            )


            Text(text = "BNKDEVELOPERS  ",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black,
                fontWeight = FontWeight.W900
            )

        }

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )


        Row {
            Image(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id =R.drawable.xicon),
                contentDescription =""
            )

            Spacer(
                modifier = Modifier
                    .width(50.dp)
            )


            Text(text = "BNKDEVELOPERS  ",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black,
                fontWeight = FontWeight.W900
            )

        }



        Spacer(
            modifier = Modifier
                .height(30.dp)
        )




        Button(
            onClick = {
                click.startActivity(Intent(click,MainActivity2::class.java))


            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = ButtonDefaults.outlinedShape
        ) {
            Text(text = "LOGIN")
        }




    }



}