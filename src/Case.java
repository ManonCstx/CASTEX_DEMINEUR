import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Case extends JFrame {

	public Case() {
		JPanel container = new JPanel();
		setTitle("Démineur");
		this.setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(3, 3));
		container.add(new JButton("1"));
		container.add(new JButton("0"));
		container.add(new JButton("0"));
		container.add(new JButton("1"));
		container.add(new JButton("0"));
		container.add(new JButton("1"));
		container.add(new JButton("1"));
		container.add(new JButton("1"));
		container.add(new JButton("1"));
		setContentPane(container);
		setVisible(true);
	}

	public static void main(String[] args) {
		Case gl = new Case();
	}
}