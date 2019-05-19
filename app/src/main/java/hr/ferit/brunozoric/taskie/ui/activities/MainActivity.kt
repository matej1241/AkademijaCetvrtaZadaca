package hr.ferit.brunozoric.taskie.ui.activities

import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.ui.activities.base.BaseActivity
import hr.ferit.brunozoric.taskie.ui.fragments.AboutFragment
import hr.ferit.brunozoric.taskie.ui.fragments.TasksFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getLayoutResourceId() = R.layout.activity_main

    private val mOnNavigationItemSelectedListener  = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId){
            R.id.about -> {
                showFragment(AboutFragment.newInstance())
                Log.d("Tag", "About")
                return@OnNavigationItemSelectedListener true
            }
            R.id.tasks -> {
                showFragment(TasksFragment.newInstance())
                Log.d("Tag", "Tasks")
                return@OnNavigationItemSelectedListener true
            }
            else -> return@OnNavigationItemSelectedListener false
        }

    }

    override fun setUpUi() {
        showFragment(TasksFragment.newInstance())
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}