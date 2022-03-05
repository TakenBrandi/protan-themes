package com.github.takenbrandi.protanthemes.services

import com.intellij.openapi.project.Project
import com.github.takenbrandi.protanthemes.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
