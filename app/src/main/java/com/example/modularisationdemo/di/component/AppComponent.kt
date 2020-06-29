package com.example.modularisationdemo.di.component

import com.example.modularisationdemo.App
import com.example.modularisationdemo.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    abstract  class Factory : AndroidInjector.Factory<App>
}