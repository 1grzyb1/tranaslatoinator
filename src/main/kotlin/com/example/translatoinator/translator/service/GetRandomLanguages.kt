package com.example.translatoinator.translator.service

import com.example.translatoinator.translator.port.TranslatorAdapter
import com.example.translatoinator.util.RandomListElements.pickNRandomElements
import com.google.cloud.translate.Language
import org.springframework.stereotype.Service

@Service
internal class GetRandomLanguages(private val translatorAdapter: TranslatorAdapter) {

  fun getRandomLanguages(count: Int, inputLanguageCode: String) : List<Language> {
    val languages = translatorAdapter.getLanguages()
    val randomLanguages = pickNRandomElements(languages, count).toMutableList()
    randomLanguages.add(languages.first { it.code.uppercase() == inputLanguageCode.uppercase() })
    return randomLanguages.toList()
  }
}