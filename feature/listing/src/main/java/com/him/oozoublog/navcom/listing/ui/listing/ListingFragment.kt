package com.him.oozoublog.navcom.listing.ui.listing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.him.oozoublog.navcom.listing.R

class ListingFragment : Fragment() {

    private lateinit var listingViewModel: ListingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        listingViewModel =
            ViewModelProvider(this).get(ListingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_listing, container, false)
        val textView: TextView = root.findViewById(R.id.text_listing)
        listingViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }
}