package com.example.spacexmobileapp.navigation

sealed class Screen(
    val route: String
) {
    data object Main : Screen("main")
    data object RocketsCompany : Screen("rocket")
    data object Crew : Screen("crew")
    data object History : Screen("history")

}