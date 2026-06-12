package com.example.handson;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
@Test
public void testAddIntegerValues() {
Calculator calc = new Calculator();
assertEquals(5.0, calc.add(2.0, 3.0));
}
@Test
