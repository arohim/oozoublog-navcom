package com.him.oozoublog.navcom.payment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.him.oozoublog.navcom.payment.R

class PaymentFragment : Fragment() {

    private lateinit var historyViewModel: PaymentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        historyViewModel = ViewModelProvider(this).get(PaymentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_payment, container, false)
        val textView: TextView = root.findViewById(R.id.text_payment)
        historyViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }
}