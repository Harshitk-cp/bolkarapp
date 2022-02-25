package com.harshit.bolkarapp.di

import com.harshit.bolkarapp.network.Services
import com.harshit.bolkarapp.ui.HomeRepository
import com.harshit.bolkarapp.utils.Constants
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
    fun provideConstants(): Constants {
        return Constants
    }

    @Singleton
    @Provides
    fun provideHomeRepository(webServices: Services, constants: Constants): HomeRepository {
        return HomeRepository(webServices, constants)
    }

}