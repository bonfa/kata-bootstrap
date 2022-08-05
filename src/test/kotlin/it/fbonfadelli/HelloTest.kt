package it.fbonfadelli

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloTest {

    @Test
    internal fun test() {
        val sayHello = Hello().sayHello("World")

        assertThat(sayHello).isEqualTo("Hello World!")
    }

}