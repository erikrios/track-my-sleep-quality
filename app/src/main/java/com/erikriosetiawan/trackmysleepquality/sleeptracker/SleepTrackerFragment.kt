package com.erikriosetiawan.trackmysleepquality.sleeptracker


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.erikriosetiawan.trackmysleepquality.R
import com.erikriosetiawan.trackmysleepquality.databinding.FragmentSleepTrackerBinding

/**
 * A simple [Fragment] subclass.
 */
class SleepTrackerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepTrackerBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sleep_tracker,
            container,
            false
        )

        return binding.root
    }


}
