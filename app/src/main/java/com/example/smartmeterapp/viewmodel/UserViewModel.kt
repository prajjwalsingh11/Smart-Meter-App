package com.example.smartmeterapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.smartmeterapp.model.User
import com.example.smartmeterapp.repository.UserRepository

class UserViewModel : ViewModel() {
    private val userRepository = UserRepository()

    fun loginUser(email: String, password: String): User? {
        return userRepository.loginUser(email, password)
    }
}
