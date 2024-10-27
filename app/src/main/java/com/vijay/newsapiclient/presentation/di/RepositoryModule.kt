package com.vijay.newsapiclient.presentation.di

import com.vijay.newsapiclient.data.repository.NewsRepositoryImpl
import com.vijay.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.vijay.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.vijay.newsapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import com.vijay.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














