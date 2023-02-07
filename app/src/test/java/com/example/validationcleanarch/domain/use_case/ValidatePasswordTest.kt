package com.example.validationcleanarch.domain.use_case

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @Test
    fun `Password is letters-only, returns error`() {
        val result = validatePassword.execute("ajfhsndk")

        assertEquals(result.successful, false)
    }
}