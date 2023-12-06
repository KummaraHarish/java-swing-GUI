package com.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButton extends JFrame {

	JTextField t1;
	JButton b;
	JRadioButton r1, r2;
	JLabel l;
	JCheckBox c1, c2, c3;

	public RadioButton() {
		t1 = new JTextField(15);
		b = new JButton("ok");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		l = new JLabel("Greeting");
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("playing");
		c3 = new JCheckBox("Eating");

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		add(t1);
		add(c1);
		add(c2);
		add(c3);
		add(r1);
		add(r2);
		add(b);
		add(l);

		c1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Dancer");

			}
		});

		c2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Player");

			}
		});
		c3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Eater");

			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();

				if (r1.isSelected()) {
					name = "Mr." + name;
				} else {
					name = "Ms." + name;
				}
				if (c1.isSelected()) {
					name = name + " Dancer";
				}
				if (c2.isSelected()) {
					name = name + " player";
				}
				if (c3.isSelected()) {
					name = name + " eater";
				}
				l.setText(name);

			}
		});

		setTitle("find gender");
		setLayout(new FlowLayout()); // Flowlayout grid layout
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		RadioButton rb = new RadioButton();

	}

}
