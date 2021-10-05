package com.example.tetris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tetris.storage.AppPreferences

class GameActivity : AppCompatActivity() {

    var tvHightScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appPreferences: AppPreferences? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val btnRestart = findViewById<Button>(R.id.btn_restart)
        tvHightScore = findViewById<TextView>(R.id.tv_hight_score)
        tvCurrentScore = findViewById<TextView>(R.id.tv_current_score)
        updateHighScore()
        updateCurrentScore()
    }
    private fun updateHighScore() {
        tvHightScore?.text = "${appPreferences?.getHightScore()}"
    }
    private fun updateCurrentScore() {
        tvCurrentScore?.text = "0"
    }
}