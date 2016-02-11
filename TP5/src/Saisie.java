import javax.swing.*;

public class Saisie {
	public static void main(String[] args) {

		JOptionPane pane = new JOptionPane();
		if (args[0].matches(".*\\d.*") && args[1].matches(".*\\d.*")) {
			int min = Integer.parseInt(args[0]);
			int max = Integer.parseInt(args[1]);
			int i = 0;
			boolean incorrect = false;

			while (i < min || i > max) {
				String s = pane.showInputDialog("Entrez un entier entre " + min
						+ " et " + max);
				if (s.matches(".*\\d.*")) {
					i = Integer.parseInt(s);
				} else {
					pane.showMessageDialog(pane, "Paramètres invalides");
					incorrect = true;
				}
				if ((i < min || i > max) && !incorrect) {
					pane.showMessageDialog(pane, "Paramètres invalides");
				}
				incorrect = false;
			}
			pane.showMessageDialog(pane, "Vous avez choisi : " + i);
		}
	}
}
