package es.enylrad.helloworldkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform