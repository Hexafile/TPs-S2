import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JLabel;


public class InterfaceDeBase3 extends JDialog{
	public InterfaceDeBase3() {
		new InterfaceDeBase2();
		setPreferredSize(new Dimension(200, 200));
		setLocation(200, 200);
		pack();
		setTitle("JDialog");
		setModal(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new InterfaceDeBase3();
			}
		});
	}
}
