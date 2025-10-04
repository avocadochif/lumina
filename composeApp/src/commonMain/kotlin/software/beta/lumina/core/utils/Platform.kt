package software.beta.lumina.core.utils

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
