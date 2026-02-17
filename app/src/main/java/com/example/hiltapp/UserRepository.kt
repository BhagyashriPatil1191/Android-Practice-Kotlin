package com.example.hiltapp

import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun getUser() = "TestAppUser"
}