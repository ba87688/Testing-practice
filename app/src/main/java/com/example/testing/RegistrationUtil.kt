package com.example.testing

object RegistrationUtil {


    private val existingUsers = listOf("Peter", "Carl")

    /***
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the ssame as the real password
     * ...the password contains less than 2 digits.
     */

    fun validateRegistrationInput(
        username:String,
        password:String,
        confirmedPassword: String
    ):Boolean {
        return true
    }

}