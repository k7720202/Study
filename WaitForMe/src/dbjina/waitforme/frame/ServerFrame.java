package dbjina.waitforme.frame;

import javax.swing.JFrame;

import dbjina.waitforme.property.ServerFrameProperty;

public class ServerFrame extends JFrame{
	public ServerFrame() {
		init();
	}
	public void init() {
		setSize(ServerFrameProperty.WIDTH, ServerFrameProperty.HEIGHT);
		setTitle(ServerFrameProperty.TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
