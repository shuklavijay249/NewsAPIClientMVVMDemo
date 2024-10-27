package com.vijay.newsapiclient.domain.usecase

import com.vijay.newsapiclient.data.model.Article
import com.vijay.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
  suspend fun execute(article: Article)=newsRepository.saveNews(article)
}