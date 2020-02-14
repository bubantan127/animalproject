package com.vuvanthanh.fbonus;

import java.util.Locale;
import java.util.ResourceBundle;

public class Solution {
	
	public static void main(String args[]){
		
		Locale localeEn = new Locale("en");
	    ResourceBundle labels = ResourceBundle.getBundle("messages", localeEn);
	    System.out.println(labels.getString("sound"));
	    
	    Locale localeVi = new Locale("vi");
	    labels = ResourceBundle.getBundle("messages", localeVi);
	    System.out.println(labels.getString("sound"));
	}

}
