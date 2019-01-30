package com.kingidee.KotlinGraphQL.repository

import com.kingidee.KotlinGraphQL.entity.Snack
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SnackRepository : MongoRepository<Snack, String>