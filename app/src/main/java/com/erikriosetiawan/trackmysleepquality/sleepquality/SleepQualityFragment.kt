package com.erikriosetiawan.trackmysleepquality.sleepquality


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.erikriosetiawan.trackmysleepquality.R
import com.erikriosetiawan.trackmysleepquality.databinding.FragmentSleepQualityBinding

/**
 * A simple [Fragment] subclass.
 */
class SleepQualityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepQualityBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sleep_quality, container, false
        )

        val application = requireNotNull(this.activity).application

        return binding.root
    }


}
