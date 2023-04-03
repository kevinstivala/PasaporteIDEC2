package com.ingeniovirtual.pasaporteidec2.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ingeniovirtual.pasaporteidec2.R
import com.ingeniovirtual.pasaporteidec2.navigation.AppScreens
import com.ingeniovirtual.pasaporteidec2.ui.theme.*
import com.ingeniovirtual.pasaporteidec2.utils.Feature
import com.ingeniovirtual.pasaporteidec2.utils.standardQuadFromTo


@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
private fun preview(){
    PasaporteScreen(navController = rememberNavController())
}

@ExperimentalFoundationApi
@Composable
fun PasaporteScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        Column {

            GreetingSection()
            CurrentMeditation(navController)
            ChipSection(chips = listOf("40% de Descuento", "90% de Descuento", "30% de Descuento"))

            FeatureSection(
                features = listOf(
                    Feature(
                        title = "Auriculares",
                        R.drawable.ic_headphone,
                        BlueViolet1,
                        BlueViolet2,
                        BlueViolet3
                    ),
                    Feature(
                        title = "Lapiz IDEC",
                        R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                    Feature(
                        title = "Gorra IDEC",
                        R.drawable.ic_headphone,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    ),
                    Feature(
                        title = "Mochila",
                        R.drawable.ic_headphone,
                        Beige1,
                        Beige2,
                        Beige3
                    ) ,
                    Feature(
                        title = "Remera UAP",
                        R.drawable.ic_headphone,
                        Beige1,
                        Beige2,
                        Beige3
                    ),
                    Feature(
                        title = "Tips for sleeping",
                        R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    )
                )
            )
        }
    }
}

@Composable
fun Progreso(){
    Box(modifier= Modifier
        .offset(-25.dp)){
        CircularProgressBarr(porcentage = 0.4f, number = 100)
    }
}


@Composable
fun GreetingSection(
    name: String = "Kevin",
    apellido: String = "Stivala",
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier .fillMaxWidth()

    ) {

        Image(
            painter = painterResource(id = R.drawable.k), contentDescription = "Contact",
            modifier = Modifier
                .padding(20.dp, 10.dp)
                .size(80.dp)
                .clip(CircleShape)
                .background(color = Color(0xFF254559))

        )


        Column(
        ) {

            Text(
                text = "$name $apellido",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp ,
                color = Color(0xff06164c),
                modifier = Modifier
                    .offset(-50.dp)

            )


        }
        Column() {
            Progreso()
        }

    }

}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(30.dp, 0.dp, 30.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp, 40.dp)
            ) {
                Text(text = chips[it], color = TextWhite,
                    fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Composable
fun CircularProgressBarr(
    porcentage:Float,
    number: Int,
    radius: Dp = 30.dp,
    color: Color = Color(0xFF13455A),
    strockeWidth: Dp = 8.dp,
    animDuration: Int= 1000,
    animDelay: Int=0,
) {
    var animationPlayer by remember {
        mutableStateOf(false)
    }
    val curPercentage = animateFloatAsState(
        targetValue = if (animationPlayer) porcentage else 0f,
        animationSpec = tween(
            durationMillis = animDuration,
            delayMillis = animDelay
        )
    )
    LaunchedEffect(key1 = true) {
        animationPlayer = true
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(radius * 2f)
            .padding(3.dp)
    )
    {
        Canvas(modifier = Modifier.size(radius * 2f)) {
            drawArc(
                color = color,
                -90f,
                360 * curPercentage.value,
                useCenter = false,
                style = Stroke(strockeWidth.toPx(), cap = StrokeCap.Round)

            )
        }
        Text(
            text = (curPercentage.value * number).toInt().toString(),
            color = Color(0xff06164c),
            fontWeight = FontWeight.Medium,
            fontSize = 25.sp,
        )

    }
    Text(
        text = "Puntos",
        fontSize = 20.sp,
        style = MaterialTheme.typography.body2,
        color = Color(0xff06164c),
        modifier = Modifier
            .offset(0.dp,60.dp)
    )
}

@Composable
fun CurrentMeditation(
    navController: NavController,
    color: Color = LightRed
) {

    Button(
        shape = RoundedCornerShape(30),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff14466D)),
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth(),

        onClick = {
        navController.navigate(AppScreens.Pasaporte2.route)
        }

    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,) {
            Text(
                text = "Mi Pasaporte",
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp ,
                style = MaterialTheme.typography.h1,
                color = (AquaBlue),
                modifier = Modifier .padding(70.dp,20.dp)
                    .offset(-70.dp)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.w),
                    contentDescription = "Play",
                    tint = (AquaBlue),
                    modifier = Modifier.size(30.dp)

                )
            }
        }

    }
}


@ExperimentalFoundationApi
@Composable
fun FeatureSection(features: List<Feature>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Canjes por puntos",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 24.sp ,
            color = Color(0xff06164c),
            modifier = Modifier.padding(15.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            items(features.size) {
                FeatureItem(feature = features[it])
            }
        }
    }
}

@Composable
fun FeatureItem(
    feature: Feature
) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(feature.darkColor)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        // Medium colored path
        val mediumColoredPoint1 = Offset(0f, height * 0.3f)
        val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
        val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
        val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        // Light colored path
        val lightPoint1 = Offset(0f, height * 0.35f)
        val lightPoint2 = Offset(width * 0.1f, height * 0.4f)
        val lightPoint3 = Offset(width * 0.3f, height * 0.35f)
        val lightPoint4 = Offset(width * 0.65f, height.toFloat())
        val lightPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)

        val lightColoredPath = Path().apply {
            moveTo(lightPoint1.x, lightPoint1.y)
            standardQuadFromTo(lightPoint1, lightPoint2)
            standardQuadFromTo(lightPoint2, lightPoint3)
            standardQuadFromTo(lightPoint3, lightPoint4)
            standardQuadFromTo(lightPoint4, lightPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }
        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {
            drawPath(
                path = mediumColoredPath,
                color = feature.mediumColor
            )
            drawPath(
                path = lightColoredPath,
                color = feature.lightColor
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Text(
                text = feature.title,
                fontWeight = FontWeight.Bold,
                lineHeight = 26.sp,
                fontSize = 20.sp ,
                modifier = Modifier.align(Alignment.TopCenter),
                color = Color.White
            )
            Icon(
                painter = painterResource(id = feature.iconId),
                contentDescription = feature.title,
                tint = Color.White,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text = "Ganar",
                color = TextWhite,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        // Handle the click
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ButtonBlue)
                    .padding(vertical = 6.dp, horizontal = 15.dp)
            )
        }
    }
}