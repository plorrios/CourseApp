plugins {
    alias(libs.plugins.courseapplication.android.feature.ui)
}

android {
    namespace = "com.plcoding.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}