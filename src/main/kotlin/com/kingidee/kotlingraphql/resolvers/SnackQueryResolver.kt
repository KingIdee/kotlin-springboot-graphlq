package com.kingidee.kotlingraphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.kingidee.kotlingraphql.entity.Snack
import com.kingidee.kotlingraphql.repository.SnackRepository
import org.springframework.stereotype.Component

@Component
class SnackQueryResolver(val snackRepository: SnackRepository,
                         private val reviewQueryResolver: ReviewQueryResolver) : GraphQLQueryResolver {

    fun snacks(): List<Snack>{
        val list = snackRepository.findAll()
        for(item in list){
            item.reviews = reviewQueryResolver.reviews(snackId = item.id)
        }
        return list
    }

}