package com.example.mynewsapplication.repository

import com.example.mynewsapplication.api.RetrofitInstance
import com.example.mynewsapplication.db.ArticleDataBase
import com.example.mynewsapplication.model.Article

class NewsRepository(
    val db: ArticleDataBase,
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun saveArticle(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedArticles() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}
