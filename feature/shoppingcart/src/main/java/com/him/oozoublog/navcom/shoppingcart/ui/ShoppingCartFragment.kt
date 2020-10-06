package com.him.oozoublog.navcom.shoppingcart.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.him.oozoublog.navcom.shoppingcart.R

class ShoppingCartFragment : Fragment() {

    private lateinit var historyViewModel: ShoppingCartViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        historyViewModel = ViewModelProvider(this).get(ShoppingCartViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_shopping_cart, container, false)
        val textView: TextView = root.findViewById(R.id.text_shopping_cart)
        historyViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}