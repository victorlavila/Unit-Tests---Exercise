package com.leo.testestrainning

import android.content.Context

class ContextWrapper(private val context: Context) {

    fun getTitle(): String {
        return context.getString(R.string.hello_world)
    }
}