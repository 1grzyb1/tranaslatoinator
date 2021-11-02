package com.example.translatoinator.rest

import com.example.translatoinator.translator.model.RandomTranslateRequest
import com.example.translatoinator.translator.model.RandomTranslateResponse
import com.example.translatoinator.translator.port.TranslateUseCase
import com.example.translatoinator.translator.port.TranslatorAdapter
import com.google.cloud.translate.Language
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/randomTranslate")
@CrossOrigin
internal class TranslatoinatorController(val translateUseCase: TranslateUseCase, val translatorAdapter: TranslatorAdapter)  {

  @PostMapping
  fun listLanguages(@RequestBody request: RandomTranslateRequest): RandomTranslateResponse {
    return translateUseCase.translate(request)
  }

  @GetMapping
  fun getLanguageList(): List<Language> {
    return translatorAdapter.getLanguages()
  }
}