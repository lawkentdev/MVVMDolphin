plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(ProjectProperties.compileSdkVersion)
    buildToolsVersion(ProjectProperties.buildToolsVersion)

    defaultConfig {
        applicationId(ProjectProperties.applicationId)
        minSdkVersion(ProjectProperties.minSdkVersion)
        targetSdkVersion(ProjectProperties.targetSdkVersion)
        versionCode(ProjectProperties.versionCode)
        versionName(ProjectProperties.versionName)

        testInstrumentationRunner(ProjectProperties.testInstrumentationRunner)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility(ProjectProperties.sourceCompatibility)
        targetCompatibility(ProjectProperties.targetCompatibility)
    }
    kotlinOptions {
        jvmTarget = ProjectProperties.jvmTarget
    }
}

dependencies {
    implementation(Libs.kotlin)
    implementation(Libs.kotlinKtx)
    implementation(Libs.appcompat)
    implementation(Libs.material)
    implementation(Libs.constraintlayout)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.testJunit)
    androidTestImplementation(Libs.espressoCore)
}