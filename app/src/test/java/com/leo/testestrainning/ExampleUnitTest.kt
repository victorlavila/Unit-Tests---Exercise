package com.leo.testestrainning

import android.content.Context
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mock
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

private const val FAKE_STRING = "FAKE_STRING"

class ExampleUnitTest {

    @Mock
    private lateinit var mockContext: Context

    @Test
    fun readStringFromContext_LocalizationString() {
        // GIVEN
        val mockContext = mock<Context> {
            on { getString(R.string.hello_world) } doReturn "FAKE_STRING"
        }
        // WHEN
        val myObjectUnderTest = ContextWrapper(mockContext)
        // THEN
        val result: String  = myObjectUnderTest.getTitle()

        assertEquals(result, FAKE_STRING)
    }
}