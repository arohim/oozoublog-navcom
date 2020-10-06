package com.him.oozoublog.navcom.shoppingcart.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoppingCartViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is shopping cart Fragment"
    }
    val text: LiveData<String> = _text
}