package model;

public class TempConverter {
	private double fTemp;
	private double cTemp;
	public TempConverter() {
		super();
	}
	public TempConverter(double fTemp) {
		super();
		this.fTemp = fTemp;
		setcTemp(fTemp);
	}
	public TempConverter(double cTemp, double fTemp) {
		super();
		this.cTemp = cTemp;
		setfTemp(cTemp);
	}

	public double getfTemp() {
		return fTemp;
	}
	public void setfTemp(double fTemp) {
		this.fTemp = (cTemp*1.8) + 32;
	}
	public double getcTemp() {
		return cTemp;
	}
	public void setcTemp(double cTemp) {
		this.cTemp = (fTemp - 32) * 0.5556;
	}
	@Override
	public String toString() {
	return this.fTemp + " degrees Fahrenheit is equal to " + this.cTemp + " degrees Celsius.";
	}
}
