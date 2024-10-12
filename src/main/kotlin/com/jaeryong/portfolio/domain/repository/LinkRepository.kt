package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.Achievement
import com.jaeryong.portfolio.domain.entity.Experience
import com.jaeryong.portfolio.domain.entity.Introduction
import com.jaeryong.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository: JpaRepository<Link, Long> {


    fun findAllByIsActive(isActive: Boolean): List<Link>

}