package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;



public class CreateLead extends BaseClass{
@Test
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






