package com.example.learninglock.repository

import com.example.learninglock.entity.Home
import org.springframework.data.jpa.repository.JpaRepository

interface HomeRepository : JpaRepository<Home, Long> {
    fun findByName(name: String): Home?
}