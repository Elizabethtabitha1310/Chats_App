plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id ("com.google.gms.google-services")
    id ("kotlin-android")
    id ("kotlin-parcelize")
    id ("kotlin-kapt")
    id ("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.chats_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chats_app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
buildFeatures{
    dataBinding = true
    viewBinding = true
}

    buildTypes {
        release {
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-common-java8:2.8.6")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6")
    implementation ("androidx.activity:activity-ktx:1.9.2")


    implementation ("com.google.firebase:firebase-firestore:25.1.0")
    implementation ("com.google.firebase:firebase-firestore-ktx:25.1.0")


    implementation ("com.google.firebase:firebase-auth:23.0.0")
    implementation ("com.google.firebase:firebase-auth-ktx:23.0.0")

    implementation ("androidx.navigation:navigation-fragment-ktx:2.8.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.8.1")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")

    implementation ("de.hdodenhof:circleimageview:2.1.0")

    implementation ("com.google.firebase:firebase-storage:20.1.0")

    // Kotlin components
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.20")

    //coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    implementation ("com.rengwuxian.materialedittext:library:2.1.4")

    implementation ("com.google.firebase:firebase-messaging:24.0.2")
    implementation ("com.google.firebase:firebase-installations:18.0.0")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.6.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
}