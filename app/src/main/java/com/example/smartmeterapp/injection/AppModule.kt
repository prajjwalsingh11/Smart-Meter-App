package com.example.smartmeterapp.injection

import com.example.smartmeterapp.repository.UserRepository
import org.koin.dsl.module

val appModule = module {
    single { UserRepository() }
}
