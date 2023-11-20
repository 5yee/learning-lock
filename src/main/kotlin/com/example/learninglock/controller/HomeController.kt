package com.example.learninglock.controller

import com.example.learninglock.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController(private val homeService: HomeService) {
    @GetMapping("/decrease")
    fun decreasePrice(
        @RequestParam(value = "name") name: String,
        @RequestParam(value = "price") price: Int
    ): String? {
        var result: String
        try {
            homeService.decreasePrice(name, price)
            result = "현재 가격 : " + homeService.currentPrice(name)
        } catch (e: Exception) {
            result = e.message.toString()
        }
        println(result)

        return result
    }
}