import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sun.org.mozilla.javascript.ast.Block;

public class EditeurDeTexte extends JFrame {
	public EditeurDeTexte() {
		setSize(500, 500);
		JPanel pane = new JPanel();
		JMenuBar menu = new JMenuBar();
		JMenu fichier = new JMenu("Fichier");
		fichier.add(new JMenuItem("Nouveau"));
		fichier.add(new JMenuItem("Ouvrir"));
		fichier.add(new JMenuItem("Enregistrer"));
		fichier.add(new JMenuItem("Enregistrer sous"));
		fichier.addSeparator();
		fichier.add(new JMenuItem("Mise en page"));
		fichier.add(new JMenuItem("Imprimer"));
		fichier.addSeparator();
		fichier.add(new JMenuItem("Quitter"));
		
		menu.add(fichier);
		JMenu edition = new JMenu("Edition");
		menu.add(edition);
		JMenu format = new JMenu("Format");
		menu.add(format);

		pane.setLayout(new BorderLayout());
		pane.add(menu, BorderLayout.WEST);
		
		
		setLayout(new BorderLayout());
		add(pane, BorderLayout.NORTH);
		
		JTextArea text = new JTextArea();
		text.setLineWrap(true);
		add(text, BorderLayout.CENTER);
		
		JPanel pane2 = new JPanel();
		pane2.setLayout(new FlowLayout(FlowLayout.LEFT,1,5));
		pane2.add(new JLabel("Rechercher :"));
		JTextField f =new JTextField();
		f.setPreferredSize(new Dimension(100,26));
		pane2.add(f);
		pane2.add(new JButton("<="));
		pane2.add(new JButton("=>"));
		pane2.add(new JButton("Tout surligner"));
		
		add(pane2, BorderLayout.SOUTH);
		
		setVisible(true);
		pane.repaint();
		setTitle("Editeur De Texte");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EditeurDeTexte();
			}
		});
	}
}
