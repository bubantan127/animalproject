package com.vuvanthanh.fbonus;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;
import junit.framework.Assert;

public class BonusTest {

	@Test
	public void testEn(){
		
		Locale localeEn = new Locale("en");
	    ResourceBundle labels = ResourceBundle.getBundle("messages", localeEn);
	    Assert.assertEquals("Cock-a-doodle-doo", labels.getString("sound"));	    
	    
	}
	
	@Test
	public void testVi(){
		
		Locale localeEn = new Locale("vi");
	    ResourceBundle labels = ResourceBundle.getBundle("messages", localeEn);
	    Assert.assertEquals("O-o-oooooooooooo", labels.getString("sound"));	    
	    
	}
	
	
}
