package net.mejmun.tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 2811L;

	public static void main(String[] args) {
		new Main();
	}

	JLabel Field1, Field2, Field3, Field4, Field5, Field6, Field7, Field8,
			Field9;
	ImageIcon i1 = new ImageIcon(getClass().getResource("cross.png"));
	ImageIcon i2 = new ImageIcon(getClass().getResource("circle.png"));
	ImageIcon i3 = new ImageIcon(getClass().getResource("blank.png"));
	ImageIcon i4 = new ImageIcon(getClass().getResource("crosswon.png"));
	ImageIcon i5 = new ImageIcon(getClass().getResource("circlewon.png"));
	JFrame frame = new JFrame();

	volatile boolean turn = true;
	volatile boolean won = false;

	int b = 14;

	public Main() {

		MouseAdapter MA = new MouseAdapterMod();

		frame.setTitle("TicTacToe by Saman Miran");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);

		JMenuBar menu = new JMenuBar();
		JMenu cat = new JMenu("Menu");
		JMenuItem restart = new JMenuItem("Restart");
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Field1.setIcon(i3);
				Field2.setIcon(i3);
				Field3.setIcon(i3);
				Field4.setIcon(i3);
				Field5.setIcon(i3);
				Field6.setIcon(i3);
				Field7.setIcon(i3);
				Field8.setIcon(i3);
				Field9.setIcon(i3);
				won = false;

			}
		});

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		cat.add(restart);
		cat.add(exit);
		menu.add(cat);
		frame.setJMenuBar(menu);

		frame.setLayout(new BorderLayout());
		frame.setContentPane(new JLabel(new ImageIcon(getClass().getResource(
				"grid.png"))));
		frame.setLayout(new FlowLayout());
		// Just for refresh
		frame.setSize(645, 691);
		frame.setSize(646, 692);

		Field1 = new JLabel(i3);
		Field1.setBorder(new EmptyBorder(b, b, b, b));
		Field1.addMouseListener(MA);
		frame.add(Field1);

		Field2 = new JLabel(i3);
		Field2.setBorder(new EmptyBorder(b, b, b, b));
		Field2.addMouseListener(MA);
		frame.add(Field2);

		Field3 = new JLabel(i3);
		Field3.setBorder(new EmptyBorder(b, b, b, b));
		Field3.addMouseListener(MA);
		frame.add(Field3);

		Field4 = new JLabel(i3);
		Field4.setBorder(new EmptyBorder(b, b, b, b));
		Field4.addMouseListener(MA);
		frame.add(Field4);

		Field5 = new JLabel(i3);
		Field5.setBorder(new EmptyBorder(b, b, b, b));
		Field5.addMouseListener(MA);
		frame.add(Field5);

		Field6 = new JLabel(i3);
		Field6.setBorder(new EmptyBorder(b, b, b, b));
		Field6.addMouseListener(MA);
		frame.add(Field6);

		Field7 = new JLabel(i3);
		Field7.setBorder(new EmptyBorder(b, b, b, b));
		Field7.addMouseListener(MA);
		frame.add(Field7);

		Field8 = new JLabel(i3);
		Field8.setBorder(new EmptyBorder(b, b, b, b));
		Field8.addMouseListener(MA);
		frame.add(Field8);

		Field9 = new JLabel(i3);
		Field9.setBorder(new EmptyBorder(b, b, b, b));
		Field9.addMouseListener(MA);
		frame.add(Field9);

		ImageIcon image = new ImageIcon(getClass().getResource("cross.png"));
		frame.setIconImage(image.getImage());

		frame.setVisible(true);

		System.out.println(frame.getContentPane().getWidth() + " , "
				+ frame.getContentPane().getHeight());
	}

	public class MouseAdapterMod extends MouseAdapter {

		public void mousePressed(MouseEvent e) {

			JLabel clicked = (JLabel) e.getSource();

			if (clicked.getIcon() == i3 && !won) {

				if (turn) {
					clicked.setIcon(i1);
				} else {
					clicked.setIcon(i2);
				}

				// winning

				if (Field1.getIcon() == Field2.getIcon()
						&& Field1.getIcon() == Field3.getIcon()
						&& Field1.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field4.getIcon() == Field5.getIcon()
						&& Field4.getIcon() == Field6.getIcon()
						&& Field4.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field7.getIcon() == Field8.getIcon()
						&& Field7.getIcon() == Field9.getIcon()
						&& Field7.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field1.getIcon() == Field4.getIcon()
						&& Field1.getIcon() == Field7.getIcon()
						&& Field1.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field2.getIcon() == Field5.getIcon()
						&& Field2.getIcon() == Field8.getIcon()
						&& Field2.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field3.getIcon() == Field6.getIcon()
						&& Field3.getIcon() == Field9.getIcon()
						&& Field3.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field1.getIcon() == Field5.getIcon()
						&& Field1.getIcon() == Field9.getIcon()
						&& Field1.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				} else if (Field3.getIcon() == Field5.getIcon()
						&& Field3.getIcon() == Field7.getIcon()
						&& Field3.getIcon() != i3) {

					if (turn) {
						clicked.setIcon(i4);
					} else {
						clicked.setIcon(i5);
					}
					won = true;

				}
				turn = !turn;
			}
		}
	}
}
