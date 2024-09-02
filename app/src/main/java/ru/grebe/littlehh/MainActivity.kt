package ru.grebe.littlehh

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.grebe.littlehh.app.R
import ru.grebe.littlehh.auth.Test213213

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Test213213 = Test213213()
        Log.d("checkResult", "onCreate: $Test213213")
    }
}