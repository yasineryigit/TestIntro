package com.ossovita.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax:Tax; //in java: private Tax tax;

    @Before
    fun setup(){
        tax = Tax()
    }

    @After
    fun teardown(){

    }

    @Test
    fun calculateTaxTest(){
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest(){
        val income = tax.calculateIncome(1000.0,0.7)
        assertThat(income).isEqualTo(300)
    }
}