package com.kingidee.KotlinGraphQL.resolvers;

import java.util.ArrayList
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.kingidee.KotlinGraphQL.entity.Snack
import org.springframework.stereotype.Component

@Component
class Query : GraphQLQueryResolver {

    fun snacks():List<Snack> {
        val snackList = ArrayList<Snack>()
        snackList.add(Snack("Fluffy cake",30.0))
        return snackList

    }

}