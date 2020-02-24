package com.example.movieapp.View

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.movieapp.Interface.LoginResultCaller
import com.example.movieapp.R
import com.example.movieapp.ViewModel.LoginViewModel
import com.example.movieapp.ViewModel.LoginViewModelFactory
import com.example.movieapp.databinding.ActivityMainBinding
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(),LoginResultCaller {
    override fun onSuccess(message: String) {
        Toasty.success(this,message, Toast.LENGTH_SHORT)
            .show()
    }

    override fun onError(message: String) {
        Toasty.error(this,message, Toast.LENGTH_SHORT)
            .show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        activityMainBinding.viewModel=ViewModelProviders.of(this,LoginViewModelFactory(this))
            .get(LoginViewModel::class.java)
    }

}
