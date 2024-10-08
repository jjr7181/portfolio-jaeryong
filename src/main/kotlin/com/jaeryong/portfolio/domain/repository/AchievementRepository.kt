package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository: JpaRepository<Achievement, Long> {

}