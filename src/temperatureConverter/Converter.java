package temperatureConverter;

public class Converter<Temperature> {

	public Temperature convertUnit(Object c, Class<?> f) {

		if (f.getCanonicalName().equals("temperatureConverter.Fahrenheit")) {

			Fahrenheit result = new Fahrenheit(Converter.convertBase(c));

			return (Temperature) result;
		}
		
		else if(f.getCanonicalName().equals("temperatureConverter.Kelvin")) {
			
			Kelvin result = new Kelvin(Converter.convertBase(c));
			
			return(Temperature) result;			
		}
		
		else if(f.getCanonicalName().equals("temperatureConverter.Celsius")) {
			
			Celsius result = new Celsius(Converter.convertBase(c));
			
			return(Temperature) result;			
		}

		return null;
	}

	public static Celsius convertBase(Object c) {

		if (c.getClass().getName().equals("temperatureConverter.Celsius")) {

			Celsius base = new Celsius((Celsius) c);

			return base;
		}

		else if (c.getClass().getName().equals("temperatureConverter.Fahrenheit")) {

			Celsius base = new Celsius((Fahrenheit) c);

			return base;
		}

		else if (c.getClass().getName().equals("temperatureConverter.Kelvin")) {

			Celsius base = new Celsius((Kelvin) c);

			return base;
		}

		return null;
	}
}
