package com.martinparker.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SkillAcitivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_acitivity)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

}
