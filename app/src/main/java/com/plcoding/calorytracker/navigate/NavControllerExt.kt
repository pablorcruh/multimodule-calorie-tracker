package com.plcoding.calorytracker.navigate

import androidx.navigation.NavController
import com.plcoding.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}