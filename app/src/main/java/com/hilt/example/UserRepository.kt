package com.hilt.example

import javax.inject.Inject

class UserRepository @Inject constructor(val loggerService: LoggerService) {

    fun saveUser(email: String, password: String) {
        loggerService.log("User saved in DB")
    }
}