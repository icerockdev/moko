
val projectPathMap: Map<String, String> = mapOf(
    "graphics" to "graphics",
    "parcelize" to "parcelize",
    "resources" to "resources",
    "resources-gradle-plugin" to "resources-generator",
    "mvvm" to "mvvm",
    "template" to "mpp-library",
    "template" to "android-app"
)

fun createProxyTask(taskName: String) {
    tasks.create(taskName) {
        group = "build"

        projectPathMap.forEach { (build, project) ->
            val includedBuild = gradle.includedBuild(build)
            dependsOn(includedBuild.task(":$project:$taskName"))
        }
    }
}

createProxyTask("build")
createProxyTask("clean")

data class TaskDesc(
    val includedBuild: String,
    val projectPath: String = includedBuild,
    val tasks: List<String> = listOf(
        "assemble",
        "assembleDebug",
        "assembleRelease",
        "compileKotlinIosArm64",
        "compileKotlinIosX64",
        "build",
        "clean",
        "dependencies"
    )
)

listOf(
    TaskDesc(includedBuild = "graphics"),
    TaskDesc(includedBuild = "parcelize"),
    TaskDesc(includedBuild = "resources"),
    TaskDesc(includedBuild = "mvvm"),
    TaskDesc(includedBuild = "errors"),
    TaskDesc(includedBuild = "network"),
    TaskDesc(includedBuild = "template", projectPath = "mpp-library")
).forEach { taskDesc ->
    taskDesc.tasks.forEach { taskName ->
        val includedBuildName = taskDesc.includedBuild.capitalize()
        val projectName = taskDesc.projectPath.capitalize()

        tasks.create("$taskName$includedBuildName$projectName") {
            group = taskDesc.includedBuild

            val task = gradle.includedBuild(taskDesc.includedBuild).task(":${taskDesc.projectPath}:$taskName")
            dependsOn(task)
        }
    }
}
