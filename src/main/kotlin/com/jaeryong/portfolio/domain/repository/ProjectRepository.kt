package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository: JpaRepository<Project, Long> {
    
}