plugins {
    id("com.android.application")

    //for fireBase

    id("com.google.gms.google-services")
}

android {
    namespace = "com.androidmessenger"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.androidmessenger"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    buildFeatures{
        viewBinding = true
    }

}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



    // support for different screen sizes

    // https://mvnrepository.com/artifact/com.intuit.sdp/sdp-android
    implementation ("com.intuit.sdp:sdp-android:1.0.6")
    // https://mvnrepository.com/artifact/com.intuit.ssp/ssp-android
    implementation("com.intuit.ssp:ssp-android:1.0.6")


    // Rounded ImageView

    // https://mvnrepository.com/artifact/com.makeramen/roundedimageview
    implementation("com.makeramen:roundedimageview:2.3.0")

    // fireBase

    implementation("com.google.firebase:firebase-messaging:23.4.1")
    implementation("com.google.firebase:firebase-firestore:24.10.2")

    implementation(platform("com.google.firebase:firebase-bom:32.7.2"))

    //MultiDex

    // https://mvnrepository.com/artifact/androidx.multidex/multidex
    implementation ("androidx.multidex:multidex:2.0.1")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")


}