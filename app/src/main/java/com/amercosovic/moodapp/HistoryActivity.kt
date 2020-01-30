package com.amercosovic.moodapp

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.GONE
import android.widget.ImageView
import android.widget.LinearLayout
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

//        val layoutParam = ViewGroup.LayoutParams()
//        val layoutParam2 = ConstraintLayout.LayoutParams(72,88)
//        val layoutParam3 = history_constraint_layout.layoutParams

        val layoutparams = LinearLayout.LayoutParams(0,0)


        val layoutParams0 = LinearLayout.LayoutParams(72,88)
        layoutParams0.width = 72

        val layoutParams1 = LinearLayout.LayoutParams(144,88)
        layoutParams1.width = 144

        val layoutParams2 = LinearLayout.LayoutParams(216,88)
        layoutParams2.width = 216

        val layoutParams3 = LinearLayout.LayoutParams(288,88)
        layoutParams3.width = 288

        val layoutParams4 = LinearLayout.LayoutParams(360,88)
        layoutParams4.width = 360


        val moodHistoryObject1 = Gson().fromJson(dayOne, Mood::class.java)
        day1History.setText(getString(R.string.Day_1_History_TextView_Text))
        when (moodHistoryObject1.moodscore) {
            0 -> day1History.setBackgroundResource(R.color.faded_red)
            0 -> day1History.setLayoutParams(layoutParams0)
            1 -> day1History.setBackgroundResource(R.color.warm_grey)
            1 -> day1History.setLayoutParams(layoutParams1)
            2 -> day1History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day1History.setLayoutParams(layoutParams2)
            3 -> day1History.setBackgroundResource(R.color.light_sage)
            3 -> day1History.setLayoutParams(layoutParams3)
            4 -> day1History.setBackgroundResource(R.color.banana_yellow)
            4 -> day1History.setLayoutParams(layoutParams4)
        }

        val moodHistoryObject2 = Gson().fromJson(dayTwo, Mood::class.java)
        day2History.setText(getString(R.string.Day_2_History_TextView_Text))
        when (moodHistoryObject2.moodscore) {
            0 -> day2History.setBackgroundResource(R.color.faded_red)
            0 -> day2History.setLayoutParams(layoutParams0)
            1 -> day2History.setBackgroundResource(R.color.warm_grey)
            1 -> day2History.setLayoutParams(layoutParams1)
            2 -> day2History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day2History.setLayoutParams(layoutParams2)
            3 -> day2History.setBackgroundResource(R.color.light_sage)
            3 -> day2History.setLayoutParams(layoutParams3)
            4 -> day2History.setBackgroundResource(R.color.banana_yellow)
            4 -> day2History.setLayoutParams(layoutParams4)
        }
        val moodHistoryObject3 = Gson().fromJson(dayThree, Mood::class.java)
        day3History.setText(getString(R.string.Day_3_History_TextView_Text))
        when (moodHistoryObject3.moodscore) {
            0 -> day3History.setBackgroundResource(R.color.faded_red)
            0 -> day3History.setLayoutParams(layoutParams0)
            1 -> day3History.setBackgroundResource(R.color.warm_grey)
            1 -> day3History.setLayoutParams(layoutParams1)
            2 -> day3History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day3History.setLayoutParams(layoutParams2)
            3 -> day3History.setBackgroundResource(R.color.light_sage)
            3 -> day3History.setLayoutParams(layoutParams3)
            4 -> day3History.setBackgroundResource(R.color.banana_yellow)
            4 -> day3History.setLayoutParams(layoutParams4)
        }
        val moodHistoryObject4 = Gson().fromJson(dayFour, Mood::class.java)
        day4History.setText(getString(R.string.Day_4_History_TextView_Text))
        when (moodHistoryObject4.moodscore) {
            0 -> day4History.setBackgroundResource(R.color.faded_red)
            0 -> day4History.setLayoutParams(layoutParams0)
            1 -> day4History.setBackgroundResource(R.color.warm_grey)
            1 -> day4History.setLayoutParams(layoutParams1)
            2 -> day4History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day4History.setLayoutParams(layoutParams2)
            3 -> day4History.setBackgroundResource(R.color.light_sage)
            3 -> day4History.setLayoutParams(layoutParams3)
            4 -> day4History.setBackgroundResource(R.color.banana_yellow)
            4 -> day4History.setLayoutParams(layoutParams4)
        }
        val moodHistoryObject5 = Gson().fromJson(dayFive, Mood::class.java)
        day5History.setText(getString(R.string.Day_5_History_TextView_Text))
        when (moodHistoryObject5.moodscore) {
            0 -> day5History.setBackgroundResource(R.color.faded_red)
            0 -> day5History.setLayoutParams(layoutParams0)
            1 -> day5History.setBackgroundResource(R.color.warm_grey)
            1 -> day5History.setLayoutParams(layoutParams1)
            2 -> day5History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day5History.setLayoutParams(layoutParams2)
            3 -> day5History.setBackgroundResource(R.color.light_sage)
            3 -> day5History.setLayoutParams(layoutParams3)
            4 -> day5History.setBackgroundResource(R.color.banana_yellow)
            4 -> day5History.setLayoutParams(layoutParams4)
        }
        val moodHistoryObject6 = Gson().fromJson(daySix, Mood::class.java)
        day6History.setText(getString(R.string.Day_6_History_TextView_Text))
        when (moodHistoryObject6.moodscore) {
            0 -> day6History.setBackgroundResource(R.color.faded_red)
            0 -> day6History.setLayoutParams(layoutParams0)
            1 -> day6History.setBackgroundResource(R.color.warm_grey)
            1 -> day6History.setLayoutParams(layoutParams1)
            2 -> day6History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day6History.setLayoutParams(layoutParams2)
            3 -> day6History.setBackgroundResource(R.color.light_sage)
            3 -> day6History.setLayoutParams(layoutParams3)
            4 -> day6History.setBackgroundResource(R.color.banana_yellow)
            4 -> day6History.setLayoutParams(layoutParams4)
        }
        val moodHistoryObject7 = Gson().fromJson(daySeven, Mood::class.java)
        day7History.setText(getString(R.string.Day_7_History_TextView_Text))
        when (moodHistoryObject7.moodscore) {
            0 -> day7History.setBackgroundResource(R.color.faded_red)
            0 -> day7History.setLayoutParams(layoutParams0)
            1 -> day7History.setBackgroundResource(R.color.warm_grey)
            1 -> day7History.setLayoutParams(layoutParams1)
            2 -> day7History.setBackgroundResource(R.color.cornflower_blue_65)
            2 -> day7History.setLayoutParams(layoutParams2)
            3 -> day7History.setBackgroundResource(R.color.light_sage)
            3 -> day7History.setLayoutParams(layoutParams3)
            4 -> day7History.setBackgroundResource(R.color.banana_yellow)
            4 -> day7History.setLayoutParams(layoutParams4)
        }
        var historyCommentImage1 = R.drawable.history_comment_image
        day1History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject1.moodcomment.isNotEmpty()) {
            day1History.setCompoundDrawablesWithIntrinsicBounds(0,0,historyCommentImage1,0)
        }
        day1History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day2History.getRight() - day2History.getCompoundDrawables()[DRAWABLE_RIGHT].copyBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject1.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })

        var historyCommentImage2 = R.drawable.history_comment_image
        day1History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject2.moodcomment.isNotEmpty()) {
            day2History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage2, 0)
        }
        day2History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day2History.getRight() - day2History.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject2.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })
        var historyCommentImage3 = R.drawable.history_comment_image
        day3History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject2.moodcomment.isNotEmpty()) {
            day3History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage3, 0)
        }
        day3History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day3History.getRight() - day2History.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject3.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })
        var historyCommentImage4 = R.drawable.history_comment_image
        day4History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject4.moodcomment.isNotEmpty()) {
            day4History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage4, 0)
        }
        day4History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day4History.getRight() - day4History.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject4.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })
        var historyCommentImage5 = R.drawable.history_comment_image
        day5History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject5.moodcomment.isNotEmpty()) {
            day5History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage5, 0)
        }
        day5History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day5History.getRight() - day5History.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject5.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })
        var historyCommentImage6 = R.drawable.history_comment_image
        day6History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject6.moodcomment.isNotEmpty()) {
            day6History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage6, 0)
        }
        day6History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day6History.getRight() - day6History.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject6.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })
        var historyCommentImage7 = R.drawable.history_comment_image
        day7History.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0)

        if (moodHistoryObject7.moodcomment.isNotEmpty()) {
            day7History.setCompoundDrawablesWithIntrinsicBounds(0, 0, historyCommentImage7, 0)
        }
        day7History.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3

                if (event.getAction() <= MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= day7History.getRight() - day7History.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width()) {
                        // your action here

                        Toast.makeText(this@HistoryActivity, moodHistoryObject7.moodcomment,Toast.LENGTH_LONG).show()
                        return true
                    }
                }
                return false
            }

        })



        }

        }











