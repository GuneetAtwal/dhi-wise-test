package com.guneetsapplication.app.modules.loginemail5one.`data`.model

import com.guneetsapplication.app.R
import com.guneetsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginEmail5OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscover: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
