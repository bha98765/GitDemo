package project1;


import org.testng.annotations.*;

import invoiceapp.page.Select;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;




public class Bhanu {
	


    public static void main(String[] args) throws InterruptedException {

    	 

      
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
           driver.manage().window().maximize();
           Thread.sleep(2000);
           //driver.findElement(By.xpath("//select[@class='wHuges station ddlfromto formSelect CustomizableDD required valid']//option[8]")).click();
           
  
           Select drpCountry = new Select(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/input[1]"));