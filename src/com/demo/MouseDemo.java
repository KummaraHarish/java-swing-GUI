package com.demo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseDemo extends JFrame {
	public MouseDemo() {
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x= e.getX();
				int y = e.getY();
			System.out.println(x + " " + y);	
			}
		});
		
		setTitle("Mouse Demo");
		setLayout(new FlowLayout()); // Flowlayout grid layout
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MouseDemo md = new  MouseDemo();
		
	}

}
