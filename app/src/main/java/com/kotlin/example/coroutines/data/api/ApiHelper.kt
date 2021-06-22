package com.kotlin.example.coroutines.data.api

import com.kotlin.example.coroutines.data.model.ApiUser

interface ApiHelper {

    suspend fun getUsers(): List<ApiUser>

    suspend fun getMoreUsers(): List<ApiUser>

    suspend fun getUsersWithError(): List<ApiUser>

}