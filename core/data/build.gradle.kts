plugins {
    alias(libs.plugins.courseapplication.android.application)
    alias(libs.plugins.courseapplication.jvm.ktor)
}

android {
    namespace = "com.plcoding.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}