package com.guneetsapplication.app.modules.loginemail5one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guneetsapplication.app.modules.loginemail5one.`data`.model.LoginEmail5OneModel
import org.koin.core.KoinComponent

class LoginEmail5OneVM : ViewModel(), KoinComponent {
  val loginEmail5OneModel: MutableLiveData<LoginEmail5OneModel> =
      MutableLiveData(LoginEmail5OneModel())

  var navArguments: Bundle? = null
}
