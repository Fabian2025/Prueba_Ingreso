package com.choucair.prueba;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fabia\\OneDrive - ucentral.edu.co\\Documentos\\javavirtual\\eclipseNeon\\Choucairprueba\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver;
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshota.png"));
		Thread.sleep(5);
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();;
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("cabrejoariasfabian@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Fa90112551025#");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile1, new File("c:\\tmp\\screenshotb.png"));
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(500);
		driver.findElement(By.id("header_logo")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]")).click();
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile2, new File("c:\\tmp\\screenshotc.png"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.linkText("Blouse"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(1000);
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile3, new File("c:\\tmp\\screenshotd.png"));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='center_column']/ul/li[5]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile4, new File("c:\\tmp\\screenshote.png"));
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='columns']/div[1]/a[2]")).click();
	    Thread.sleep(1000);	
        WebElement Element1 = driver.findElement(By.linkText("Blouse"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='center_column']/ul/li[6]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")).click();
	    Thread.sleep(1000);
        WebElement Element4 = driver.findElement(By.xpath("//*[@id='cart_summary']/thead/tr/th[1]"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element4);
        Thread.sleep(1000);
		File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile5, new File("c:\\tmp\\screenshotf.png"));
		Thread.sleep(5000);
        WebElement Element5 = driver.findElement(By.xpath("//*[@id='center_column']/div[3]/div[1]/ul/li[1]/h3/span"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element5);
        Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id='address_invoice']/li[8]/a")).click();
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("Fabian");
	    driver.findElement(By.id("lastname")).clear();;
	    driver.findElement(By.id("lastname")).sendKeys("Cabrejo");
	    driver.findElement(By.id("address1")).clear();
	    driver.findElement(By.id("address1")).sendKeys("Cra 88 D # 37 A 21 Sur");
	    driver.findElement(By.id("city")).clear();
	    driver.findElement(By.id("city")).sendKeys("Bogota");
	    driver.findElement(By.id("id_state")).click();
	    driver.findElement(By.xpath("//*[@id='id_state']/option[11]")).click();
	    driver.findElement(By.id("postcode")).clear();
	    driver.findElement(By.id("postcode")).sendKeys("30245");
	    driver.findElement(By.id("id_country")).click();
	    driver.findElement(By.xpath("//*[@id='id_country']/option")).click();
	    driver.findElement(By.id("phone")).clear();
	    driver.findElement(By.id("phone")).sendKeys("6024540856");
	    driver.findElement(By.id("phone_mobile")).clear();
	    driver.findElement(By.id("phone_mobile")).sendKeys("3132473802");
	    Thread.sleep(1000);
		File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile6, new File("c:\\tmp\\screenshotg.png"));
	    Thread.sleep(1000);
	    driver.findElement(By.id("submitAddress")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='center_column']/form/p/button")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("cgv")).click();
	    Thread.sleep(1000);
		File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile7, new File("c:\\tmp\\screenshoth.png"));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='form']/p/button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();
        WebElement Element6 = driver.findElement(By.xpath("//*[@id='center_column']/h1"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element6);
	    Thread.sleep(1000);
		File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile8, new File("c:\\tmp\\screenshoti.png"));
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='center_column']/p/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]")).click();
	    Thread.sleep(1000);
        WebElement Element2 = driver.findElement(By.linkText("Summer Dresses"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element2);
        Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("color_24")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id='add_to_cart']/button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]")).click();
	    Thread.sleep(1000);
	    WebElement Element3 = driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
	        // Scrolling down the page till the element is found		
	    js.executeScript("arguments[0].scrollIntoView();", Element3);
	    Thread.sleep(10000);
		driver.quit();

	}

}
