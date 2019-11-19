package com.reynaldiwijaya.learnmodular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reynaldiwijaya.teams.ui.TeamsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flMain, TeamsFragment())
            .commit()
    }
}
