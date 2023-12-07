package com.example.mynewsapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.mynewsapplication.R
import com.example.mynewsapplication.databinding.ActivityMainBinding
import com.example.mynewsapplication.db.ArticleDataBase
import com.example.mynewsapplication.repository.NewsRepository

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var newsViewModel: NewsViewModel
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = NewsRepository(ArticleDataBase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(repository, application)
        newsViewModel = ViewModelProvider(this, viewModelProviderFactory)[NewsViewModel::class.java]

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.newNavHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.bottomNavigationButton.setupWithNavController(navController)
    }
}