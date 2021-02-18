package com.example.loadingbutton

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.annotation.RestrictTo
import androidx.core.content.ContextCompat
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.login_btn
import kotlinx.android.synthetic.main.btn_loading.*
import kotlinx.coroutines.Delay
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handle = Handler()
        login_btn.setOnClickListener {
            login_btn.background = ContextCompat.getDrawable(this, R.drawable.btn_shape_gradient)
            failure_text.visibility = View.GONE
            success_img.visibility = View.GONE
            login_text.visibility = View.GONE
             progressBar.visibility = View.VISIBLE
            handle.postDelayed(3000L){
                success_img.visibility = View.GONE
                login_text.visibility = View.GONE
                progressBar.visibility = View.GONE
                failure_text.visibility = View.VISIBLE
                login_btn.background = ContextCompat.getDrawable(this, R.drawable.btn_failed)

            }

            handle.postDelayed(6000L){

                failure_text.visibility = View.GONE
                login_btn.background = ContextCompat.getDrawable(this, R.drawable.btn_success)
                success_img.visibility = View.VISIBLE
            }




        }
    }
}
