package com.example.uberbookingexperience.ui.screens.dashboard.components

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun BottomTabs() {

    val tabsList by rememberSaveable {
        mutableStateOf(
            listOf(
                "Home" to Icons.Default.Home,
                "Account" to Icons.Default.AccountBox
            )
        )
    }
    var tabIndex by remember { mutableStateOf(0) }

    Surface(shadowElevation = AppBarDefaults.BottomAppBarElevation) {
        TabRow(
            modifier = Modifier.navigationBarsPadding(),
            selectedTabIndex = tabIndex,
            backgroundColor = MaterialTheme.colorScheme.onPrimary,
            contentColor = MaterialTheme.colorScheme.primary,
        ) {
            tabsList.forEachIndexed { index, _ ->
                Tab(
                    icon = {
                        Icon(
                            imageVector = tabsList[index].second,
                            contentDescription = null
                        )
                    },
                    text = {
                        Text(
                            tabsList[index].first, style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight.Medium
                            )
                        )
                    },
                    selected = tabIndex == index,
                    onClick = {
                        tabIndex = index
                    }
                )
            }
        }
    }
}
