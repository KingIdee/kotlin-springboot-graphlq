package com.kingidee.KotlinGraphQL

import com.kingidee.KotlinGraphQL.repository.SnackRepository
import com.kingidee.KotlinGraphQL.resolvers.SnackMutationResolver
import com.kingidee.KotlinGraphQL.resolvers.SnackQueryResolver
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinGraphQlApplication

fun main(args: Array<String>) {
	runApplication<KotlinGraphQlApplication>(*args)
}

@Bean
fun snackQuery(snackRepository: SnackRepository): SnackQueryResolver {
	return SnackQueryResolver(snackRepository)
}

@Bean
fun snackMutation(snackRepository: SnackRepository): SnackMutationResolver {
	return SnackMutationResolver(snackRepository)
}

