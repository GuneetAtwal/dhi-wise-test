package com.guneetsapplication.app.modules.toppicksoption12one.ui

import android.view.View
import androidx.activity.viewModels
import com.guneetsapplication.app.R
import com.guneetsapplication.app.appcomponents.base.BaseActivity
import com.guneetsapplication.app.databinding.ActivityTopPicksOption12OneBinding
import com.guneetsapplication.app.modules.toppicksoption12one.`data`.model.ViewhierarchyRowModel
import com.guneetsapplication.app.modules.toppicksoption12one.`data`.viewmodel.TopPicksOption12OneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopPicksOption12OneActivity :
    BaseActivity<ActivityTopPicksOption12OneBinding>(R.layout.activity_top_picks_option1_2_one) {
  private val viewModel: TopPicksOption12OneVM by viewModels<TopPicksOption12OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val viewhierarchyAdapter =
    ViewhierarchyAdapter(viewModel.viewhierarchyList.value?:mutableListOf())
    binding.recyclerViewhierarchy.adapter = viewhierarchyAdapter
    viewhierarchyAdapter.setOnItemClickListener(
    object : ViewhierarchyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ViewhierarchyRowModel) {
        onClickRecyclerViewhierarchy(view, position, item)
      }
    }
    )
    viewModel.viewhierarchyList.observe(this) {
      viewhierarchyAdapter.updateData(it)
    }
    binding.topPicksOption12OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerViewhierarchy(
    view: View,
    position: Int,
    item: ViewhierarchyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TOP_PICKS_OPTION12ONE_ACTIVITY"

  }
}
