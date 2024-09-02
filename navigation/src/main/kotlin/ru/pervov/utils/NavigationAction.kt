package ru.pervov.utils

sealed class NavigationAction {

    // client
    class OpenAuthScreen() : NavigationAction()

    class OpenMainScreeen(val param: String) : NavigationAction()


}