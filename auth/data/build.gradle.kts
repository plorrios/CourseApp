plugins {
    alias(libs.plugins.courseapplication.android.library)
    alias(libs.plugins.courseapplication.jvm.ktor)
}

android {
    namespace = "com.plcoding.auth.data"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}