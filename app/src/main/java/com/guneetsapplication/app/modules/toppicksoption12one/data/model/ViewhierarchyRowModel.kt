package com.guneetsapplication.app.modules.toppicksoption12one.`data`.model

import com.guneetsapplication.app.R
import com.guneetsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewhierarchyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_improving_the_quality)

)
