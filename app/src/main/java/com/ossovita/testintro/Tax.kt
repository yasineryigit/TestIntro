package com.ossovita.testintro

import java.util.function.DoubleBinaryOperator

class Tax {

    //TDD - Test Driven Development
    //Test-Development-Test-Development

    fun calculateTax(grossIncome: Double, taxRate:Double):Double{
        return grossIncome*taxRate
    }

    fun calculateIncome(grossIncome: Double,taxRate: Double):Double{
        return grossIncome-(grossIncome*taxRate)
    }



}