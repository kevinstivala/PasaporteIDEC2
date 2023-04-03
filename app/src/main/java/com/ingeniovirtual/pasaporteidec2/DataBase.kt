package com.ingeniovirtual.pasaporteidec2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DataBase(){

    // Caja de Viajes//
    Box() {
        var Ida : String = "LSM"
        var Vuelta : String ="BRC"
        Column(
            modifier = Modifier
                .padding(10.dp, 150.dp)
                .size(400.dp, 150.dp)
                .background(
                    color = Color(0xFF14466D),
                    shape = RoundedCornerShape(10, 5, 5, 10)
                )
        ) {


            Row() {

                Text(text = "$Ida",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 50.sp ,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .offset(30.dp,10.dp))

                Text(text = "$Vuelta",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 50.sp ,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .offset(130.dp,10.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_connecting_airports_24),
                    contentDescription = "Play",
                    tint = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .size(50.dp)
                        .offset(-40.dp, 30.dp)

                )
            }

            Row() {
                Text(text = "Villa Libertador San Martin",
                    fontWeight = FontWeight.Light,
                    fontSize = 10.sp ,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .offset(30.dp,1.dp))
                Text(text = "Bariloche",
                    fontWeight = FontWeight.Light,
                    fontSize = 10.sp ,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .offset(150.dp,1.dp))

            }
            Row(){
                Text(text = "Estado",
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp ,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .offset(50.dp, 15.dp)
                        .height(50.dp))

                Text(text = "Fecha",
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .offset(218.dp,15.dp)
                )
            }
            Row {
                Text(text = "17/02/2000",
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .offset(245.dp,-10.dp))
                Text(text = "Vigente",
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .offset(-30.dp,-10.dp))
            }

        }
    }
    CircleShapeDemo()
}
@Composable
fun CircleShapeDemo(){
    ExampleBox(shape = CircleShape)
}

@Composable
fun ExampleBox(shape: Shape){
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)) {
        Box(
            modifier = Modifier
                .padding(170.dp, 130.dp)
                .size(40.dp)
                .clip(shape)
                .background(Color(0xFF14466D))
        )
    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)) {
        Box(
            modifier = Modifier
                .padding(170.dp, 140.dp)
                .size(20.dp)
                .clip(shape)
                .background(Color(0xFF8BC34A))
        )
    }
}
