object ApplicationId {
    const val id = "com.mmi.testdemo"
}

object Modules {

    const val common = ":common"
    const val core = ":core"
    const val data = ":data-layer"
    const val domain = ":domain-layer"
    const val presentation = ":presentation"

}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

/**
 * Arranged alphabetically
 */
object Versions {
    const val appCompat = "1.4.0"
    const val androidTestRunner = "1.2.0"
    const val androidJunit = "4.+"
    const val buildTool = "29.0.2"
    const val cardViewVersion = "1.0.0"
    const val coreKtx = "1.3.2"
    const val compileSdkVersion = 31
    const val constraintLayout = "2.0.3"
    const val coroutines = "1.3.5"
    const val dagger = "2.40.5"
    const val espressoCore = "3.4.0"
    const val fragment = "1.2.0"
    const val glideVersion = "4.9.0"
    const val gradle = "4.0.1"
    const val junit = "4.12"
    const val kotlinVersion = "1.4.10"
    const val kotlinCoroutine = "1.3.5-native-mt"
    const val lifecycle = "2.2.0"
    const val minSdk = 21
    const val legacyVersion = "1.0.0"
    const val logginInterceptor = "4.7.2"
    const val materialDesignVersion = "1.4.0"
    const val moshiVersion = "1.11.0"
    const val nav = "2.3.1"
    const val okHttp = "3.12.1"
    const val retrofit = "2.9.0"
    const val retrofitMoshi = "2.6.2"
    const val roomVersion = "2.2.5"
    const val recyclerview = "1.1.0"
    const val rxJavaAndroid = "2.1.1"
    const val rxJava = "2.2.9"
    const val rxJavaKotlin = "2.2.0"
    const val safeArgs = "2.2.2"
    const val shapeImageVersion = "0.9.3@aar"
    const val svgDecoderVersion = "1.2.1"
    const val targetSdk = 31
    const val vectorDrawableVersion = "1.1.0"
}

object Libraries {
    // Dagger core

    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}" // if you use the support libraries
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAndroidSupportCompiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"




    // RETROFIT
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshiConverter =
        "com.squareup.retrofit2:converter-moshi:${Versions.retrofitMoshi}"
    const val httpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.logginInterceptor}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"

    // MOSHI
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshiVersion}"
    const val moshiKotlinCodegen =
        "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"

    // VIEWS AND ANIMATIONS
    const val shapeImage =
        "com.github.siyamed:android-shape-imageview:${Versions.shapeImageVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    const val svgDecoder = "com.caverock:androidsvg:${Versions.svgDecoderVersion}"
}

object KotlinLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val coreKotlinCoroutine =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutine}"
    const val androidKotlinCoroutine =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutine}"
}

object AndroidLibraries {
    const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacyVersion}"

    // ANDROID
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardViewVersion}"
    const val vectorDrawable =
        "androidx.vectordrawable:vectordrawable:${Versions.vectorDrawableVersion}"
    const val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val fragment = "androidx.fragment:fragment:${Versions.fragment}"

    const val materialDesign =
        "com.google.android.material:material:${Versions.materialDesignVersion}"

    // ViewModel and LiveData
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompile = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    // ROOM
    const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"

    // optional - Kotlin Extensions and Coroutines support for Room
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"

}

object TestLibraries {
    // ANDROID TEST
    const val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    const val junit = "androidx.test.ext:junit:${Versions.androidJunit}"

}