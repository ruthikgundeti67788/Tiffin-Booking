package com.d3640865.tiffinbooking.ui.screen.aboutUs

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.d3640865.tiffinbooking.ui.theme.TiffinBookingTheme
import com.d3640865.tiffinbooking.ui.theme.orange
import com.d3640865.tiffinbooking.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AboutUsScreen(navController: NavController) {
    val context = LocalContext.current

    TiffinBookingTheme {
        Scaffold {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = white)
            ) {
                SmallTopAppBar(
                    title = {
                        Text(
                            text = "About us", color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 18.sp)
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                navController.navigateUp()
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.ArrowBack,
                                tint = Color.White,
                                contentDescription = "Back"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = orange,
                        titleContentColor = Color.White
                    )
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .background(color = white)
                ) {
                    Text(
                        text = "RUTHIK GUNDETI Tiffin services provides north Indian recipes and high-quality ingredients for Tee side students. Students will not miss home if they join our Tiffin services.",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontSize = 18.sp)
                    )
                }
            }
        }


    }
}