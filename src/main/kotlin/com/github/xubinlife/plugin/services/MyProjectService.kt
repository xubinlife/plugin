package com.github.xubinlife.plugin.services

import com.github.xubinlife.plugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
