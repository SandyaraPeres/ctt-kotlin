package com.sandy.buscarcep.model

sealed class StateResponse<T>

class StateSuccess<T>(val data: T) : StateResponse<T>()
class StateError<T>(val error: Throwable) : StateResponse<T>()