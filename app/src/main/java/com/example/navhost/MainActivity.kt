package com.example.navhost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
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
        setContentView(view)
    }

    companion object{

    }
}