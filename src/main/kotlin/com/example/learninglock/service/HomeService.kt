package com.example.learninglock.service

import com.example.learninglock.repository.HomeRepository
import org.springframework.stereotype.Service


@Service
class HomeService(private val homeRepository: HomeRepository) {

    fun currentPrice(name: String): Int? {
        val home = homeRepository.findByName(name)
        return home?.price
    }

    fun decreasePrice(name: String, price: Int): Int? {
        val home = homeRepository.findByName(name)
        home?.decreasePrice(price)
        return home?.price
    }


}