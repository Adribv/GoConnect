package com.example.uberbookingexperience.ui.screens.dashboard.components

import androidx.compose.runtime.Immutable
import com.example.uberbookingexperience.R

@Immutable
data class RideOptions(
    val title: String,
    val image: Int
)

fun getRideOptions() : List<RideOptions> {
    val options = arrayListOf<RideOptions>()

    options.add(RideOptions("Metro", R.drawable.metro))
    options.add(RideOptions("Bus", R.drawable.bus))
    options.add(RideOptions("Carpool", R.drawable.ub__mode_nav_carpool))
    options.add(RideOptions("Bus", R.drawable.bus))
    options.add(RideOptions("Auto Pool", R.drawable.auto))
    options.add(RideOptions("Bike", R.drawable.ub__mode_nav_bike_scooter))


    return options
}
