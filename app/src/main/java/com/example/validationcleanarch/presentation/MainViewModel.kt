package com.example.validationcleanarch.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.validationcleanarch.domain.use_case.ValidateEmail
import com.example.validationcleanarch.domain.use_case.ValidatePassword
import com.example.validationcleanarch.domain.use_case.ValidateRepeatedPassword
import com.example.validationcleanarch.domain.use_case.ValidateTerms

class MainViewModel(
    private val validateEmail: ValidateEmail = ValidateEmail(),
    private val validatePassword: ValidatePassword = ValidatePassword(),
    private val validateRepeatedPassword: ValidateRepeatedPassword = ValidateRepeatedPassword(),
    private val validateTerms: ValidateTerms = ValidateTerms()
): ViewModel() {

    var state by mutableStateOf(RegistrationFormState())


}