package com.example.bnk_booking

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.bnk_booking.ui.theme.Bnk_bookingTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
tops()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun tops(){
    var name by remember{
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember{
        mutableStateOf(TextFieldValue(""))
    }
    var click= LocalContext.current
    var  forget= LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()
   )
    Image(painter = painterResource(id = R.drawable.pin4), contentDescription =null,
     modifier = Modifier.fillMaxSize(),
     contentScale = ContentScale.Crop

        )
    LazyColumn {

    }

    Column (
        modifier= Modifier
            .fillMaxSize()

        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ){
        Image(
            modifier = Modifier
                .size(250.dp),
            painter = painterResource(id =R.drawable.png_logo),
            contentDescription =""
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(text = "WELCOME TO BNK DEVELOPERS ",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            fontWeight = FontWeight.W900
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )

        Text(text = "For more clarrifications,kindly login and come with your ID ",
            fontSize = 10.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            fontWeight = FontWeight.W900
        )

        Spacer(
            modifier = Modifier
                .height(50.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = name,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Black,
                focusedBorderColor = Color.Blue,
                focusedLabelColor = Color.Blue
            ),
            onValueChange ={name =it},
            label ={ Text(text="User Name")}
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value =password,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Black,
                focusedBorderColor = Color.Blue,
                focusedLabelColor = Color.Blue
            ),
            onValueChange ={password =it},
            label ={ Text(text="Password")},
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(
            modifier = Modifier
                .height(50.dp)
        )
        Button(
            onClick = {
                click.startActivity(Intent(click,loginpage::class.java))


            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = ButtonDefaults.outlinedShape
        ) {
            Text(text = "LOGIN")
        }
        Text(text = "Forgot Password ?",
            modifier = Modifier
                .clickable {forget.startActivity(Intent(forget,MainActivity3::class.java))  },
            fontSize = 10.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            fontWeight = FontWeight.W900
        )

        Text(text = "OR",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            fontWeight = FontWeight.W900
        )

       Row {
           Text(text = "Not a member ? ",
               fontSize = 10.sp,
               fontFamily = FontFamily.Serif,
               color = Color.Black,
               fontWeight = FontWeight.W900
           )
           Text(text = "SIGN UP !",
               modifier = Modifier
                   .clickable {forget.startActivity(Intent(forget,MainActivity3::class.java))  },
               fontSize = 10.sp,
               fontFamily = FontFamily.Serif,
               color = Color.White,
               fontWeight = FontWeight.W900
           )

       }
        AsyncImage(
            model = "https://www.airbnb.com/rooms/1131089498040701183?adults=1&category_tag=Tag%3A8851&children=0&enable_m3_private_room=true&infants=0&pets=0&search_mode=flex_destinations_search&source_impression_id=p3_1716798750_MD5sBmKis%2FyEfjjq&previous_page_section_name=1000&federated_search_id=cb62c201-bc23-4624-aed2-4cfa737b7e28",
            contentDescription = null,
        )


    }




}