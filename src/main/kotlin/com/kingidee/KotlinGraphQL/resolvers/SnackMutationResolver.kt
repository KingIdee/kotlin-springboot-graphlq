package com.kingidee.KotlinGraphQL.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.kingidee.KotlinGraphQL.entity.Snack
import com.kingidee.KotlinGraphQL.repository.SnackRepository
import org.springframework.stereotype.Component

@Component
class SnackMutationResolver(private val snackRepository: SnackRepository): GraphQLMutationResolver {

    fun newSnack(name: String, amount: Double): Snack {
        val snack = Snack(name, amount)
        snackRepository.save(snack)
        return snack
    }

}