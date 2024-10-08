package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.Achievement
import com.jaeryong.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository: JpaRepository<Experience, Long> {
    
}