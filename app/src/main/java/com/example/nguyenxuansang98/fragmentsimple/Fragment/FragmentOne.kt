package com.example.nguyenxuansang98.fragmentsimple.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import com.example.nguyenxuansang98.fragmentsimple.R


/**
 * A simple [Fragment] subclass.
 */
class FragmentOne : Fragment() {

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        Log.d("fragmentOne", "fragmentOne: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }
    override fun onStart() {
        Log.d("fragmentOne", "fragmentOne: onStart")
        super.onStart()
    }



    override fun onResume() {
        Log.d("fragmentOne", "fragmentOne: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("fragmentOne", "fragmentOne: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("fragmentOne", "fragmentOne: onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("fragmentOne", "fragmentOne: onDeystroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("fragmentOne", "fragmentOne: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("fragmentA", "fragmentA: onDetach")
        super.onDetach()
    }
}

