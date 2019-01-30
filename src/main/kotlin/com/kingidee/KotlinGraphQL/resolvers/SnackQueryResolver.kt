package com.kingidee.KotlinGraphQL.resolvers;

import java.util.ArrayList
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.kingidee.KotlinGraphQL.entity.Snack
import com.kingidee.KotlinGraphQL.repository.SnackRepository
import org.springframework.stereotype.Component

@Component
class SnackQueryResolver(val snackRepository: SnackRepository) : GraphQLQueryResolver {

    fun snacks() = snackRepository.findAll()

    /*fun snacks(): List<Snack>{
        val list = ArrayList<Snack>()
        list.add(Snack("Cake",20.0))
        return list
    }*/

}