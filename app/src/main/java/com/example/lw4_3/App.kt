package com.example.lw4_3

import android.app.Application
import com.example.lw4_3.domain.RideMockRepository
import com.example.lw4_3.domain.RideSQLiteRepository

class App: Application() {
    fun getRides(): RideMockRepository {
        return rideRepository
    }
    companion object{
        val rideRepository = RideMockRepository()
    }
}