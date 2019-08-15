package temperatureConverter;

public class Kelvin extends Temperature {

	public Kelvin(int v) {
		super(v);
	}
	
	public Kelvin(Celsius c) {
		super((int) Math.round(c.value + 273.15));
	}
}
