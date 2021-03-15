import org.gradle.api.JavaVersion

// ProjectProperties.kt 定义了工程相关的属性
object ProjectProperties {
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
    const val buildToolsVersion = "30.0.2"

    const val applicationId = "cn.ken.mvvmdolphin"
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"

}
