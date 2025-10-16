package com.promni.folium

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform