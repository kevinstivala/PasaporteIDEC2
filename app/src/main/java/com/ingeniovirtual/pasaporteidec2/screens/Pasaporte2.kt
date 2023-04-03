package com.ingeniovirtual.pasaporteidec2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ingeniovirtual.pasaporteidec2.DataBase
import com.ingeniovirtual.pasaporteidec2.R
import com.ingeniovirtual.pasaporteidec2.navigation.AppScreens


@Preview(showBackground = true)
@Composable
private fun preview(){
    Pasaporte2Screen(navController = rememberNavController())
    DataBase()
}

@Composable
fun Pasaporte2Screen(
    navController: NavController
) {

    Column(modifier = Modifier
        .offset(0.dp, -50.dp)
        .fillMaxWidth()
        .fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.mapaaa),
            contentDescription = "Mapa",
            modifier = Modifier
                .size(400.dp)
        )

    }
    Text(
        text = "Mis Colportajes",
        fontWeight = FontWeight.Black,
        fontSize = 25.sp ,
        style = MaterialTheme.typography.h1,
        color = Color(0xff14466D),
        modifier = Modifier
            .padding(70.dp, 0.dp)
            .offset(60.dp, 20.dp)
    )

    Column(
        Modifier
            .background(color = Color(0xFFFFFF))
    ) {
        Button(
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .padding(15.dp)
                .size(60.dp),


            onClick = {
                navController.navigate(AppScreens.Pasaporte1.route)
            }

        ) {
            Row() {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.izqq),
                        contentDescription = "Play",
                        tint = Color(0xff14466D),
                        modifier = Modifier
                            .size(30.dp)

                    )
                }
            }


        }

    }
    DataBase()
}




