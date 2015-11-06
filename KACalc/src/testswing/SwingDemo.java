package testswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class SwingDemo {
	private JFrame mainFrame;
	private JLabel label1;
	private JPanel controlPanel;
	private JLabel statuslabel;
	
	public SwingDemo(){
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingDemo swingobj = new SwingDemo();
		swingobj.ShowEventDemo();
	
	}
	private void prepareGUI(){
		mainFrame = new JFrame("Swing Example Demo");
		mainFrame.setSize(300,300);
		mainFrame.setLayout(new GridLayout(3,3));
		label1 =new JLabel("",JLabel.CENTER);
		statuslabel = new JLabel("",JLabel.CENTER);
		statuslabel.setSize(100,200);
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent winEvent){
				System.exit(0);
			}
		});
		
		controlPanel=new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(label1);
		mainFrame.add(controlPanel);
		mainFrame.add(statuslabel);
		mainFrame.setVisible(true);
	}
		
		private void ShowEventDemo(){
			label1.setText("Main Header");
			
			JButton okbutton = new JButton("OK");
			JButton submitbutton = new JButton("Submit");
			JButton cancelbutton = new JButton("Cancel");
			
			okbutton.setActionCommand("OK");
			submitbutton.setActionCommand("Submit");
			cancelbutton.setActionCommand("cancel");
			
			okbutton.addActionListener(new ButtonClicklistener());
			submitbutton.addActionListener(new ButtonClicklistener());
			cancelbutton.addActionListener(new ButtonClicklistener());
			
			controlPanel.add(okbutton);
			controlPanel.add(submitbutton);
			controlPanel.add(cancelbutton);
			mainFrame.setVisible(true);
			
			
		}	
			private class ButtonClicklistener implements ActionListener{
				
					public void actionPerformed(ActionEvent e) {
					String command = e.getActionCommand();
					if(command.equals("OK")){
					    statuslabel.setText("Ok button clicked");
					}
					else if (command.equals("Submit")){
						statuslabel.setText("Submit button was clicked");
					}
					//else if (command.equals("cancel")){
					else {	
					statuslabel.setText("Cancel button was clicked");
					}
				}
				
			}
			
		
			
			
		
		
	
		
	

}
