package com.kingidee.kotlingraphql

import graphql.ErrorType
import graphql.GraphQLError
import graphql.language.SourceLocation

class ErrorHandler : GraphQLError {

    override fun getMessage(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getErrorType(): ErrorType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLocations(): MutableList<SourceLocation> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}