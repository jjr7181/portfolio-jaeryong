package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.Achievement
import com.jaeryong.portfolio.domain.entity.Experience
import com.jaeryong.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository: JpaRepository<Introduction, Long> {


    fun findAllByIsActive(isActive: Boolean): List<Introduction>

}