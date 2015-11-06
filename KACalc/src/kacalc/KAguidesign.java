package kacalc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import org.omg.CORBA.PRIVATE_MEMBER;

public class KAguidesign {
	
	 JFrame mainframe;
	 JLabel mainlabel;
	 JLabel label1;
	 JLabel label2;
	 JLabel label3;
	 JTextField text1;
	 JTextField text2;
	 JTextPane textpane;
	 JPanel controlpanel;
	 JPanel controlpane2;
	 JPanel controlpane3;
	 JButton submitButton;
	 JButton resetButton;
	 
	 public double shortCircuitCurrent;
		String busBarmaterial;
		double busmaterialvalue;
		Double bbCrossSection;
		
	 
	 public static void main(String[]args){
		 KAguidesign obj1 = new KAguidesign();
		 obj1.gui();
		 obj1.calcprocess();
	 }
	 
	 
	 private void gui(){
		 
		mainframe =new JFrame("KA Calculation");
		mainframe.setForeground(Color.blue);
		//mainframe.setResizable(true);
		mainframe.setSize(500, 500);
		mainframe.setLayout(new GridLayout(4,1));
		//mainframe.setVisible(true);
		
		
		mainlabel = new JLabel("BUS BAR CALCULATION FOR SHORT CIRCUIT WITHSTAND CAPACITY OF BUSBARS",JLabel.CENTER);
		//mainlabel.setVisible(true);
		mainlabel.setSize(500,100);
		mainlabel.setForeground(Color.RED);
		mainframe.add(mainlabel);
		
		
		controlpanel= new JPanel(new GridLayout(2,2));
		label1= new JLabel("Short Circuit Current",JLabel.CENTER);
		label2= new JLabel("Bus bar Material",JLabel.CENTER);
		text1=new JTextField("Enter the Short Circuit Current value",10);
		text2=new JTextField("Enter the Bus Bar Material",10);
		text1.setSize(1000,5);
		label1.setForeground(Color.BLUE);
		label2.setForeground(Color.BLUE);
		text2.setSize(10,5);
		controlpanel.add(label1);
		controlpanel.add(text1);
		controlpanel.add(label2);
		controlpanel.add(text2);
		//Control panel1 ended
		controlpane2= new JPanel(new FlowLayout());
		submitButton= new JButton("Submit");
		resetButton=new JButton("Reset");
		controlpane2.add(submitButton);
		controlpane2.add(resetButton);
		//Control panel2 ended
		controlpane3= new JPanel(new FlowLayout());
		label3= new JLabel("",JLabel.CENTER);
		label3.setForeground(Color.red);
		controlpane3.add(label3);
	    
		//controlpane3.add(label3);
		//Control panel3 ended
		
		
		
		mainframe.add(controlpanel);
		mainframe.add(controlpane2);
		mainframe.add(controlpane3);
		mainframe.setVisible(true);
		//controlpanel.setVisible(true);
		//controlpane2.setVisible(true);
		
		
	 }
	 
	private void calcprocess(){
	   
		submitButton.addActionListener(new ClickButtonlistener());
		resetButton.addActionListener(new ClickButtonlistener2());
		
		
	}
		class ClickButtonlistener implements ActionListener{

			
			public void actionPerformed(ActionEvent e) {
				
				shortCircuitCurrent= Double.parseDouble(text1.getText());
				busBarmaterial =text2.getText();
		
				if (busBarmaterial.equalsIgnoreCase("Copper")){
					busmaterialvalue=13;
				}
				else if (busBarmaterial.equalsIgnoreCase("Aluminium")){
					busmaterialvalue=8.5;
				}
				else if (busBarmaterial.equalsIgnoreCase("Iron")){
					busmaterialvalue=4.5;
				}
				else if (busBarmaterial.equalsIgnoreCase("lead")){
					busmaterialvalue=2.5;
					
				}
				bbCrossSection=(((shortCircuitCurrent*1000)/busmaterialvalue)*(0.091287092917528));
				System.out.println(bbCrossSection);
				label3.setText("Bus bar cross section value is "+bbCrossSection+" sq mm");
				
				
			}
		}
			
			class ClickButtonlistener2 implements ActionListener{

				
				public void actionPerformed(ActionEvent e) {
					
					text1.setText("");
					text2.setText("");
					label3.setText("Please Enter the values above and click submit button");
					
				}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	 
	 
	 
	 

}
