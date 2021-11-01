package com.example.translatoinator.util

import java.util.*
import java.util.concurrent.ThreadLocalRandom

object RandomListElements {

  fun <E> pickNRandomElements(list: List<E>, n: Int, r: Random): List<E> {
    val length = list.size
    val randomList = mutableListOf<E>()
    if (length < n)
      throw IllegalArgumentException("Passed empty list")
    for (i in length - 1 downTo length - n) {
      randomList.add(list[r.nextInt(i + 1)])
    }
    return randomList
  }

  fun <E> pickNRandomElements(list: List<E>, n: Int): List<E> {
    return pickNRandomElements(list, n, ThreadLocalRandom.current())
  }
}