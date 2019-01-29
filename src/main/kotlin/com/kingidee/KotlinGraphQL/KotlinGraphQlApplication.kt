package com.kingidee.KotlinGraphQL

import com.kingidee.KotlinGraphQL.resolvers.Query
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinGraphQlApplication

fun main(args: Array<String>) {
	runApplication<KotlinGraphQlApplication>(*args)
}

@Bean
fun query(): Query {
	return Query()
}

