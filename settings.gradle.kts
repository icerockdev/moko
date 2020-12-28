rootProject.name = "moko-libs"

plugins {
    id("com.gradle.enterprise").version("3.5")
}

fun org.gradle.api.initialization.ConfigurableIncludedBuild.substituteMpp(name: String = this.name) {
    dependencySubstitution {
        listOf(
            name,
            "$name-iosx64",
            "$name-iosarm64"
        ).forEach {
            substitute(module("dev.icerock.moko:$it"))
                .because("multiplatform artifacts")
                .with(project(":$name"))
        }
    }
}

includeBuild("graphics") { substituteMpp() }
includeBuild("parcelize") { substituteMpp() }
includeBuild("resources/resources-gradle-plugin")
includeBuild("resources") { substituteMpp() }
includeBuild("mvvm") { substituteMpp() }
includeBuild("errors") { substituteMpp() }
includeBuild("network/network-gradle-plugin")
includeBuild("network") { substituteMpp() }
includeBuild("units/units-gradle-plugin")
includeBuild("units") { substituteMpp() }
includeBuild("permissions") { substituteMpp() }
includeBuild("media") { substituteMpp() }
includeBuild("fields") { substituteMpp() }
includeBuild("template")

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
