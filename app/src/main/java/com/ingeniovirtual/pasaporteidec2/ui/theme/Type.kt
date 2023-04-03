package com.ingeniovirtual.pasaporteidec2.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.ingeniovirtual.pasaporteidec2.R

//GOOGLE FONTS
@OptIn(ExperimentalTextApi::class)
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)
@OptIn(ExperimentalTextApi::class)
val poppinsFontName = GoogleFont("Poppins")

@OptIn(ExperimentalTextApi::class)
val Poppins = FontFamily(
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Thin),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.ExtraLight),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Light),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Normal),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Medium),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.SemiBold),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Bold),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.ExtraBold),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Black),
    //Italic:
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Thin, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.SemiBold, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(googleFont = poppinsFontName, fontProvider = provider, weight = FontWeight.Black, style = FontStyle.Italic)
)



// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)