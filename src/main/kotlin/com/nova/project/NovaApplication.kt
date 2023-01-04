package com.nova.project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NovaApplication

fun main(args: Array<String>) {
    runApplication<NovaApplication>(*args)
}
