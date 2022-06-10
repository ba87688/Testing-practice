package com.example.testing

import android.content.Context

class ResourceComparor {

    fun isEqual(context:Context, resId:Int, string:String): Boolean{
        return context.getString(resId) == string
    }
}