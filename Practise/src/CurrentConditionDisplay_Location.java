import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import java.awt.Color;

public class CurrentConditionDisplay_Location extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label_Temp;
	JLabel label_Press;
	JLabel label_Mess;
	WeatherInfo_Model model;

	public CurrentConditionDisplay_Location() {

		model = new WeatherInfo_Model();

		getContentPane().setBackground(new Color(255, 250, 250));
		getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
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

		JLabel lblweatherReport = new JLabel("-:Weather Report:-");
		getContentPane().add(lblweatherReport, "2, 2");

		JLabel lblNewLabel = new JLabel("Temperature :");
		getContentPane().add(lblNewLabel, "2, 4");

		label_Temp = new JLabel(model.getTemperature() + "");
		getContentPane().add(label_Temp, "4, 4");

		JLabel lblNewLabel_1 = new JLabel("Pressure :");
		getContentPane().add(lblNewLabel_1, "2, 6");

		label_Press = new JLabel(model.getGetPressure() + "");
		getContentPane().add(label_Press, "4, 6");

		JLabel lblNewLabel_2 = new JLabel("Measurement :");
		getContentPane().add(lblNewLabel_2, "2, 8");

		label_Mess = new JLabel(model.getMeasurement() + "");
		getContentPane().add(label_Mess, "4, 8");

		setSize(156, 136);

	}

}
