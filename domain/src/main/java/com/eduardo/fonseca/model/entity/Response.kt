package com.eduardo.fonseca.model.entity

sealed class Response<T>(val data: T? = null, val e: Throwable? = null){
    class Success<T>(data: T) : Response<T>(data)
    class Error<T>(e: Throwable, data: T? = null) : Response<T>(data, e)
    class Loading<T>(data: T? = null) : Response<T>(data)
}
