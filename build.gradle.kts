// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.AGP.application) version Versions.application apply false
    id(Plugins.AGP.library) version Versions.androidLibrary apply false
    id(Plugins.Kotlin.kotlin) version Versions.kotlinAndroid apply false
    id(Plugins.hilt) version Versions.hilt apply false
    id(Plugins.Kotlin.jvm) version Versions.kotlinJvm apply false
}