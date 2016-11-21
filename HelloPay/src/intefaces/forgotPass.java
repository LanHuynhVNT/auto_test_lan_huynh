package intefaces;

import org.openqa.selenium.By;

public class forgotPass {
	public static class Form{
		public static By txt_Email = By.id("uid");
		public static By btn_Reset = By.id("login");
		public static By lbl_Message = By.xpath("//div[@id='forgetPasswordFormWrapper']/div");
	}
}
