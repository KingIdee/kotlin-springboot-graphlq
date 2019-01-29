package com.kingidee.KotlinGraphQL.resolvers;


import java.util.ArrayList
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.kingidee.KotlinGraphQL.entity.Item
import org.springframework.stereotype.Component


@Component
open class Query : GraphQLQueryResolver {

    fun items(): List<Item> {
        val clothItemList = ArrayList<Item>()

        var x = Item()
        x.amount = "$50"
        x.title = "Joggers"

        clothItemList.add(x)
        /*clothItemList.add(ClothItem(100,"Wiggle Dress", "$15"))
        clothItemList.add(ClothItem(100,"Hoodies", "$20"))*/

        return clothItemList
    }

}