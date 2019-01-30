package com.kingidee.KotlinGraphQL.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection="snack")
data class Snack (
        var name: String,
        var amount: Double
){
    @Id
    var id: Long = 0
}