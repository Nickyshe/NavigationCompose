package com.example.navigationcompose.model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MyViewModel:ViewModel() {
   private  var _state = MutableStateFlow(
       Details(
           "",
           "",
           ""
       ))


    val stateFlow: StateFlow<Details> = _state
    fun update(details: Details) { //this function will update the data passed in screen 2 to screen 1
        _state.value = details


    }

}