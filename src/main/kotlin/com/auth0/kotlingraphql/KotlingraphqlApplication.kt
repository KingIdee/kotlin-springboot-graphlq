package com.auth0.kotlingraphql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


import com.auth0.kotlingraphql.repository.ReviewRepository
import com.auth0.kotlingraphql.repository.SnackRepository
import com.auth0.kotlingraphql.resolvers.ReviewMutationResolver
import com.auth0.kotlingraphql.resolvers.ReviewQueryResolver
import com.auth0.kotlingraphql.resolvers.SnackMutationResolver
import com.auth0.kotlingraphql.resolvers.SnackQueryResolver

import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.core.MongoOperations

@SpringBootApplication
class KotlingraphqlApplication

fun main(args: Array<String>) {
	runApplication<KotlingraphqlApplication>(*args)
}


@Bean
fun snackQuery(snackRepository: SnackRepository,mongoOperations: MongoOperations): SnackQueryResolver {
	return SnackQueryResolver(snackRepository,mongoOperations)
}

@Bean
fun reviewQuery(mongoOperations: MongoOperations): ReviewQueryResolver {
	return ReviewQueryResolver(mongoOperations)
}

@Bean
fun snackMutation(snackRepository: SnackRepository): SnackMutationResolver {
	return SnackMutationResolver(snackRepository)
}

@Bean
fun reviewMutation(reviewRepository: ReviewRepository): ReviewMutationResolver {
	return ReviewMutationResolver(reviewRepository)
}


