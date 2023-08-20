package com.example.uberbookingexperience.ui.screens.cabswithmap

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.uberbookingexperience.R
import com.example.uberbookingexperience.model.UberCabInfo

class UberMapScreenVM : ViewModel() {

    fun selectItem(selectedUberCabIndex: Int) {
        cabListing.forEach {
            it.isChecked = false
        }
        cabListing[selectedUberCabIndex] = cabListing[selectedUberCabIndex].copy(isChecked = true)
        selectedUberCab = cabListing[selectedUberCabIndex]
    }

    fun selectItem(selectedUberCabItem: UberCabInfo) {
        cabListing.map {
            it.isChecked = it == selectedUberCabItem
        }
        selectedUberCab = selectedUberCabItem
    }

    fun selectedItem(): UberCabInfo {
        return selectedUberCab ?: cabListing.first()
    }

    var cabListing = mutableStateListOf(
        UberCabInfo(
            cabInfo = " Car Pool",
            cabIcon =
            R.drawable.ub__mode_nav_carpool,
            cabPrice = 80.80f,
            isChecked = true,
            cabPriceAlter = 100.20f,
            carTime = "3:09 PM"
        ),

        UberCabInfo(
            cabInfo = "Bike Scooter",
            cabIcon =
            R.drawable.ub__mode_nav_bike_scooter,
            cabPrice = 120.80f,
            carTime = "11:19 AM"
        ),
        UberCabInfo(
            cabInfo = "Auto Pool",
            cabIcon =
            R.drawable.auto,
            cabPrice = 80.80f,
            cabPriceAlter = 100.20f,
            carTime = "3:09 PM"
        ),
        UberCabInfo(
            cabInfo = " Bus",
            cabIcon =
            R.drawable.bus,
            cabPrice = 120.80f,
            carTime = "11:19 AM"
        ),
        UberCabInfo(
            cabInfo = "Metro",
            cabIcon =
            R.drawable.metro,
            cabPrice = 80.80f,
            cabPriceAlter = 110.20f,
            carTime = "1:19 PM"
        )
    )
    var selectedUberCab: UberCabInfo? = null
}
