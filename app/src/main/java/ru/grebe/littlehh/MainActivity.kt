package ru.grebe.littlehh

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.grebe.littlehh.app.R
import ru.pervov.utils.NavigationAction
import ru.pervov.utils.NavigationHolder

class MainActivity : AppCompatActivity(), NavigationHolder {

    private val navigationHolderImpl = NavigationHolderImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun doNavigation(navigationAction: NavigationAction) {
        navigationHolderImpl.doNavigation(navigationAction)
    }
}