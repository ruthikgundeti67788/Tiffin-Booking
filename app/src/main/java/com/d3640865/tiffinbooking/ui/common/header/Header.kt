package com.d3640865.tiffinbooking.ui.common.header

import androidx.compose.foundation.background
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.d3640865.tiffinbooking.R
import com.d3640865.tiffinbooking.ui.theme.orange
import com.d3640865.tiffinbooking.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(
    navController: NavController,
    onButtonClick: () -> Unit,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    if (currentRoute == null || currentRoute == "UserLogin") {
        return
    }

    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name), color = white)
        },
        modifier = androidx.compose.ui.Modifier
            .background(orange),
        navigationIcon = {
            IconButton(onClick = {
                onButtonClick()
            }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null,
                    tint = white
                )
            }
        },
        backgroundColor = orange
    )
}