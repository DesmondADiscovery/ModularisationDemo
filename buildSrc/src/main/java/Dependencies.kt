
import kotlin.reflect.full.memberProperties

object Versions {
    // DI
    const val injectVersion = "1"
    const val dagger2Version = "2.27"


    // AndroidX & JetPack
    const val coreKtxVersion = "1.2.0"
    const val lifecycleVersion = "2.2.0"
    const val archCoreTesting = "2.1.0"
    const val navigationVersion = "2.2.2"
    const val appCompatVersion = "1.1.0"
    const val androidSupportVersion = "1.0.0"
    const val designVersion = "1.0.0"

    // RX
    const val rxJavaVersion = "2.2.0"
    const val rxKotlinVersion = "2.2.0"
    const val rxAndroidVersion = "2.0.2"
    const val rxBindingVersion = "3.0.0-alpha2"

    // Network & Serialization
    const val retrofitVersion = "2.5.0"
    const val gsonVersion = "2.8.5"
    const val okhttpVersion = "4.5.0"

    // UI
    const val picassoVersion = "2.71828"
    const val constraintLayoutVersion = "2.0.0-beta5"

    // Google
    const val googlePlayVersion = "15.0.1"
    const val googlePlayCoreVersion = "1.6.4"
    const val googlePlayVersionAuth = "16.0.0"
}

object Dependencies {

    //Dagger
    const val dagger2 = "com.google.dagger:dagger-android:${Versions.dagger2Version}"
    const val dagger2Support = "com.google.dagger:dagger-android-support:${Versions.dagger2Version}"
    const val inject = "javax.inject:javax.inject:${Versions.injectVersion}"

    //Android
    const val androidSupport = "androidx.legacy:legacy-support-v4:${Versions.androidSupportVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val gridLayout = "androidx.gridlayout:gridlayout:${Versions.androidSupportVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.androidSupportVersion}"
    const val cardView = "androidx.cardview:cardview:${Versions.androidSupportVersion}"
    const val design = "com.google.android.material:material:${Versions.designVersion}"
    const val transition = "androidx.transition:transition:${Versions.androidSupportVersion}"
    const val androidKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val google_services = "com.google.firebase:firebase-analytics:17.5.0"

    //Jetpack
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    const val lifecycleJava = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    //Rx
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlinVersion}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
    const val rxBinding = "com.jakewharton.rxbinding3:rxbinding:${Versions.rxBindingVersion}"
    const val rxBindingDesign = "com.jakewharton.rxbinding3:rxbinding-material:${Versions.rxBindingVersion}"

    //Squareup
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    //Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${AndroidCore.KOTLIN_VERSION}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${AndroidCore.KOTLIN_VERSION}"

    //GooglePlay
    const val location = "com.google.android.gms:play-services-location:${Versions.googlePlayVersion}"
    const val maps = "com.google.android.gms:play-services-maps:${Versions.googlePlayVersion}"
    const val gcm = "com.google.android.gms:play-services-gcm:${Versions.googlePlayVersion}"

    //Kapt
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger2Version}"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger2Version}"
}