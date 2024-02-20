package com.example.bodega

data class CalculatorState (
    val number1: String = "",
    val number2: String = "",
    val operation: CalculationOperation? = null
)