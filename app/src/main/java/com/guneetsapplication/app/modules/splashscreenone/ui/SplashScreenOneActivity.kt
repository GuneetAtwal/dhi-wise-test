package com.guneetsapplication.app.modules.splashscreenone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.guneetsapplication.app.R
import com.guneetsapplication.app.appcomponents.base.BaseActivity
import com.guneetsapplication.app.databinding.ActivitySplashScreenOneBinding
import com.guneetsapplication.app.modules.loginemail5one.ui.LoginEmail5OneActivity
import com.guneetsapplication.app.modules.splashscreenone.`data`.viewmodel.SplashScreenOneVM
import kotlin.String
import kotlin.Unit

class SplashScreenOneActivity :
    BaseActivity<ActivitySplashScreenOneBinding>(R.layout.activity_splash_screen_one) {
  private val viewModel: SplashScreenOneVM by viewModels<SplashScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginEmail5OneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASH_SCREEN_ONE_ACTIVITY"

    }
  }
