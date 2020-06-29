plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KOTLIN__KAPT)
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
}


dependencies {
    implementation(project(ModuleDependencies.BASE_DATA))
    implementation(project(ModuleDependencies.COMMON))
    implementation(Dependencies.kotlin)

    // Rx
    implementation(Dependencies.rxKotlin)
    implementation(Dependencies.rxJava)

    // Dagger
    implementation(Dependencies.dagger2)
    implementation(Dependencies.inject)

    kapt(Dependencies.daggerCompiler)

    testImplementation(TestLibraryDependencies.junit)
    testImplementation(TestLibraryDependencies.mockK)
    testImplementation(TestLibraryDependencies.mockitoKotlin)
    testImplementation(TestLibraryDependencies.mockitoInline)
    testImplementation(TestLibraryDependencies.assertJVersion)
}