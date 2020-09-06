rootProject.name = "moko-libs"

includeBuild("graphics") {
    dependencySubstitution {
        substitute(module("dev.icerock.moko:graphics"))
            .with(project(":graphics"))
    }
}
includeBuild("parcelize") {
    dependencySubstitution {
        substitute(module("dev.icerock.moko:parcelize"))
            .with(project(":parcelize"))
    }
}
includeBuild("resources")