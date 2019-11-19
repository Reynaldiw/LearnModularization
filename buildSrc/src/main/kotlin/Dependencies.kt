object ApplicationId {
    val id = "com.reynaldiwijaya.learnmodular"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"

    val compileSdkVersion = 29
    val buildToolsVersion = "29.0.2"
    val minSdkVersion = 21
    val targetSdkVersion = 29
}

object Versions {
    const val kotlin = "1.3.41"
    const val gradle = "3.5.0"

    // Ktx
    const val constraintlayout = "1.1.3"
    const val appcompat = "1.1.0"
    const val ktx = "1.1.0"

    //network
    const val retrofit = "2.6.0"
    const val rxretrofit = "2.4.0"
    const val okhttpLogging = "3.11.0"

    //thread
    const val coroutines = "1.3.0-M2"
    const val coroutinesAdapter = "0.9.2"

    //media
    const val glide = "4.8.0"

    //data
    const val gson = "2.8.5"

    // di
    const val koin = "2.0.1"

    // Helper
    const val phoenix = "v0.0.1"

    // Jetpack
    const val archLifecycle = "2.0.0"
    const val recyclerView = "1.0.0"
    const val lifecycleViewmodel = "2.2.0-alpha02"

    // Testing
    const val jUnit = "4.12"
    const val testRunner = "1.2.0"
    const val espresso = "3.2.0"
}

object Android {
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val cardView = "androidx.cardview:cardview:${Versions.appcompat}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
}

object Jetpack {
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.archLifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.archLifecycle}"
    val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewmodel}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
}

object Dependencies {
    val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
}

object Retrofit {
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.rxretrofit}"
    val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
    val coroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.coroutinesAdapter}"
}

object Coroutines {
    val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
}

object Glide {
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object Phoenix {
    val phoenix = "com.github.Reynaldiw:PhoenixLibrary:${Versions.phoenix}"
}

object Koin {
    val scope = "org.koin:koin-androidx-scope:${Versions.koin}"
    val viewmodel =  "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val ext = "org.koin:koin-androidx-ext:${Versions.koin}"
}