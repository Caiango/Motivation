package com.example.motivation.util

import android.content.Context
import android.content.SharedPreferences

class Security_Preferences(context: Context) {
    //    No shared preferences outros apps podem utilizar ele, por isso eu setei ele como PRIVATE
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    //    função para salvar os strings
    fun salvarString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    //    função para pegar os strings
    fun pegarSting(key: String): String? {
        return sharedPreferences.getString(key, "")
    }

}