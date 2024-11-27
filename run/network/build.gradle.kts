plugins {
    alias(libs.plugins.courseapplication.android.application)
    alias(libs.plugins.courseapplication.jvm.ktor)
}

android {
    namespace = "com.plcoding.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}