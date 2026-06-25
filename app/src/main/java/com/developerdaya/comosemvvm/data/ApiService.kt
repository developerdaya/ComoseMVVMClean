package com.developerdaya.comosemvvm.data

import retrofit2.http.GET

interface ApiService {
    @GET("43bf2ed2-763c-4914-bbdc-d173e83c69b9")
    suspend fun getUsers(): List<User>
}
