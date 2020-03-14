package com.amercosovic.moodapp.receiver

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.edit
import com.amercosovic.moodapp.model.Mood
import com.amercosovic.moodapp.utils.Constants
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_0
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_1
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_2
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_3
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_4
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_5
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_6
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_7
import com.google.gson.Gson

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        var moodObject = Mood()
        var stringData = Gson().toJson(moodObject)
        val prefs = context?.getSharedPreferences(Constants.PREFS_KEY, Context.MODE_PRIVATE)

        val dayZero = prefs?.getString(PREFS_KEY_DAY_0, "")
        val dayOne =  prefs?.getString(PREFS_KEY_DAY_1, "")
        val dayTwo = prefs?.getString(PREFS_KEY_DAY_2, "")
        val dayThree = prefs?.getString(PREFS_KEY_DAY_3, "")
        val dayFour = prefs?.getString(PREFS_KEY_DAY_4, "")
        val dayFive = prefs?.getString(PREFS_KEY_DAY_5, "")
        val daySix = prefs?.getString(PREFS_KEY_DAY_6, "")
        val daySeven = prefs?.getString(PREFS_KEY_DAY_7, "")

        prefs?.edit {
            this.putString(Constants.PREFS_KEY_DAY_0,stringData)
            this.putString(Constants.PREFS_KEY_DAY_1,dayZero)
            this.putString(Constants.PREFS_KEY_DAY_2,dayOne)
            this.putString(Constants.PREFS_KEY_DAY_3,dayTwo)
            this.putString(Constants.PREFS_KEY_DAY_4,dayThree)
            this.putString(Constants.PREFS_KEY_DAY_5,dayFour)
            this.putString(Constants.PREFS_KEY_DAY_6,dayFive)
            this.putString(Constants.PREFS_KEY_DAY_7,daySix)
            this.commit()

        }
    }
}


