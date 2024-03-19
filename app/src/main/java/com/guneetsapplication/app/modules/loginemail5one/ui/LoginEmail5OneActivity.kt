package com.guneetsapplication.app.modules.loginemail5one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guneetsapplication.app.R
import com.guneetsapplication.app.appcomponents.base.BaseActivity
import com.guneetsapplication.app.databinding.ActivityLoginEmail5OneBinding
import com.guneetsapplication.app.modules.loginemail5one.`data`.viewmodel.LoginEmail5OneVM
import kotlin.String
import kotlin.Unit

class LoginEmail5OneActivity :
    BaseActivity<ActivityLoginEmail5OneBinding>(R.layout.activity_login_email_5_one) {
  private val viewModel: LoginEmail5OneVM by viewModels<LoginEmail5OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginEmail5OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOGIN_EMAIL5ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginEmail5OneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
