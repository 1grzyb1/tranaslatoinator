package com.example.translatoinator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class TranaslatoinatorApplication

fun main(args: Array<String>) {
  runApplication<TranaslatoinatorApplication>(*args)
}
