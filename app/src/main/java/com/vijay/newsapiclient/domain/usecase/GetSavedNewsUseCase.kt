package com.vijay.newsapiclient.domain.usecase

import com.vijay.newsapiclient.data.model.Article
import com.vijay.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}