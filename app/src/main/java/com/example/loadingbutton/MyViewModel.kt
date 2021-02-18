package com.example.loadingbutton

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MyViewModel(application: Application):AndroidViewModel(application) {

    var UserName:MutableLiveData<String> = MutableLiveData()
    var Password:MutableLiveData<String> = MutableLiveData()
    var UserNameError:MutableLiveData<String> = MutableLiveData()
    var PasswordError:MutableLiveData<String> = MutableLiveData()



}