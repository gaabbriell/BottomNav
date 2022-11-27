package com.example.fragmentsig.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentsig.R


class NotficationFragment : Fragment(R.layout.fragment_notfication) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            NotficationFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }


}