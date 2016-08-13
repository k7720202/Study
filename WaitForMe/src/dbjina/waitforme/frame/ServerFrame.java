package dbjina.waitforme.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import dbjina.waitforme.property.ServerFrameProperty;

public class ServerFrame extends JFrame{
	JPanel stuPanel;
	JButton stuButton;
	
	public ServerFrame() {
		init();
	}
	public void init() {
		setSize(ServerFrameProperty.WIDTH, ServerFrameProperty.HEIGHT);
		setTitle(ServerFrameProperty.TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		stuPanel = new JPanel();
		stuPanel.setLayout(new GridLayout(5, 5));
		
		stuButton = new JButton("Test");
		stuPanel.add(stuButton);
		
		add(stuPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
}
