package com.eduardo.fonseca.testyape.ui.utils

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.eduardo.fonseca.testyape.databinding.UiTransparentLoadingBinding

object TransparentLoadScreenDialog {

    private var alert: AlertDialog? = null
    private lateinit var mBuilder: AlertDialog.Builder

    fun show(context: Context) {
        val binding = UiTransparentLoadingBinding.inflate(
            LayoutInflater.from(context),
            null,
            false
        )
        mBuilder = AlertDialog.Builder(context)
            .setView(binding.root)
        alert = mBuilder.show()
        alert?.setCanceledOnTouchOutside(false)
        alert?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

    }

    fun hide() {
        Handler(Looper.myLooper()!!).postDelayed({
            alert?.dismiss()
        }, 3000)
    }
}