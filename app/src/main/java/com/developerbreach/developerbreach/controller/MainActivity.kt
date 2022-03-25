package com.developerbreach.developerbreach.controller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import com.developerbreach.developerbreach.fcm.setNotificationChannel
import com.developerbreach.developerbreach.navigation.AppNavigation
import com.developerbreach.developerbreach.ui.theme.BlueTheme


class MainActivity : ComponentActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BlueTheme {
                AppNavigation()
            }
        }

        // NavigationController to set default NavHost as nav_host_fragment.
//        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            onDestinationChanged(destination)
//        }

        // Creates a notification channel based on SDK level
        setNotificationChannel(applicationContext)
    }

//    override fun onResume() {
//        super.onResume()
//        val connected = NetworkManager(applicationContext).isConnected
//        connected.observe(this) { available ->
//            if (!available) {
//                AppNavDirections(navController).toNetworkFragment()
//            }
//        }
//    }
}