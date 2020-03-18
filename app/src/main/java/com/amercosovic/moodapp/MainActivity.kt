package com.amercosovic.moodapp

import android.app.AlarmManager
import android.app.AlertDialog
import android.app.PendingIntent
import android.content.*
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.content.edit
import com.amercosovic.moodapp.model.Mood
import com.amercosovic.moodapp.receiver.AlarmReceiver
import com.amercosovic.moodapp.utils.Constants
import com.amercosovic.moodapp.utils.OnSwipeTouchListener
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_0
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_1
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_2
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_3
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_4
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_5
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_6
import com.amercosovic.moodapp.utils.Constants.PREFS_KEY_DAY_7
import java.util.*


class MainActivity : AppCompatActivity() {

    var moodObject: Mood = Mood()
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var context: Context
    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundUp = MediaPlayer.create(this,R.raw.zapsplat_multimedia_game_tone_retro_one_up_005_44353)
        val soundDown = MediaPlayer.create(this,R.raw.zapsplat_multimedia_game_tone_stab_negative_44891)

        context = this

        setAlarm()

        //always use constants for file names
        val prefs = getSharedPreferences(Constants.PREFS_KEY, Context.MODE_PRIVATE)

        //initializing a mood object with default values
        moodObject = Mood("", 3, System.currentTimeMillis())
        editor = prefs.edit()

        addnotebutton.setOnClickListener {
            //keep your code clean and modular. Move related functionality to their own functions, makes it easier to maintain
            showAlertDialogForComment()
        }
        moodhistorybutton.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
        constraint_layout.setOnTouchListener(object : OnSwipeTouchListener(this@MainActivity) {

            var moodState: Int = 1


            override fun onSwipeDown() {
                soundDown.start()

                moodObject.moodscore = moodObject.moodscore - 1
                moodState = moodState - 1

                when (moodObject.moodscore) {
                    in -500..-1 -> moodObject.moodscore++
                    in 5..500 -> moodObject.moodscore--
                }

                when (moodState) {
                    in -500..-1 -> moodState++
                    0 -> showSadSmile()
                    1 -> showDisappointedSmile()
                    2 -> showNormalSmile()
                    3 -> showHappySmile()
                    4 -> showSuperhappySmile()
                    in 5..500 -> moodState--
                }
                //todo After modifying the mood score make sure to save it in the shared preferences
                var stringData = Gson().toJson(moodObject)
                editor.putString(PREFS_KEY_DAY_0, stringData)
                editor.commit()
            }
            override fun onSwipeLeft() {
            }
            override fun onSwipeUp() {
                soundUp.start()
                moodObject.moodscore = moodObject.moodscore + 1
                moodState = moodState + 1

                when (moodObject.moodscore) {
                    in -500..-1 -> moodObject.moodscore++
                    in 5..500 -> moodObject.moodscore--
                }

                when (moodState) {
                    in -500..-1 -> moodState++
                    0 -> showSadSmile()
                    1 -> showDisappointedSmile()
                    2 -> showNormalSmile()
                    3 -> showHappySmile()
                    4 -> showSuperhappySmile()
                    in 5..500 -> moodState--
                }

                //todo After modifying the mood score make sure to save it in the shared preferences

                    var stringData = Gson().toJson(moodObject)
                    editor.putString(PREFS_KEY_DAY_0, stringData)
                    editor.commit()

            }

            override fun onSwipeRight() {
                //code here
            }
        })
    }
    private fun setAlarm() {
        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        // Setting the specific time for the alarm manager to trigger the intent, here, the alarm is going off at 11:59 everyday
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = System.currentTimeMillis()
        calendar.set(Calendar.HOUR,11)
        calendar.set(Calendar.MINUTE,1)

        // Starts the alarm manager
        alarmManager.setRepeating(
            AlarmManager.RTC,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY,
            pendingIntent
        )
    }
    fun showSuperhappySmile() {
        var swipeSmile = R.drawable.smiley_superhappy
        smiley_faces.setImageResource(swipeSmile)
        constraint_layout.setBackgroundResource(R.color.banana_yellow)
    }
    fun showHappySmile() {
        var swipeSmile = R.drawable.smiley_happy
        smiley_faces.setImageResource(swipeSmile)
        constraint_layout.setBackgroundResource(R.color.light_sage)
    }
    fun showNormalSmile() {
        var swipeSmile = R.drawable.smiley_normal
        smiley_faces.setImageResource(swipeSmile)
        constraint_layout.setBackgroundResource(R.color.cornflower_blue_65)
    }
    fun showDisappointedSmile() {
        var swipeSmile = R.drawable.smiley_disappointed
        smiley_faces.setImageResource(swipeSmile)
        constraint_layout.setBackgroundResource(R.color.warm_grey)
    }
    fun showSadSmile() {
        var swipeSmile = R.drawable.smiley_sad
        smiley_faces.setImageResource(swipeSmile)
        constraint_layout.setBackgroundResource(R.color.faded_red)
    }
    override fun onDestroy() {
        super.onDestroy()
        // Cancels the pendingIntent if it is no longer needed after this activity is destroyed.
        if (::pendingIntent.isInitialized) {
            alarmManager.cancel(pendingIntent)
        }
    }
    private fun showAlertDialogForComment() {

        //focus on your variable naming schemes
        val moodCommentEditText = EditText(this)
        val moodCommentAlertDialog = AlertDialog.Builder(this)

        moodCommentAlertDialog.setView(moodCommentEditText)
        moodCommentAlertDialog.setCancelable(false)
        moodCommentAlertDialog.setPositiveButton(
            "CONFIRM",
            DialogInterface.OnClickListener { dialog, id ->

                //1 check if the user entered a note or note
                if (moodCommentEditText.text.toString().isNotEmpty()) {
                    moodObject.moodcomment = moodCommentEditText.text.toString()
                }
                var stringData = Gson().toJson(moodObject)
                 editor.putString(PREFS_KEY_DAY_0,stringData)
                editor.commit()

            })

        moodCommentAlertDialog.setNegativeButton(
            "CANCEL",
            DialogInterface.OnClickListener { dialog, id -> dialog.dismiss() }
        )
        val alert = moodCommentAlertDialog.create()
        alert.setTitle("Comment")
        alert.show()
    }
}






















