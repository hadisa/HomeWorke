package h;
import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WeatherDate_View extends JFrame{

	static ArrayList<CurrentConditionDisplay_Location> loction;
	static JSlider sliderTemp;
	static JSlider sliderPress;
	static JSlider sliderMess;

	public WeatherDate_View() {
		loction = new ArrayList<CurrentConditionDisplay_Location>();
		getContentPane().setBackground(SystemColor.controlLtHighlight);
		getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblWeatherInfo = new JLabel("Weather Info");
		lblWeatherInfo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblWeatherInfo, "4, 2");

		JLabel lblNewLabel = new JLabel("Temperature :");
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		getContentPane().add(lblNewLabel, "2, 4");

		sliderTemp = new JSlider();
		sliderTemp.setSnapToTicks(true);
		sliderTemp.setPaintLabels(true);
		sliderTemp.setBackground(new Color(230, 230, 250));
		sliderTemp.setBorder(new EmptyBorder(0, 0, 0, 0));
		sliderTemp.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				WeatherInfo_Model ob = new WeatherInfo_Model();

				ob.setTemperature(sliderTemp.getValue());

				WeaherInfo_Contoller.notifying();

			}
		});
		getContentPane().add(sliderTemp, "4, 4");

		JButton btnAddObserver = new JButton("Add Observer");
		btnAddObserver.setBackground(new Color(230, 230, 250));
		btnAddObserver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				display();

			}
		});
		getContentPane().add(btnAddObserver, "8, 4");

		JLabel lblNewLabel_1 = new JLabel("Pressure :");
		getContentPane().add(lblNewLabel_1, "2, 6");

		sliderPress = new JSlider();
		sliderPress.setBorder(new EmptyBorder(0, 0, 0, 0));
		sliderPress.setSnapToTicks(true);
		sliderPress.setPaintLabels(true);
		sliderPress.setBackground(new Color(230, 230, 250));
		sliderPress.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				WeatherInfo_Model ob = new WeatherInfo_Model();

				ob.setGetPressure(sliderPress.getValue());

				WeaherInfo_Contoller.notifying();

			}
		});
		getContentPane().add(sliderPress, "4, 6");

		JButton btnRemove = new JButton("Remove");
		btnRemove.setBackground(new Color(230, 230, 250));
		btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				WeaherInfo_Contoller.remove();

			}
		});
		getContentPane().add(btnRemove, "8, 6");

		JLabel lblMeasurement = new JLabel("measurement :");
		getContentPane().add(lblMeasurement, "2, 8");

		sliderMess = new JSlider();
		sliderMess.setBorder(new EmptyBorder(0, 0, 0, 0));
		sliderMess.setSnapToTicks(true);
		sliderMess.setPaintLabels(true);
		sliderMess.setBackground(new Color(230, 230, 250));
		sliderMess.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				WeatherInfo_Model ob = new WeatherInfo_Model();

				ob.setMeasurement(sliderMess.getValue());

				WeaherInfo_Contoller.notifying();

			}
		});
		getContentPane().add(sliderMess, "4, 8");

		setSize(450, 161);
	}

	
	
	
	public void display() {
		CurrentConditionDisplay_Location ob = new CurrentConditionDisplay_Location();
		ob.setVisible(true);
		loction.add(ob);

	}

}
