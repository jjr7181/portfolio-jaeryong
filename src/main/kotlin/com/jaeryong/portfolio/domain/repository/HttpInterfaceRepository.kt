package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.Achievement
import com.jaeryong.portfolio.domain.entity.Experience
import com.jaeryong.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository: JpaRepository<HttpInterface, Long> {


    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end: LocalDateTime): Long

}