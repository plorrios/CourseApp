plugins {
    alias(libs.plugins.courseapplication.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}