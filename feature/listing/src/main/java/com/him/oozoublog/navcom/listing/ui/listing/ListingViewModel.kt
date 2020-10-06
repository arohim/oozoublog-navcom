package com.him.oozoublog.navcom.listing.ui.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Listing Fragment"
    }
    val text: LiveData<String> = _text
}