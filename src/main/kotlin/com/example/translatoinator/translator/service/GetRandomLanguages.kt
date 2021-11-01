package com.example.translatoinator.translator.service

import com.example.translatoinator.translator.port.TranslateUseCase
import com.example.translatoinator.translator.port.TranslatorAdapter
import com.example.translatoinator.util.RandomListElements.pickNRandomElements
import com.google.cloud.translate.Language
import org.springframework.stereotype.Service

@Service
internal class GetRandomLanguages(private val translatorAdapter: TranslatorAdapter) {

  fun getRandomLanguages(count: Int) : List<Language> {
    val codes = translatorAdapter.getLanguageCodes()
    return pickNRandomElements(codes, count)
  }
}