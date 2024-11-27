plugins {
    alias(libs.plugins.courseapplication.android.application)
}

android {
    namespace = "com.plcoding.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}