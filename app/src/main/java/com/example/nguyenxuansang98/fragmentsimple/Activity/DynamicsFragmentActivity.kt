package com.example.nguyenxuansang98.fragmentsimple.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.nguyenxuansang98.fragmentsimple.Fragment.FragmentOne
import com.example.nguyenxuansang98.fragmentsimple.Fragment.FragmentTwo
import com.example.nguyenxuansang98.fragmentsimple.R
import kotlinx.android.synthetic.main.activity_dynamics_fragment.*

class DynamicsFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamics_fragment)
    }
    fun clickFragment(view:View){
        val suportFragment = supportFragmentManager
        val fragmentTransaction = suportFragment.beginTransaction()
        var fragment : Fragment? = null
        when(view.id){
            R.id.btn_add ->{
                fragment = FragmentOne()
            }
            R.id.btn_replace ->{
                fragment = FragmentTwo()
            }
        }
        fragmentTransaction.replace(R.id.frame_main, fragment!!)
        fragmentTransaction.addToBackStack("re")
        fragmentTransaction.commit()
    }
}
