package hr.ferit.brunozoric.taskie.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.ui.fragments.base.BaseFragment

class AboutAuthorFragment : BaseFragment() {
    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_about_author
    }

    companion object {
        fun newInstance(): AboutAuthorFragment{
            return AboutAuthorFragment()
        }
    }

}
