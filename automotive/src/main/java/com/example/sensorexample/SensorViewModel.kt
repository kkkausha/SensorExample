package com.example.sensorexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SensorViewModel : ViewModel() {
    private val _lightSensorData = MutableStateFlow(0f)
    val lightSensorData : StateFlow<Float> get()= _lightSensorData
    val _acclerometerData = MutableStateFlow(0f)
    fun updateLightSensorData(value: Float){
        viewModelScope.launch {
            _lightSensorData.value = value
        }
    }
    fun updateAcclerometerData(value: Float){
        viewModelScope.launch {
            _acclerometerData.value = value
        }
    }
}