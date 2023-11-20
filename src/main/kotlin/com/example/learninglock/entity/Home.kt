package com.example.learninglock.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0L
    var name: String = ""
    var price: Int = 0

    fun decreasePrice(price: Int) {
        if (this.price - price < 0) {
            throw IllegalArgumentException("가격이 부족해 ~ ")
        }

        this.price -= price
    }
}