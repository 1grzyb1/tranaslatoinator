package com.example.translatoinator.translator.port

import com.google.cloud.translate.Language

interface TranslatorAdapter {

  fun getLanguageCodes(): List<Language>

  fun translate(word: String, code: String): String
}