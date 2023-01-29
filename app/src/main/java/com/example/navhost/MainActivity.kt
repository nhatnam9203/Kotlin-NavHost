package com.example.navhost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.fragment.app.Fragment
import androidx.lifecycle.whenCreated
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.navhost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding!!.root

     /*   val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        setupActionBarWithNavController(navController)*/
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.singleFragment, HomeFragment())
//        transaction.commit()
        binding.apply{
            bottomNav.setOnItemSelectedListener {
                Log.d("MainActivity","debug item bottom : $it")
                when(it.itemId){
                    R.id.home ->{
                        loadFragmentMenu(HomeFragment())
                        true
                    }
                    R.id.service ->{
                        loadFragmentMenu(DataFragment())
                        true
                    }
                    R.id.settings ->{
                        loadFragmentMenu(SettingFragment())
                        true
                    }
                    R.id.motion ->{
                        loadFragmentMenu(MotionFragment())
                        true
                    }
                    else -> {
                        true
                    }
                }

            }
        }


        setContentView(view)
    }


    private fun loadFragmentMenu(fragment: Fragment){
        var transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(R.anim.enter_from_right,0)
        transaction?.replace(R.id.containerLayout, fragment)
        transaction.commit()
    }

    companion object{

    }
}