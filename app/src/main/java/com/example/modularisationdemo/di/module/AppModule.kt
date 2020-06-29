package com.example.modularisationdemo.di.module

import android.content.Context
import com.example.modularisationdemo.App
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module(
    includes = [
        ViewModelModule::class,
        ActivityFactoryModule::class,
        FragmentFactoryModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        ApiServiceModule::class
    ]
)
class AppModule {

    @Singleton
    @Provides
    internal fun provideAppContext(app: App): Context = app.applicationContext

    @Singleton
    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}