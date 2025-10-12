package software.beta.lumina.core.common

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
