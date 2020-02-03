package com.erikriosetiawan.trackmysleepquality.sleepquality

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.erikriosetiawan.trackmysleepquality.database.SleepDatabaseDao

@Suppress("UNCHECKED_CAST")
class SleepQualityViewModelFactory(
    private val sleepNight: Long,
    private val dataSource: SleepDatabaseDao
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SleepQualityViewModel::class.java)) {
            return SleepQualityViewModel(sleepNight, dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}