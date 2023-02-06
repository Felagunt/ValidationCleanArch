package com.example.validationcleanarch.domain.use_case

import android.util.Patterns

class ValidateTerms {

    fun execute(acceptedTerms: Boolean): ValidationResult {
        if(!acceptedTerms) {
            return ValidationResult(
                successful = false,
                errorMessage = "Needs accept the terms"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}