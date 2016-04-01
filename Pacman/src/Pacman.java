import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Pacman extends JFrame {
	private int x;
	private int y;
	private int direction = 0;
	private boolean enter = false;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private void incremente() {
		if (direction == 0) {
			x++;
		} else if (direction == 3) {
			y++;
		} else if (direction == 2) {
			x--;
		} else {
			y--;
		}

	}

	public Pacman() {
		setSize(500, 500);
		JComponent c = new JComponent() {
			public void paint(Graphics g2) {
				int tmp = (x + y) / 4 % 9;
				Graphics2D g = (Graphics2D) g2;
				g.setBackground(Color.BLACK);
				g.clearRect(0, 0, 500, 500);
				g.setColor(Color.YELLOW);
				if (x > 460) {
					g.fillArc(x - 500, y, 40, 40,
							direction * 90 + 45 - tmp * 5, 270 + tmp * 10);
					if (x == 500)
						x = 0;
				}if (x < 0) {
					g.fillArc(x + 500, y, 40, 40,
							direction * 90 + 45 - tmp * 5, 270 + tmp * 10);
					if (x < -40)
						x = 459;
				}
				if (y > 460) {
					g.fillArc(x, y - 500, 40, 40,
							direction * 90 + 45 - tmp * 5, 270 + tmp * 10);
					if (y == 500)
						y = 0;
				}if (y < 0) {
					g.fillArc(x, y + 500, 40, 40,
							direction * 90 + 45 - tmp * 5, 270 + tmp * 10);
					if (y < -40)
						y = 459;
				}
				g.fillArc(x, y, 40, 40, direction * 90 + 45 - tmp * 5,
						270 + tmp * 10);

			}
		};

		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_UP) {
					direction = 1;
				} else if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
					direction = 3;
				} else if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
					direction = 2;
				} else if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
					direction = 0;
				}
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					enter = true;
				}
			}
		});
		add(c);
		this.setBackground(Color.BLACK);
		c.setSize(500, 500);
		setTitle("Pacman");
		setVisible(true);
	}

	public static void main(String[] args) {
		Pacman p = new Pacman();
		p.repaint();
		while (true) {
			p.incremente();
			p.repaint();

			try {
				Thread.sleep(10l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}