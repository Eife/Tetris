package com.example.tetris.storage
import android.content.Context
import android.content.SharedPreferences

class AppPreferences(ctx: Context) {
    var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)

    fun saveHightScore(hightScore: Int) {
        data.edit().putInt("HIGHT_SCORE", hightScore).apply()
    }
    fun getHightScore(): Int {
        return data.getInt("HIGHT_SCORE", 0)
    }

    fun clearHightScore() {
        data.edit().putInt("HIGHT_SCORE", 0).apply()
    }

}