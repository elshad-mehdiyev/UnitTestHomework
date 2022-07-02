package com.androiddevs.unittesthomework

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeworkTest {

    @Test
    fun `fib(0) == 0  oldugunu  test  et`() {
        val fib = Homework.fib(0)
        assertThat(fib).isEqualTo(0)
    }
    @Test
    fun `fib(1) == 1  oldugunu  test  et`() {
        val fib = Homework.fib(1)
        assertThat(fib).isEqualTo(1)
    }
    @Test
    fun `fib(n) == fib(n-2) + fib(n-1)  oldugunu  test  et`() {
        val fibN5 = Homework.fib(5)
        val fibN4 = Homework.fib(4)
        val fibN3 = Homework.fib(3)
        assertThat(fibN5).isEqualTo(fibN4 + fibN3)
    }

    @Test
    fun `Checks if the braces are set correctly`() {
        val check = Homework.checkBraces("(Hello)")
        assertThat(check).isTrue()
    }
    @Test
    fun `Checks if the braces are set wrongly`() {
        val check = Homework.checkBraces("(Hello))")
        assertThat(check).isFalse()
    }

}