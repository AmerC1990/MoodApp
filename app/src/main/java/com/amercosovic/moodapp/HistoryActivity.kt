package com.amercosovic.moodapp

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.MotionEvent
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.alpha
import androidx.core.graphics.drawable.toDrawable
import com.amercosovic.moodapp.model.Mood
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_1
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_2
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_3
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_4
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_5
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_6
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_7
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val sharedPreferences = getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE)
        val dayOne = sharedPreferences.getString(PREFS_KEY_DAY_1, "")
        val dayTwo = sharedPreferences.getString(PREFS_KEY_DAY_2, "")
        val dayThree = sharedPreferences.getString(PREFS_KEY_DAY_3, "")
        val dayFour = sharedPreferences.getString(PREFS_KEY_DAY_4, "")
        val dayFive = sharedPreferences.getString(PREFS_KEY_DAY_5, "")
        val daySix = sharedPreferences.getString(PREFS_KEY_DAY_6, "")
        val daySeven = sharedPreferences.getString(PREFS_KEY_DAY_7, "")

        val moodHistoryObject1 = Gson().fromJson(dayOne, Mood::class.java)
        day1History.setText(getString(R.string.Day_1_History_TextView_Text))
        when (moodHistoryObject1?.moodscore) {
            0 -> {day1History.setBackgroundResource(R.color.faded_red)
                day1History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day1History.setBackgroundResource(R.color.warm_grey)
                day1History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day1History.setBackgroundResource(R.color.cornflower_blue_65)
                day1History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day1History.setBackgroundResource(R.color.light_sage)
                day1History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day1History.setBackgroundResource(R.color.banana_yellow)
                day1History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }
        val moodHistoryObject2 = Gson().fromJson(dayTwo, Mood::class.java)
        day2History.setText(getString(R.string.Day_2_History_TextView_Text))
        when (moodHistoryObject2?.moodscore) {
            0 -> {day2History.setBackgroundResource(R.color.faded_red)
                day2History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day2History.setBackgroundResource(R.color.warm_grey)
                day2History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day2History.setBackgroundResource(R.color.cornflower_blue_65)
                day2History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day2History.setBackgroundResource(R.color.light_sage)
                day2History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day2History.setBackgroundResource(R.color.banana_yellow)
                day2History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }
        val moodHistoryObject3 = Gson().fromJson(dayThree, Mood::class.java)
        day3History.setText(getString(R.string.Day_3_History_TextView_Text))
        when (moodHistoryObject3?.moodscore) {
            0 -> {day3History.setBackgroundResource(R.color.faded_red)
                day3History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day3History.setBackgroundResource(R.color.warm_grey)
                day3History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day3History.setBackgroundResource(R.color.cornflower_blue_65)
                day3History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day3History.setBackgroundResource(R.color.light_sage)
                day3History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day3History.setBackgroundResource(R.color.banana_yellow)
                day3History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }
        val moodHistoryObject4 = Gson().fromJson(dayFour, Mood::class.java)
        day4History.setText(getString(R.string.Day_4_History_TextView_Text))
        when (moodHistoryObject4?.moodscore) {
            0 -> {day4History.setBackgroundResource(R.color.faded_red)
                day4History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day4History.setBackgroundResource(R.color.warm_grey)
                day4History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day4History.setBackgroundResource(R.color.cornflower_blue_65)
                day4History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day4History.setBackgroundResource(R.color.light_sage)
                day4History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day4History.setBackgroundResource(R.color.banana_yellow)
                day4History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }
        val moodHistoryObject5 = Gson().fromJson(dayFive, Mood::class.java)
        day5History.setText(getString(R.string.Day_5_History_TextView_Text))
        when (moodHistoryObject5?.moodscore) {
            0 -> {day5History.setBackgroundResource(R.color.faded_red)
                day5History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day5History.setBackgroundResource(R.color.warm_grey)
                day5History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day5History.setBackgroundResource(R.color.cornflower_blue_65)
                day5History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day5History.setBackgroundResource(R.color.light_sage)
                day5History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day5History.setBackgroundResource(R.color.banana_yellow)
                day5History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }
        val moodHistoryObject6 = Gson().fromJson(daySix, Mood::class.java)
        day6History.setText(getString(R.string.Day_6_History_TextView_Text))
        when (moodHistoryObject6?.moodscore) {
            0 -> {day6History.setBackgroundResource(R.color.faded_red)
                day6History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day6History.setBackgroundResource(R.color.warm_grey)
                day6History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day6History.setBackgroundResource(R.color.cornflower_blue_65)
                day6History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day6History.setBackgroundResource(R.color.light_sage)
                day6History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day6History.setBackgroundResource(R.color.banana_yellow)
                day6History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }
        val moodHistoryObject7 = Gson().fromJson(daySeven, Mood::class.java)
        day7History.setText(getString(R.string.Day_7_History_TextView_Text))
        when (moodHistoryObject7?.moodscore) {
            0 -> {day7History.setBackgroundResource(R.color.faded_red)
                day7History.layoutParams = LinearLayout.LayoutParams(144,175)
            }
            1 -> {day7History.setBackgroundResource(R.color.warm_grey)
                day7History.layoutParams = LinearLayout.LayoutParams(288,175)
            }
            2 -> {day7History.setBackgroundResource(R.color.cornflower_blue_65)
                day7History.layoutParams = LinearLayout.LayoutParams(432,175)
            }
            3 -> {day7History.setBackgroundResource(R.color.light_sage)
                day7History.layoutParams = LinearLayout.LayoutParams(576,175)
            }
            4 -> {day7History.setBackgroundResource(R.color.banana_yellow)
                day7History.layoutParams = LinearLayout.LayoutParams(720,175)
            }
        }

        var historyCommentImage1 = R.drawable.history_comment_image
        day1History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject1.moodcomment?.isNotEmpty()) {
            day1History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage1, 0)

            day1History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject1.moodcomment, Toast.LENGTH_LONG).show()
            }
        }

        var historyCommentImage2 = R.drawable.history_comment_image
        day2History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject2.moodcomment?.isNotEmpty()) {
            day2History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage2, 0)

            day2History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject2.moodcomment, Toast.LENGTH_LONG).show()
            }
        }
        var historyCommentImage3 = R.drawable.history_comment_image
        day3History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject3.moodcomment?.isNotEmpty()) {
            day3History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage3, 0)

            day3History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject3.moodcomment, Toast.LENGTH_LONG).show()
            }
        }
        var historyCommentImage4 = R.drawable.history_comment_image
        day4History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject4.moodcomment?.isNotEmpty()) {
            day4History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage4, 0)

            day4History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject4.moodcomment, Toast.LENGTH_LONG).show()
            }
        }
        var historyCommentImage5 = R.drawable.history_comment_image
        day5History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject5.moodcomment?.isNotEmpty()) {
            day5History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage5, 0)

            day5History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject5.moodcomment, Toast.LENGTH_LONG).show()
            }
        }
        var historyCommentImage6 = R.drawable.history_comment_image
        day6History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject6.moodcomment?.isNotEmpty()) {
            day6History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage6, 0)

            day6History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject6.moodcomment, Toast.LENGTH_LONG).show()
                    }
                }

        var historyCommentImage7 = R.drawable.history_comment_image
        day7History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject7.moodcomment?.isNotEmpty()) {
            day7History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage7, 0)

            day7History.setOnClickListener{
                Toast.makeText(this@HistoryActivity, moodHistoryObject7.moodcomment, Toast.LENGTH_LONG).show()
            }
        }
    }
}













