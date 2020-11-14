package com.martinparker.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }
    fun leagueNextClicked(view: View) {
        val skillActivity = Intent(this, SkillAcitivity::class.java)
        startActivity(skillActivity)
    }

}
