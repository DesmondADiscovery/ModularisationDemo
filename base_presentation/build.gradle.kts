plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KOTLIN_EXTENSIONS)
    id(Plugins.KOTLIN__KAPT)
    id(Plugins.KOTLIN_NAV_SAFE_ARGS)
}

android {
    compileSdkVersion (AndroidCore.ANDROID_COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(AndroidCore.ANDROID_MIN_SDK)
        targetSdkVersion(AndroidCore.ANDROID_TARGET_SDK)

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
}

dependencies {
    implementation(project(ModuleDependencies.CORE))

    implementation(Dependencies.kotlin)

    implementation(Dependencies.dagger2)
    implementation(Dependencies.dagger2Support)

    // Android
    implementation(Dependencies.appCompat)
    implementation(Dependencies.recyclerView)
    implementation(Dependencies.design)
    implementation(Dependencies.androidKtx)
    implementation(Dependencies.constraintLayout)

    // JetPack
    implementation(Dependencies.lifecycle)
    implementation(Dependencies.lifecycleJava)
    implementation(Dependencies.navigation)
    implementation(Dependencies.navigationUi)

    implementation(Dependencies.rxJava)

    implementation(Dependencies.picasso)


    testImplementation(TestLibraryDependencies.junit)
    androidTestImplementation (TestLibraryDependencies.androidxJunit)
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.2.0")
}