import java.util.ArrayList;

public class WeaherInfo_Contoller {

	static ArrayList<WeatherInfo_Model> weatherStore;

	public WeaherInfo_Contoller() {
		weatherStore = new ArrayList<WeatherInfo_Model>();

	}

	public static void addObserver(WeatherInfo_Model ob) {
		weatherStore.add(ob);
	}

	public static void remove() {
		int length = (WeatherDate_View.loction.size() - 1);
		CurrentConditionDisplay_Location objec = WeatherDate_View.loction
				.get(length);
		WeatherDate_View.loction.remove(length);
		length--;
		objec.setVisible(false);

	}

	public static void notifying() {
		
		WeatherInfo_Model ob1 = new WeatherInfo_Model();
		
		
		
		int length = WeatherDate_View.loction.size();
		
		
		for (int i = 0; i < length; i++) {
			
			WeatherDate_View.loction.get(i).label_Temp.setText(ob1.getTemperature()+"");
			WeatherDate_View.loction.get(i).label_Mess.setText(ob1.getMeasurement()+"");
			WeatherDate_View.loction.get(i).label_Press.setText(ob1.getGetPressure()+"");
			
		
		
		}
		

	}

}
