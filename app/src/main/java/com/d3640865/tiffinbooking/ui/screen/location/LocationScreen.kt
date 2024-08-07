package com.d3640865.tiffinbooking.ui.screen.location

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
fun LocationScreen(navController: NavController) {
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
                            text = "RUTHIK GUNDETI Tiffin POPULAR LOCATIONS", color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
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
                        text = "⦁ London",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Birmingham",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Manchester",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Liverpool",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Leeds",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Sheffield",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Teesside",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                    Text(
                        text = "⦁ Bristo",
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth(),
                        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    )
                }
            }
        }


    }
}