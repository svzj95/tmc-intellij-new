package com.github.svzj95.tmcintellijnew.services

import com.intellij.openapi.project.Project
import com.github.svzj95.tmcintellijnew.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
