package com.jaeryong.portfolio.domain.repository

import com.jaeryong.portfolio.domain.entity.Achievement
import com.jaeryong.portfolio.domain.entity.Experience
import com.jaeryong.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository: JpaRepository<HttpInterface, Long> {
    
}