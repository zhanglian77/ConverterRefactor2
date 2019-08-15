package temperatureConverter;

import java.util.Objects;

public class Temperature {

	int value;

	public Temperature(int v) {
		this.value = v;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Temperature) {
			Temperature t = (Temperature) obj;
			return value == t.value && getClass() == t.getClass();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
