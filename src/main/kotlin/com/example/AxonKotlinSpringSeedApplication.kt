package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AxonKotlinSpringSeedApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
