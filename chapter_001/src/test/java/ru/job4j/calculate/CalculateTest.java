package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
 @Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Dmitry Kuznetsov";
    String expect = "Echo, echo, echo : Dmitry Kuznetsov"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }
}