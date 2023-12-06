package com.demo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {

	public static void main(String[] args) {
		Gui obj = new Gui();
		
	}

}

class Gui extends JFrame { //cardLayout
	public Gui() {
		
		
		JLabel jl= new JLabel("Hello World");
		JLabel jl2 = new JLabel("Welcome Harish");
		JLabel jl3 = new JLabel("how are you");
		
		add(jl);
		add(jl2);
		add(jl3);
		
		setLayout(new FlowLayout()); //Flowlayout grid layout
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
