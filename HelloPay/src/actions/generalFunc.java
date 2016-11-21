package actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class generalFunc {
	public static class general{		  
		  public static String generatePhoneNumber(){
			  DateFormat dateFormat = new SimpleDateFormat("HHmmss");
			  Date date = new Date();
			  return "67" + dateFormat.format(date).toString();
		  }
		  
		  public static String generateEmail(){
			  DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			  Date date = new Date();
			  return "test_demo" + dateFormat.format(date).toString() + "@mailinator.com"; 
		  }
	}
}
