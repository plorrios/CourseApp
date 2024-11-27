plugins {
    alias(libs.plugins.courseapplication.android.application)
    alias(libs.plugins.courseapplication.android.room)
}

android {
    namespace = "com.plcoding.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}