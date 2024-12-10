...

task("copyPreCommitGitHookOnBuild") {
    println("Copying pre-commit Git Hook Script")
    exec {
        commandLine("cp", "./scripts/pre-commit", "./.git/hooks")
    }
}