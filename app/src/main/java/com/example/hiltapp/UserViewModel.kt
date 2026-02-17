package com.example.hiltapp

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
   private val userRepository: UserRepository
): ViewModel(){
   internal fun fetchUser(): String{
        return userRepository.getUser()
    }
}
