package hw.hw6;


import javax.swing.*;

public class FrameInput implements WeatherInput {
	private WeatherMgr mgr;
	private ComponentStyler cs;

	public FrameInput(WeatherMgr mgr, ComponentStyler cs) {
		this.mgr = mgr;
		this.cs = cs;
	}

	public void run() {
		new CmdFrame(mgr, cs);
	}
}

@SuppressWarnings("serial")
class CmdFrame extends JFrame {
	private ComponentStyler cs;
	public CmdFrame(WeatherMgr mgr, ComponentStyler cs) {
		super("Manage Weather Input");
		this.cs = cs;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(new CmdPanel(mgr));
		pack();
		setVisible(true);
	}

	class CmdPanel extends JPanel {
		public JTextField city = cs.createTextField(8);
		public JTextField temp = cs.createTextField(8);
		public JTextField humidity = cs.createTextField(8);
		public JTextField pressure = cs.createTextField(8);
		public JButton btn = cs.createButton("NEW MEASUREMENT");

		public CmdPanel(WeatherMgr mgr) {
			//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			JPanel p1 = new JPanel();
			p1.add(cs.createLabel("City:"));
			p1.add(city);
			JPanel p2 = new JPanel();
			p2.add(cs.createLabel("Temp:"));
			p2.add(temp);
			JPanel p3 = new JPanel();
			p3.add(cs.createLabel("Pressure:"));
			p3.add(pressure);
			JPanel p4 = new JPanel();
			p4.add(cs.createLabel("Humidity:"));
			p4.add(humidity);
			JPanel p5 = new JPanel();
			p5.add(btn);
			add(p1); add(p2); add(p3); add(p4); add(p5);
			

			btn.addActionListener((evt) -> {
				float stemp  = Float.parseFloat(temp.getText());
				float shumid = Float.parseFloat(humidity.getText());
				float spress = Float.parseFloat(pressure.getText());
				mgr.newMeasurement(city.getText(), stemp, shumid, spress);
			});			
		}
	}
}
