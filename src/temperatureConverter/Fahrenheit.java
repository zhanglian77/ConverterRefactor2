package temperatureConverter;

public class Fahrenheit extends Temperature {

	public Fahrenheit(int v) {
		super(v);
	}
	
	public Fahrenheit(Celsius c) {		

		super((int) Math.round(c.value * 1.8 + 32));
		
	}

}
