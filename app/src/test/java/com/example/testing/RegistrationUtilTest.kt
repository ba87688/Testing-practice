package com.example.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun emptyUsernameReturnsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(

            //input that this test should test

            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun validUsernameAndPasswordReturnsTrue(){
        val result = RegistrationUtil.validateRegistrationInput(
            "EvanM",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun userNameAlreadyExistsAndReturnsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

//if password is empty
    @Test
    fun passwordIsEmptyReturnsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "",
            ""
        )
        assertThat(result).isFalse()
    }


    //password repeated incorrectly
    @Test
    fun passwordRepeatedIncorrectlyRetrunsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(
            "hgfhgf",
            "132",
            "123"
        )
        assertThat(result).isFalse()
    }

//password has less than 2 digits
    @Test
    fun passwordHasLessThanTwoDigitsReturnsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(
            "lkh",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }


}