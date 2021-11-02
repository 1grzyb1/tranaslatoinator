package com.example.translatoinator.translator.model

data class RandomTranslateRequest(
  val word: String,
  val repeat: Int,
  val inputLanguageCode: String = "ENG"
)