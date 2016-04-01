import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PositionnementAbsolu extends JFrame {
	public PositionnementAbsolu() {
		setSize(500, 500);
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.add(new JButton("JButton1")).setBounds(new Rectangle(0,0,50,50));
		pane.add(new JButton("JButton2")).setBounds(new Rectangle(50,50,50,50));
		pane.add(new JButton("JButton3")).setBounds(new Rectangle(100,100,50,50));
		pane.add(new JButton("JButton4")).setBounds(new Rectangle(150,150,50,50));
		add(pane);
		setVisible(true);
		pane.repaint();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PositionnementAbsolu();
			}
		});
	}

}
