package com.eduardo.fonseca.testyape.ui.utils

import android.view.View

fun View.show(boolean: Boolean) {
    this.visibility = if (boolean) View.VISIBLE
    else View.GONE
}