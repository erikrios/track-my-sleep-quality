package com.erikriosetiawan.trackmysleepquality.sleepquality


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.erikriosetiawan.trackmysleepquality.R
import com.erikriosetiawan.trackmysleepquality.database.SleepDatabase
import com.erikriosetiawan.trackmysleepquality.databinding.FragmentSleepQualityBinding

/**
 * A simple [Fragment] subclass.
 */
class SleepQualityFragment : Fragment() {

    @SuppressLint("FragmentLiveDataObserve")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepQualityBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sleep_quality, container, false
        )

        val application = requireNotNull(this.activity).application
        val arguments = SleepQualityFragmentArgs.fromBundle(arguments!!)
        val dataSource = SleepDatabase.getInstance(application).sleepDatabaseDao
        val viewModelFactory = SleepQualityViewModelFactory(arguments.sleepNightKey, dataSource)
        val sleepQualityViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(SleepQualityViewModel::class.java)
        binding.sleepQualityViewModel = sleepQualityViewModel

        sleepQualityViewModel.navigateToSleepTracker.observe(this, Observer {
            if (it == true) { // Observed state is true.
                SleepQualityFragmentDirections.actionSleepQualityFragmentToSleepTrackerFragment()
                sleepQualityViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}
