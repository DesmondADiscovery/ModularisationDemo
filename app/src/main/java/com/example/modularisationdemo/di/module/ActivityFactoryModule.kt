package com.example.modularisationdemo.di.module

import com.example.modularisationdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityFactoryModule {

    @ContributesAndroidInjector
    internal abstract fun contributesMainActivity(): MainActivity
}