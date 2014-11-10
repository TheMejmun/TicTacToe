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
	
	ImageIcon imageCross = new ImageIcon(getClass().getResource("cross.png"));
	ImageIcon imageCircle = new ImageIcon(getClass().getResource("circle.png"));
	ImageIcon imageCrossWon = new ImageIcon(getClass().getResource("crosswon.png"));
	ImageIcon imageCircleWon = new ImageIcon(getClass().getResource("circlewon.png"));
	ImageIcon imageBlank = new ImageIcon(getClass().getResource("blank.png"));
	
	JFrame frame = new JFrame();

	volatile boolean turn = true;
	volatile boolean won = false;

	int border = 14;

	public Main() {

		MouseAdapter mouseAdapter = new MouseAdapterMod();

		frame.setTitle("TicTacToe by Saman Miran");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(646, 692);

		JMenuBar menu = new JMenuBar();
		JMenu category = new JMenu("Menu");
		JMenuItem restart = new JMenuItem("Restart");
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Field1.setIcon(imageBlank);
				Field2.setIcon(imageBlank);
				Field3.setIcon(imageBlank);
				Field4.setIcon(imageBlank);
				Field5.setIcon(imageBlank);
				Field6.setIcon(imageBlank);
				Field7.setIcon(imageBlank);
				Field8.setIcon(imageBlank);
				Field9.setIcon(imageBlank);
				won = false;

			}
		});

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		category.add(restart);
		category.add(exit);
		menu.add(category);
		frame.setJMenuBar(menu);

		frame.setLayout(new BorderLayout());
		frame.setContentPane(new JLabel(new ImageIcon(getClass().getResource(
				"grid.png"))));
		frame.setLayout(new FlowLayout());
		
		// Just for refresh

		frame.invalidate();
		frame.validate();
		frame.repaint();

		Field1 = new JLabel(imageBlank);
		Field1.setBorder(new EmptyBorder(border, border, border, border));
		Field1.addMouseListener(mouseAdapter);
		frame.add(Field1);

		Field2 = new JLabel(imageBlank);
		Field2.setBorder(new EmptyBorder(border, border, border, border));
		Field2.addMouseListener(mouseAdapter);
		frame.add(Field2);

		Field3 = new JLabel(imageBlank);
		Field3.setBorder(new EmptyBorder(border, border, border, border));
		Field3.addMouseListener(mouseAdapter);
		frame.add(Field3);

		Field4 = new JLabel(imageBlank);
		Field4.setBorder(new EmptyBorder(border, border, border, border));
		Field4.addMouseListener(mouseAdapter);
		frame.add(Field4);

		Field5 = new JLabel(imageBlank);
		Field5.setBorder(new EmptyBorder(border, border, border, border));
		Field5.addMouseListener(mouseAdapter);
		frame.add(Field5);

		Field6 = new JLabel(imageBlank);
		Field6.setBorder(new EmptyBorder(border, border, border, border));
		Field6.addMouseListener(mouseAdapter);
		frame.add(Field6);

		Field7 = new JLabel(imageBlank);
		Field7.setBorder(new EmptyBorder(border, border, border, border));
		Field7.addMouseListener(mouseAdapter);
		frame.add(Field7);

		Field8 = new JLabel(imageBlank);
		Field8.setBorder(new EmptyBorder(border, border, border, border));
		Field8.addMouseListener(mouseAdapter);
		frame.add(Field8);

		Field9 = new JLabel(imageBlank);
		Field9.setBorder(new EmptyBorder(border, border, border, border));
		Field9.addMouseListener(mouseAdapter);
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

			if (clicked.getIcon() == imageBlank && !won) {

				if (turn) {
					clicked.setIcon(imageCross);
				} else {
					clicked.setIcon(imageCircle);
				}

				// winning

				if (Field1.getIcon() == Field2.getIcon()
						&& Field1.getIcon() == Field3.getIcon()
						&& Field1.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field4.getIcon() == Field5.getIcon()
						&& Field4.getIcon() == Field6.getIcon()
						&& Field4.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field7.getIcon() == Field8.getIcon()
						&& Field7.getIcon() == Field9.getIcon()
						&& Field7.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field1.getIcon() == Field4.getIcon()
						&& Field1.getIcon() == Field7.getIcon()
						&& Field1.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field2.getIcon() == Field5.getIcon()
						&& Field2.getIcon() == Field8.getIcon()
						&& Field2.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field3.getIcon() == Field6.getIcon()
						&& Field3.getIcon() == Field9.getIcon()
						&& Field3.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field1.getIcon() == Field5.getIcon()
						&& Field1.getIcon() == Field9.getIcon()
						&& Field1.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				} else if (Field3.getIcon() == Field5.getIcon()
						&& Field3.getIcon() == Field7.getIcon()
						&& Field3.getIcon() != imageBlank) {

					if (turn) {
						clicked.setIcon(imageCrossWon);
					} else {
						clicked.setIcon(imageCircleWon);
					}
					won = true;

				}
				turn = !turn;
			}
		}
	}
}
