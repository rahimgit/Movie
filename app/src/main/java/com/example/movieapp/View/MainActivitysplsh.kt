package com.example.movieapp.View

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
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

class MainActivitysplsh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val background=object: Thread(){

            override fun run(){

              try {

                  Thread.sleep(5000)

                  val intent= Intent(baseContext,MainActivitysplsh::class.java)
                  startActivity(intent)

              }catch(e:Exception){

                  e.printStackTrace()
              }
            }

        }
        background.start()
    }

}