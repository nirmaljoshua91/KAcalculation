package kacalc;
import java.awt.*;
import java.math.BigDecimal;

import javax.swing.*;

public class KAcalcLogic {
	
	double shortCircuitCurrent=100;
	String busBarmaterial;
	double busmaterialvalue=8.5;
	Double bbCrossSection;
	double sqrtemp =1/120;
	
	public void crossecCalc(){
		bbCrossSection=(((shortCircuitCurrent*1000)/busmaterialvalue)*(0.091287092917528));
	 double temp =Math.sqrt(sqrtemp);
		System.out.println(temp);
		System.out.println("The Bus bar cross sectional value for copper is"+bbCrossSection);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
	        KAcalcLogic kaobj = new KAcalcLogic();
	        kaobj.crossecCalc();
	        
	        
	}

}
