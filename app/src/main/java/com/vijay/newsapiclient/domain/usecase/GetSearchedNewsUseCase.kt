package com.vijay.newsapiclient.domain.usecase

import com.vijay.newsapiclient.data.model.APIResponse
import com.vijay.newsapiclient.data.util.Resource
import com.vijay.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}