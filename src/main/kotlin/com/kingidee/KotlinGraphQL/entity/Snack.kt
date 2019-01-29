package com.kingidee.KotlinGraphQL.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Snack (
        var name: String,
        var amount: Double
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
}