package com.example.e_jaby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =  inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<Button>(R.id.btnProfile).setOnClickListener{
//            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(11, "Hello")
            view.findNavController().navigate(R.id.action_homeFragment_to_profileFragment2)
        }


        view.findViewById<Button>(R.id.btnSettings).setOnClickListener{view.findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)}

        return view
    }

}