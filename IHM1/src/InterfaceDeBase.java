import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;


public class InterfaceDeBase extends JWindow{

	public InterfaceDeBase() {
	    setPreferredSize(new Dimension(200,200));
	    setLocation(200,200);
	    add(new JLabel("Hello World !"));
	    pack();
	    setVisible(true);
	  }

	  public static void main(String[] args) {
	      javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          new InterfaceDeBase();
	        }
	    });
	  }

	
}


