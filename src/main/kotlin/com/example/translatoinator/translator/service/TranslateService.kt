package com.example.translatoinator.translator.service

import com.example.translatoinator.translator.model.RandomTranslateRequest
import com.example.translatoinator.translator.model.RandomTranslateResponse
import com.example.translatoinator.translator.port.TranslateUseCase
import com.google.cloud.translate.Language
import org.springframework.stereotype.Service

@Service
internal class TranslateService(
  private val getRandomLanguages: GetRandomLanguages,
  private val wordTranslationService: WordTranslationService
) : TranslateUseCase {

  override fun translate(translateRequest: RandomTranslateRequest): RandomTranslateResponse {
    val languages = getRandomLanguages.getRandomLanguages(
      translateRequest.repeat,
      translateRequest.inputLanguageCode
    )
    val transformedWord = wordTranslationService.transform(
      languages,
      translateRequest.word,
      translateRequest.inputLanguageCode
    )
    return RandomTranslateResponse(transformedWord, languages.map(Language::getName))
  }
}