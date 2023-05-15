package com.rezoo.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneChangedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlainModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if (isAirPlainModeEnabled) {
            Toast.makeText(context, "AirPlan Mode Enabled", Toast.LENGTH_SHORT).show()
        } else {

            Toast.makeText(context, "AirPlan Mode Disabled", Toast.LENGTH_SHORT).show()
        }
    }
}