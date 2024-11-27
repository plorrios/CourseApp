plugins {
    alias(libs.plugins.courseapplication.android.application)
}

android {
    namespace = "com.plcoding.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}