package com.example.nguyenxuansang98.fragmentsimple.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nguyenxuansang98.fragmentsimple.Fragment.FragmentOne
import com.example.nguyenxuansang98.fragmentsimple.Fragment.FragmentTwo
import com.example.nguyenxuansang98.fragmentsimple.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fm = supportFragmentManager
        var fr_add = fm.beginTransaction()

        btn_static_fragment.setOnClickListener {
            val intent = Intent(applicationContext,StaticFragmentActivity::class.java)
            startActivity(intent)
        }

        btn_dynamics_fragment.setOnClickListener {
            val intent = Intent(applicationContext,DynamicsFragmentActivity::class.java)
            startActivity(intent)
        }
    }
}
