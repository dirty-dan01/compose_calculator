package com.example.bodega

sealed class CalculationOperation(val symbol: String) {
    object Add: CalculationOperation("+")
    object Subtract: CalculationOperation("-")
    object Divide: CalculationOperation("/")
    object Multiply: CalculationOperation("*")

}