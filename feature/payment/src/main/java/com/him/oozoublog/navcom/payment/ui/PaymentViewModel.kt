package com.him.oozoublog.navcom.payment.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PaymentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is shopping cart Fragment"
    }
    val text: LiveData<String> = _text
}