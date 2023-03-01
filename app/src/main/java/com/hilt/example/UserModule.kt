package com.hilt.example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    @Named("SQL")
    fun providesSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Provides
    @Named("Firebase")
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}