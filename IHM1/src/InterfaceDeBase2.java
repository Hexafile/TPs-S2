import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterfaceDeBase2 extends JFrame{
	public InterfaceDeBase2() {
		setPreferredSize(new Dimension(200, 200));
		setLocation(200, 200);
		add(new JLabel("Hello World !"));
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new InterfaceDeBase2();
			}
		});
	}

}
