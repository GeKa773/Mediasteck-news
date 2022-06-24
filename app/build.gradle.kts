plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
    //for java
    //id("androidx.navigation.safeargs")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.geka.radchenko.mediastacknews"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }

    //Избегание включения инфраструктуры отладки в результирующий APK
    packagingOptions {
        resources.excludes += "DebugProbesKt.bin"
    }

}

val daggerVersion = "2.40.5"
val coroutinesVersion = "1.6.3"
val roomVersion = "2.4.2"
val retrofitVersion = "2.9.0"
val retrofitAdapterVersion = "0.9.2"
val archComponentVersion = "2.4.1"
val navVersion = "2.4.2"

dependencies {

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

//dagger hilt
dependencies {
    implementation("com.google.dagger:hilt-android:$daggerVersion")
    kapt("com.google.dagger:hilt-compiler:$daggerVersion")
}

//coroutines
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")
}

//room
dependencies {
    implementation("androidx.room:room-runtime:$roomVersion")
    annotationProcessor("androidx.room:room-compiler:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")
}

//retrofit
dependencies {
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:$retrofitAdapterVersion")
}

//lifecycle
dependencies {
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$archComponentVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$archComponentVersion")
    implementation("androidx.lifecycle:lifecycle-common-java8:$archComponentVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$archComponentVersion")

//    implementation("android.arch.lifecycle:extensions:1.1.1")
//    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
//    implementation("androidx.fragment:fragment-ktx:1.4.1")
}

//navigation
dependencies{
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")
}