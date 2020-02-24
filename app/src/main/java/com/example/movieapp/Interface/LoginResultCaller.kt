package com.example.movieapp.Interface

interface LoginResultCaller {

    fun onSuccess(message:String)
    fun onError(message: String)

}