package temperatureConverter;

public class Celsius extends Temperature {

	public Celsius(int v) {
		super(v);
	}
	
	public Celsius(Celsius c) {
		super(c.value);
	}
	
	public Celsius(Fahrenheit f) {
		super((int) Math.round((f.value - 32) / 1.8));		
	}
	
	public Celsius(Kelvin k) {
		super((int) Math.round(k.value - 273.15));
	}
}
