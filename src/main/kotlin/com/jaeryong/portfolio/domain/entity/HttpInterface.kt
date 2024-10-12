package com.jaeryong.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.servlet.http.HttpServletRequest


@Entity
class HttpInterface(httpServletRequest: HttpServletRequest): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null

    var cookies: String? = httpServletRequest.cookies
        ?.map{ "${it.name}:${it.value}" }
        ?.toString()

    var referer: String? = httpServletRequest.getHeader("referer")

    var localAddr: String? = httpServletRequest.localAddr

    var remoteAddr: String? = httpServletRequest.remoteAddr

    var remotehost: String? = httpServletRequest.remoteHost

    var requestUri: String? = httpServletRequest.requestURI

    //브라우저 정보, chrome safari mobile desktop
    var userAgent: String? = httpServletRequest.getHeader("user-agent")

}