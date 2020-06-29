plugins {
    id(Plugins.APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KOTLIN__KAPT)
}

android {
    compileSdkVersion (AndroidCore.ANDROID_COMPILE_SDK_VERSION)

    defaultConfig {
        applicationId  = AndroidCore.APPLICATION_ID
        minSdkVersion(AndroidCore.ANDROID_MIN_SDK)
        targetSdkVersion(AndroidCore.ANDROID_TARGET_SDK)
        versionCode =  AndroidCore.VERSION_CODE
        versionName = AndroidCore.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(ModuleDependencies.BASE_PRESENTATION))
    implementation(project(ModuleDependencies.BASE_DOMAIN))
    implementation(project(ModuleDependencies.BASE_DATA))
    implementation(project(ModuleDependencies.COMMON))
    implementation(project(ModuleDependencies.CORE))
    implementation(project(ModuleDependencies.FEATURE_COUNTRIES))

    implementation(Dependencies.kotlin)

    implementation(Dependencies.dagger2)
    implementation(Dependencies.dagger2Support)
    kapt(Dependencies.daggerCompiler)
    kapt(Dependencies.daggerProcessor)

    // Android
    implementation(Dependencies.appCompat)
    implementation(Dependencies.recyclerView)
    implementation(Dependencies.design)
    implementation(Dependencies.androidKtx)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.androidSupport)

    // JetPack
    implementation(Dependencies.lifecycle)
    implementation(Dependencies.lifecycleJava)
    implementation(Dependencies.navigation)
    implementation(Dependencies.navigationUi)

    //Rx
    implementation(Dependencies.rxJava)
    implementation(Dependencies.rxKotlin)
    implementation(Dependencies.rxAndroid)

    //Retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitGsonConverter)
    implementation(Dependencies.retrofitRxAdapter)
    implementation(Dependencies.loggingInterceptor)
    implementation(Dependencies.gson)

    testImplementation(TestLibraryDependencies.junit)
    androidTestImplementation (TestLibraryDependencies.androidxJunit)
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.2.0")
    implementation("androidx.fragment:fragment:1.2.5")

}