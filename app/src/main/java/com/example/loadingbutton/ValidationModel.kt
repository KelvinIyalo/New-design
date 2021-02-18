package com.example.loadingbutton

import android.content.Context
import android.util.Patterns


data class ValidationModel(var isActive:Boolean, var msg:String)

fun String.validationEmail(context: Context):ValidationModel{
    return if (this.trim().isEmpty()){
        ValidationModel(false,"Email should not be Empty")
    }else if (!Patterns.EMAIL_ADDRESS.matcher(this).matches()){

        ValidationModel(false, "Email Format is Wrong")

    }else{
        ValidationModel(true,"")
    }
}

fun String.validationPassword(context: Context):ValidationModel{
    val pattern = "[0-9]".toRegex()
    val pattern2 = "[a-z][A-Z]".toRegex()
    return if (this.isEmpty()){
        ValidationModel(false,"Password should not be Empty")
    }else if (this.length< 6){

        ValidationModel(false, "Minimal 6 characters")

    }else if (!pattern.containsMatchIn(this)||!pattern2.containsMatchIn(this)){

        ValidationModel(false, "Requires Combination number and Text")

    }else{
        ValidationModel(true,"")
    }
}