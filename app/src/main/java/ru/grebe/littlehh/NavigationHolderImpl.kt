package ru.grebe.littlehh

import android.app.Activity
import android.os.Bundle
import androidx.navigation.Navigation
import ru.grebe.littlehh.app.R
import ru.pervov.utils.NavigationAction
import ru.pervov.utils.NavigationHolder

class NavigationHolderImpl(
    activity: Activity
) : NavigationHolder {

    private val navigation by lazy {
        Navigation.findNavController(activity, R.id.nav_host_fragment)
    }

    override fun doNavigation(navigationAction: NavigationAction) {
        when (navigationAction) {

            is NavigationAction.OpenAuthScreen -> {
                navigation.navigate(R.id.action_global_open_auth_fragment)
            }

            is NavigationAction.OpenMainScreeen -> {
                navigation.navigate(R.id.action_global_open_auth_fragment, args = Bundle().apply {
                    putString("test", navigationAction.param)
                })
            }
        }
    }
}