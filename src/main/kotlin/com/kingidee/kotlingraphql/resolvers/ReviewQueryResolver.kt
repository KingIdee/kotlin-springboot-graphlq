package com.kingidee.kotlingraphql.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.kingidee.kotlingraphql.entity.Review
import com.kingidee.kotlingraphql.repository.ReviewRepository
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query


@Component
class ReviewQueryResolver @Autowired constructor(val mongoOperation: MongoOperations,
                                                 val reviewRepository: ReviewRepository): GraphQLQueryResolver {

    fun reviews(snackId:String) : List<Review> {

        val query = Query()
        query.addCriteria(Criteria.where("snackId").`is`(snackId))

        return mongoOperation.find(query, Review::class.java)

    }

}

