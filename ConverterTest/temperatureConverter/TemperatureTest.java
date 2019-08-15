package temperatureConverter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import temperatureConverter.Celsius;
import temperatureConverter.Converter;
import temperatureConverter.Fahrenheit;
import temperatureConverter.Temperature;

public class TemperatureTest {

	// Todo: Write code to make this test pass

	@Test

	public void testThatConvertingFromCelsiusToFahrenheitReturnsTheCorrectValue() {

		// Given I have 100 degrees Celsius and a temperature Converter

		Celsius celsiusUnit = new Celsius(100);

		Converter<Temperature> temperatureConverter = new Converter<Temperature>();

		// When I convert it to Fahrenheit

		Fahrenheit actual = (Fahrenheit) temperatureConverter.convertUnit(celsiusUnit, Fahrenheit.class);

		// Then the result should be 212 degrees Fahrenheit

		Fahrenheit expected = new Fahrenheit(212);

		assertEquals("Celsius to Fahrenheit conversion passed", expected, actual);

	}

	// Todo: Test the other temperature conversions
	
	@Test

	public void testThatConvertingFromCelsiusToKelvinReturnsTheCorrectValue() {

		Celsius celsiusUnit = new Celsius(100);

		Converter<Temperature> temperatureConverter = new Converter<Temperature>();

		Kelvin actual = (Kelvin) temperatureConverter.convertUnit(celsiusUnit, Kelvin.class);

		Kelvin expected = new Kelvin(373);

		assertEquals("Celsius to Kelvin conversion passed", expected, actual);

	}
	
	@Test

	public void testThatConvertingFromFahrenheitToCelsiusReturnsTheCorrectValue() {

		Fahrenheit fahrenheitUnit = new Fahrenheit(100);

		Converter<Temperature> temperatureConverter = new Converter<Temperature>();

		Celsius actual = (Celsius) temperatureConverter.convertUnit(fahrenheitUnit, Celsius.class);

		Celsius expected = new Celsius(38);

		assertEquals("Fahrenheit to Celsius conversion passed", expected, actual);

	}
	
	@Test

	public void testThatConvertingFromFahrenheitToKelvinReturnsTheCorrectValue() {

		Fahrenheit fahrenheitUnit = new Fahrenheit(100);

		Converter<Temperature> temperatureConverter = new Converter<Temperature>();

		Kelvin actual = (Kelvin) temperatureConverter.convertUnit(fahrenheitUnit, Kelvin.class);

		Kelvin expected = new Kelvin(311);

		assertEquals("Fahrenheit to Kelvin conversion passed", expected, actual);

	}
	
	@Test

	public void testThatConvertingFromKelvinToCelsiusReturnsTheCorrectValue() {

		Kelvin kelvinUnit = new Kelvin(100);

		Converter<Temperature> temperatureConverter = new Converter<Temperature>();

		Celsius actual = (Celsius) temperatureConverter.convertUnit(kelvinUnit, Celsius.class);

		Celsius expected = new Celsius(-173);

		assertEquals("Kelvin to Celsius conversion passed", expected, actual);

	}
	
	@Test

	public void testThatConvertingFromKelvinToFahrenheitReturnsTheCorrectValue() {

		Kelvin kelvinUnit = new Kelvin(100);

		Converter<Temperature> temperatureConverter = new Converter<Temperature>();

		Fahrenheit actual = (Fahrenheit) temperatureConverter.convertUnit(kelvinUnit, Fahrenheit.class);

		Fahrenheit expected = new Fahrenheit(-279);

		assertEquals("Kelvin to Fahrenheit conversion passed", expected, actual);

	}

}

	