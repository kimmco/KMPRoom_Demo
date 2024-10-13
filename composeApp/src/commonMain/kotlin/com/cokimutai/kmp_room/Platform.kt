package com.cokimutai.kmp_room

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform