package com.phantomray.mobiparser

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform