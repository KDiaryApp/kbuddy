package com.kdiaryapp.kbuddy

import androidx.annotation.ColorRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.ClickableText

import androidx.compose.material3.Button
import androidx.compose.material3.TextButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import kotlin.math.round

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val loginButtonWidth =
        280.dp   // Having the same width for all elements (based off the login button) to achieve a bit of consistency.
    Column(
//        verticalArrangement = Arrangement.SpaceAround,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
//            .weight(1f)
            .background(Color.White)
            .fillMaxSize()
    ) {

        /*
                - The painter proeprty is still not properly set.
                - I also want to have a nice indicator of being a click icon, not just plain flat icon.
            */
        IconButton(
            onClick = {},
//                painter = painterResource(id = R.mipmap.avatar_foreground),
//                contentDescription = null,
            modifier = Modifier
                .align(alignment = Alignment.Start)
                .weight(1F)
//                        .clip(RoundedCornerShape(50.dp))
//                        .size(70.dp)
//                        .align(Alignment.Start)
        ) {
            Icon(
                /*
                    - I can't load in the avatar image, and use it for this Icon
                 */
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,       // Accessibility feature
                modifier = Modifier
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
//                .fillMaxWidth()
                .weight(4F)
                .width(loginButtonWidth)
        ) {
            val LightTextStyle = TextStyle(
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light,
                color = Color.Gray
            )
            val BoldTextStyle = TextStyle(
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
            )
            Text(
                text = "Hey,",
                style = BoldTextStyle,
                fontSize = 50.sp,
                modifier = Modifier
                    .align(Alignment.Start)
            )
            Text(
                text = "Login Now!",
                style = LightTextStyle,
                fontSize = 40.sp,
                modifier = Modifier
                    .align(Alignment.Start)
            )
            Spacer(
                modifier = Modifier
                    .size(20.dp)
            )
            Row (
                modifier = Modifier
                    .align(Alignment.Start)
            ) {
                Text (
                    text = "I am already registered",
                    style = LightTextStyle
                )
                Text (
                    text = " / "
                )
                Text(
                    text = "Create New",
                    style = BoldTextStyle,
                    color = colorResource(id = R.color.purple_700),
                    modifier = Modifier
                        .clickable { /*
                            TODO
                            - I guess for now I should have some kind of a different screen for logging in,
                            but most importantly, an intermediary blocking method that pretty much takes time
                            mimicking a real life logging/networking/authenticating/ scenario, so that the app architecture
                            gets developed rightfully from the get go, with mockup code.
                        */ }
                )
            }
        }

        /*
                TODO - They're still not properly set to in a properly layout.
            */
        Column(
            verticalArrangement = Arrangement.SpaceAround,
//                horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .weight(3F)
        ) {
            val roundedCornerSize = 10.dp
            TextField(
                value = "Email",
                onValueChange = { value -> },
                modifier = Modifier
                    .clip(RoundedCornerShape(roundedCornerSize))
            )
            TextField(
                value = "Password",
                onValueChange = { value -> },
                modifier = Modifier
//                        .clip(RoundedCornerShape(roundedCornerSize))
            )
            Row(
                modifier = Modifier
                    .align(Alignment.Start)
            ) {
                Text(
                    text = "Forgot Password?",
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray
                )
                //            .height(intrinsicSize = IntrinsicSize.Max)
                Text (
                    text = " / "
                )
                Text(
                    text = "Reset",
                    //                    textAlign = TextAlign.End,
                    style = TextStyle(color = colorResource(id = R.color.purple_700)),
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                        .clickable { /*TODO*/ }
                )
                //            fontStyle = FontStyle.Normal,
                //            fontWeight = FontWeight.SemiBold
            }
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(2F)
                .width(loginButtonWidth)
        ) {

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(colorResource(id = R.color.figma_button).value)),
                modifier = Modifier
                    .width(loginButtonWidth)
                //                .width(10.dp)
                //                .height(10.dp)
            ) {
                Text(
                    text = "Login Now",
                )
            }

            TextButton(
                onClick = { /*TODO*/ },
            ) {
                /*
                    - TODO: Text that can be clicked should be probably be swapped out with a more idiomatic 'ClickableText' composable instead.
                 */
                Text (
                    text = "Skip Now"
                )
            }
        }
    }
}

@Composable
fun LoggedInUsers() {
    /*
        TODO
            - I guess this function should be wrapped in a time-consuming blocking function,
             in order to be handled asynchronously.
            - I'm planning on having a mockup code of a list of names, that are returned after a while,
            mocking a real life IO retrieval of data from a local database of cached accounts.
     */
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Spacer(
            modifier = Modifier
                .background(
                    color = Color.Gray.copy(alpha = 0.8f)
                )
                .matchParentSize()
        )
        Column () {
            Text(text = "Logged in users!!")
            // This is code is to be wrapped up with a time-consuming task
            Row () {
                Text(text = "Adams")
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Login in")
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenTotal() {
    LoginScreen()
//    LoggedInUsers()
}
