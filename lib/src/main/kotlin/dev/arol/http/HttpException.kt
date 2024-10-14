package dev.arol.http

class HttpException(message: String, val statusCode: Int? = null) : Exception(message)