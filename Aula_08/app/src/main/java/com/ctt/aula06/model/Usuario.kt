package com.ctt.aula06.model

import android.graphics.Bitmap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Usuario(val id: Int,
                   val nome: String,
                   val idade: Int,
                   var foto: Bitmap? = null) : Parcelable
