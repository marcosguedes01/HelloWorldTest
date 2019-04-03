package com.marcosguedes01.helloworldtest

import com.marcosguedes01.helloworldlib.HelloWorldLib
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun deveriaImprimirHelloWorld() {
        assertEquals(HelloWorldLib.print(), "Hello World!")
    }
}
