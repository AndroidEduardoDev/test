package com.eduardo.fonseca.testyape.utils

import android.view.View

fun View.show(boolean: Boolean) {
    this.visibility = if (boolean) View.VISIBLE
    else View.GONE
}