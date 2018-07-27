package com.example.demo;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;




public class CiagFibonacciegoTest {

    private CiagFibonacciego ciagFibonacciego;

    @Before
    public void stworz() {
        ciagFibonacciego = new CiagFibonacciego();
    }

    @Test
    public void shouldReturn2For10() {
        //given
        int a = 10;

        //when
        int result = ciagFibonacciego.fibonacciCalculator(a);

        //then
        assertThat(result, is(2));
    }

    @Test
    public void shouldReturn10For20() {
        //given
        int a = 20;

        //when
        int result = ciagFibonacciego.fibonacciCalculator(a);

        //then
        assertThat(result, is(10));
    }


}