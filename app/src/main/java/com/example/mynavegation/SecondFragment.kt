package com.example.mynavegation

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_id).setOnClickListener{
            // chamar as ações de navegação
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }


    }

}