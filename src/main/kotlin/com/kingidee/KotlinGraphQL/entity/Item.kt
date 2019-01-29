package com.kingidee.KotlinGraphQL.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


open class Item {

    var id:Long = 0
    var title:String=""
    var amount:String=""

}