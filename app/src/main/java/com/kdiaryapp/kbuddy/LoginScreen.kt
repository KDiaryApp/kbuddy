package com.kdiaryapp.kbuddy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.shape.RoundedCornerShape


import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import kotlin.math.round


class LoginScreen {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun wholeView() {
    Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
    ) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
//                .weight(1f)
        ) {
			/*
				- The painter proeprty is still not properly set.
				- I also want to have a nice indicator of being a click icon, not just plain flat icon.
			*/
            IconButton (
//                painter = painterResource(id = R.mipmap.avatar_foreground),
//                contentDescription = null,
//                modifier = Modifier
//                        .clip(RoundedCornerShape(50.dp))
//                        .size(70.dp)
//                    .align(Alignment.Start)
                //                .align(Alignment.Top),
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.mipmap.avatar),
                    contentDescription =  null
                )
            }
        }
        Column(
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                        .weight(1f)
        ) {

            //        Spacer(
            //            modifier = Modifier.size(10.dp)
            //        )

            Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                            .fillMaxWidth()
            ) {
                Text(
                        text = "Hey,",
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        fontSize = 20.sp
                )
                Text(
                        text = "Login Now!",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Light,
                        color = Color.Gray,
                        fontSize = 20.sp
                )
            }

			/*
				TODO - They're still not properly set to in a properly layout.
			*/
            Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                            .padding(10.dp)
            ) {
                val roundedCornerSize = 10.dp
                TextField(
                        value = "Email",
                        onValueChange = { value ->
                        },
                        modifier = Modifier
                                .clip(RoundedCornerShape(roundedCornerSize))
                )
                //        modifier = Modifier
                //            .clip(RoundedCornerShape(50.dp))
                //            .size(100.dp)
                Spacer(
                        modifier = Modifier
                                .size(10.dp)
                )
                TextField(
                        value = "Password",
                        onValueChange = { value ->
                        },
                        modifier = Modifier
                                .clip(RoundedCornerShape(roundedCornerSize))
                )
            }

            Row() {
                Text(
                        text = "Forgot Password? / ",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Light,
                )
                TextButton(
//                        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier
                        .padding(0.dp),
                        onClick = {}
                ) {
                    Text(text = "Reset")
//                    fontStyle = FontStyle.Normal,
//                    fontWeight = FontWeight.SemiBold
                }
            }

            Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(R.color.figma_button)),
                    modifier = Modifier
                    //                .width(10.dp)
                    //                .height(10.dp)
            ) {
                Text(text = "Login Now")
            }
        }
    }
}
