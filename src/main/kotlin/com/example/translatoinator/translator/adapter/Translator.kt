package com.example.translatoinator.translator.adapter

import com.example.translatoinator.translator.port.TranslatorAdapter
import com.google.cloud.translate.Language
import com.google.cloud.translate.Translate
import com.google.cloud.translate.Translate.LanguageListOption
import com.google.cloud.translate.Translate.TranslateOption
import org.springframework.cache.annotation.Cacheable

open class Translator(private val translator: Translate) : TranslatorAdapter {

  @Cacheable("languages")
  override fun getLanguages(): List<Language> {
    return translator
      .listSupportedLanguages(LanguageListOption.targetLanguage("PL"))
  }

  override fun translate(word: String, code: String): String {
    return translator.translate(word, TranslateOption.targetLanguage(code)).translatedText
  }
}