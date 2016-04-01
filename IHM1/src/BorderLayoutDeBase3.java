import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDeBase3 extends JFrame {

	public BorderLayoutDeBase3() {
		setSize(500, 500);
		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout(4,4));
		pane.add(new JButton("JButton1"));
		pane.add(new JButton("JButton2"));
		pane.add(new JButton("JButton3"));
		pane.add(new JButton("JButton4"));
		pane.add(new JButton("JButton5"));
		pane.add(new JButton("JButton6"));
		pane.add(new JButton("JButton7"));
		pane.add(new JButton("JButton8"));
		pane.add(new JButton("JButton9"));
		pane.add(new JButton("JButton10"));
		pane.add(new JButton("JButton11"));
		pane.add(new JButton("JButton12"));
		pane.add(new JButton("JButton13"));
		pane.add(new JButton("JButton14"));
		pane.add(new JButton("JButton15"));
		pane.add(new JButton("JButton16"));
		add(pane);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BorderLayoutDeBase3();
			}
		});
	}

}
