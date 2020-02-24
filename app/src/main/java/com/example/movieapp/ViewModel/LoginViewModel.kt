package com.example.movieapp.ViewModel

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.movieapp.Interface.LoginResultCaller
import com.example.movieapp.Model.User


class LoginViewModel(private val listner:LoginResultCaller):ViewModel() {

private val user: User

    init {
        this.user= User("","")
    }

    //create function to set email after user finish enter text
    val emailTextWatcher:TextWatcher
        get() = object:TextWatcher{
        override fun afterTextChanged(s: Editable?) {
user.setEmail(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

             }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }


    }

    //create function to set password after user finish enter text
    val passwordTextWatcher:TextWatcher
        get() = object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                user.setPassword(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }


        }

    //creating function to process login button click

    fun onLoginClicked(v:View){


        if (user.isDataValid)
listner.onSuccess("Login Success")
        else
            listner.onError("Login error")
    }
}