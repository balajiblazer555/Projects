package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethod {

	    @Test(dataProvider="fetchData")
	    public void runDuplicateLead(String phno) throws InterruptedException {
	
	    System.out.println("Running DuplicateLead");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
}
	    @BeforeTest
		public void setFile(){
			filename="CreateLeadxl";
			sheetno=1;
		}
}