package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test class Calculator.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    
    /**
     * Test whenAddOnePlusOneThenTwo.
     */ @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
    /**
     * Test whenSubtractOneFromOneThenZero.
     */ @Test
    public void whenSubtractOneFromOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
	
    /**
     * Test whenDivOneToOneThenThree.
     */ @Test
    public void whenDivOneToOneThenThree() {
        Calculator calc = new Calculator();
        calc.div(6D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
	}
	
    /**
     * Test whenMultipleOneOnOneThenTwelve.
     */ @Test
    public void whenMultipleOneOnOneThenTwelve() {
        Calculator calc = new Calculator();
        calc.multiple(6D, 2D);
        double result = calc.getResult();
        double expected = 12D;
        assertThat(result, is(expected));
	}
}