package com.example.validationcleanarch.domain.use_case

import android.util.Patterns

class ValidatePassword {

    fun execute(password: String): ValidationResult {
        if(password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to be at least 8 characters"
            )
        }
        val containsLettersAndDigits = password.any { it.isDigit() } &&
                password.any { it.isLetter() }
        if(!containsLettersAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "Password needs at least one letter and digit"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}