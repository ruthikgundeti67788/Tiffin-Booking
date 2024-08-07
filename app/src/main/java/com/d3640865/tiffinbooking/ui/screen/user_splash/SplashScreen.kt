package com.d3640865.tiffinbooking.ui.screen.user_splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.d3640865.tiffinbooking.R
import com.d3640865.tiffinbooking.ui.localdatabase.TiffinDatabase
import com.d3640865.tiffinbooking.ui.theme.TiffinBookingTheme
import com.d3640865.tiffinbooking.ui.theme.orange
import com.d3640865.tiffinbooking.ui.theme.white
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(navController: NavController,preference:TiffinDatabase) {
    LaunchedEffect(Unit) {
        delay(3.seconds)
        if(preference.isLogin) {
            navController.navigate("TiffinListing") {
                popUpTo("UserSplash") {
                    inclusive = true
                }
            }
        }else{
            navController.navigate("UserLogin") {
                popUpTo("UserSplash") {
                    inclusive = true
                }
            }
        }


    }
    TiffinBookingTheme {
        Scaffold {
            Column(
                modifier = Modifier
                    .background(color = orange)
            ) {
                SmallTopAppBar(
                    title = {
                        Text(
                            text = stringResource(id = R.string.app_name), color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
                        )
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = orange,
                        titleContentColor = Color.White
                    )
                )
                Box(contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.tiffin),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(white)
                    )
                }
            }
        }
    }
}