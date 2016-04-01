import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BorderLayoutDeBase extends JFrame{
	
	public BorderLayoutDeBase() {
		setSize(500,500);
		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout());
		pane.add(new JButton("North"),BorderLayout.NORTH);
		pane.add(new JButton("West"),BorderLayout.WEST);
		pane.add(new JButton("Easr"),BorderLayout.EAST);
		pane.add(new JButton("South"),BorderLayout.SOUTH);
		pane.add(new JButton("Center"),BorderLayout.CENTER);
		add(pane);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BorderLayoutDeBase();
			}
		});
	}
	
}
