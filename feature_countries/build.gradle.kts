import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KOTLIN__KAPT)
    id(Plugins.KOTLIN_NAV_SAFE_ARGS)
    id(Plugins.KOTLIN_EXTENSIONS)
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
    implementation(project(ModuleDependencies.COMMON))
    implementation(project(ModuleDependencies.BASE_PRESENTATION))
    implementation(project(ModuleDependencies.BASE_DOMAIN))

    implementation(Dependencies.constraintLayout)

    implementation(Dependencies.dagger2)
    implementation(Dependencies.dagger2Support)
    kapt(Dependencies.daggerCompiler)
    kapt(Dependencies.daggerProcessor)

    implementation(Dependencies.navigation)
    implementation(Dependencies.navigationUi)

    implementation(Dependencies.kotlin)
    implementation(Dependencies.androidSupport)

    implementation(Dependencies.rxJava)
    implementation(Dependencies.rxKotlin)
    implementation(Dependencies.rxAndroid)
    implementation(Dependencies.gson)

    testImplementation(TestLibraryDependencies.junit)
    testImplementation(TestLibraryDependencies.mockK)
    testImplementation(TestLibraryDependencies.mockitoKotlin)
    testImplementation(TestLibraryDependencies.mockitoInline)
    testImplementation(TestLibraryDependencies.assertJVersion)
    testImplementation(TestLibraryDependencies.archCoreTesting)
}