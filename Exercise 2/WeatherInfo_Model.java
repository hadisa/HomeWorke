package h;

import java.util.Observable;

public class WeatherInfo_Model extends Observable{

	private int temperature;
	private int getPressure;
	private int measurement;

	public WeatherInfo_Model() {
		setGetPressure(WeatherDate_View.sliderMess.getValue());
		setTemperature(WeatherDate_View.sliderTemp.getValue());
		setMeasurement(WeatherDate_View.sliderPress.getValue());
		
		setChanged();
		notifyObservers();

	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getGetPressure() {
		return getPressure;
	}

	public void setGetPressure(int getPressure) {
		this.getPressure = getPressure;
	}

	public int getMeasurement() {
		return measurement;
	}

	public void setMeasurement(int measurement) {

		this.measurement = measurement;
	}

}
