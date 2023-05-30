package com.example.note_g_11.domain.utils

sealed class ResultStatus<T> {
    class Loading<T> : ResultStatus<T>()
    class Success<T>(val data: T? = null) : ResultStatus<T>()
    class Error<T>(val msg: String) : ResultStatus<T>()
}
