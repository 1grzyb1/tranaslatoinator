package com.example.translatoinator.translator.adapter

import com.google.cloud.translate.TranslateOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class TranslatorConfiguration {

  @Bean
  fun translator() : Translator {
    return Translator(
      TranslateOptions
        .newBuilder()
        .build()
        .service
    )
  }
}