package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparorTest{

    private lateinit var resourceComparor: ResourceComparor

    @Before
    fun setup(){
        resourceComparor = ResourceComparor()
    }

    @After
    fun closeDown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparor.isEqual(context,R.string.app_name,"Testing")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparor.isEqual(context,R.string.app_name,"yahoo")
        assertThat(result).isFalse()
    }


}