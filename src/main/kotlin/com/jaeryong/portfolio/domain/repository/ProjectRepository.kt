package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectRepository: JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Project>

}