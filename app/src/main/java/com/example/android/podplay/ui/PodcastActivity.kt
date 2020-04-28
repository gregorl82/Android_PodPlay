package com.example.android.podplay.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.android.podplay.R
import com.example.android.podplay.repository.ItunesRepo
import com.example.android.podplay.service.ItunesService

class PodcastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcast)

        val TAG = javaClass.simpleName

        val itunesService = ItunesService.instance

        val itunesRepo = ItunesRepo(itunesService)

        itunesRepo.searchByTerm("Android Developer", {Log.i(TAG, "Results = $it")})
    }
}
