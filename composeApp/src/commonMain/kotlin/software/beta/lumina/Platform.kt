package software.beta.lumina

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
