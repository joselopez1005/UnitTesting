package com.jlopez.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test



class MoreExamplesTest {

    @Test
    fun `fib n = 0 should return 0`() {
        val result = MoreExamples.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fib n = 0 should return 1`() {
        val result = MoreExamples.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `empty string returns false`() {
        val result = MoreExamples.checkBraces("")
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect format (extra parenthesis) returns false`() {
        val result = MoreExamples.checkBraces("(a+b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect format )( returns false` () {
        val result = MoreExamples.checkBraces(")a+b(")
        assertThat(result).isFalse()
    }

    @Test
    fun `no braces returns true`() {
        val result = MoreExamples.checkBraces("a+b")
        assertThat(result).isTrue()
    }
}
