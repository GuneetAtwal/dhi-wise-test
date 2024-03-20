package com.guneetsapplication.app.modules.loginemail5one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.guneetsapplication.app.R
import com.guneetsapplication.app.appcomponents.base.BaseActivity
import com.guneetsapplication.app.databinding.ActivityLoginEmail5OneBinding
import com.guneetsapplication.app.modules.loginemail5one.`data`.viewmodel.LoginEmail5OneVM
import com.guneetsapplication.app.modules.toppicksoption12one.ui.TopPicksOption12OneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginEmail5OneActivity :
    BaseActivity<ActivityLoginEmail5OneBinding>(R.layout.activity_login_email_5_one) {
  private val viewModel: LoginEmail5OneVM by viewModels<LoginEmail5OneVM>()

  private val REQUEST_CODE_TOP_PICKS_OPTION12ONE_ACTIVITY: Int = 689

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginEmail5OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtDiscoverFive.setOnClickListener {
      val destIntent = TopPicksOption12OneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TOP_PICKS_OPTION12ONE_ACTIVITY)
    }
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
