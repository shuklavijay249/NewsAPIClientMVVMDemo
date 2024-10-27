package com.vijay.newsapiclient.domain.usecase

import com.vijay.newsapiclient.data.model.APIResponse
import com.vijay.newsapiclient.data.util.Resource
import com.vijay.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}