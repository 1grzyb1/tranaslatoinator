package com.example.translatoinator.translator.port

import com.example.translatoinator.translator.model.RandomTranslateRequest
import com.example.translatoinator.translator.model.RandomTranslateResponse

interface TranslateUseCase {

  fun translate(translateRequest: RandomTranslateRequest) : RandomTranslateResponse
}