package com.guneetsapplication.app.modules.toppicksoption12one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guneetsapplication.app.modules.toppicksoption12one.`data`.model.TopPicksOption12OneModel
import com.guneetsapplication.app.modules.toppicksoption12one.`data`.model.ViewhierarchyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TopPicksOption12OneVM : ViewModel(), KoinComponent {
  val topPicksOption12OneModel: MutableLiveData<TopPicksOption12OneModel> =
      MutableLiveData(TopPicksOption12OneModel())

  var navArguments: Bundle? = null

  val viewhierarchyList: MutableLiveData<MutableList<ViewhierarchyRowModel>> =
      MutableLiveData(mutableListOf())
}
