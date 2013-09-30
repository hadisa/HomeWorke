package h;

public class Main_Run {

	/**
	 * @param args
	 * @author :norozi
	 */
	public static void main(String[] args) {
		WeatherDate_View ob=new WeatherDate_View();
		WeatherInfo_Model sub=new WeatherInfo_Model();
		CurrentConditionDisplay_Location obs=new CurrentConditionDisplay_Location();
		sub.addObserver(obs);
		ob.setVisible(true);

	}

}
