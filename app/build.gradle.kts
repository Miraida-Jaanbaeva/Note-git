plugins {
    id(Plugins.AGP.application)
    id(Plugins.Kotlin.kotlin)
    id(Plugins.Kotlin.kotlinKapt)
    id(Plugins.hilt)
}

android {
    namespace = "com.example.note_g_11"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.note_g_11"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

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
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(Dependencies.Ui.core)
    implementation(Dependencies.Ui.appcompat)
    implementation(Dependencies.Ui.material)
    implementation(Dependencies.Ui.constraint)
    implementation(Dependencies.Ui.legacy)
    implementation(Dependencies.Ui.lifecycleLivedata)
    implementation(Dependencies.Ui.lifecycleViewModel)

    //Room
    implementation(Dependencies.Room.runtime)
    kapt(Dependencies.Room.compiler)

    //Hilt
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.compiler)

    //Coroutine
    implementation(Dependencies.Coroutine.core)

    //Lifecycle
    implementation(Dependencies.Lifecycle.runtime)
    implementation(Dependencies.Lifecycle.fragment)

    //Nav
    implementation(Dependencies.Nav.fragment)
}