package com.example.translatoinator.translator.service

import com.example.translatoinator.translator.port.TranslatorAdapter
import com.google.cloud.translate.Language
import org.springframework.stereotype.Service

@Service
internal class WordTranslationService(private val translatorAdapter: TranslatorAdapter) {

  fun transform(codes: List<Language>, word: String) : String {
    var transformingWord = word
    codes.forEach {
      transformingWord = translatorAdapter.translate(transformingWord, it.code)
    }
    return translatorAdapter.translate(transformingWord, "PL")
  }
}