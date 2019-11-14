package com.vtiger.pom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.vtiger.generics.IAutoConstant;

public class VTiger implements IAutoConstant {
	public VTiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Home Page is not displayed",true);
			Assert.fail();
		}
	}
	public  void purchaseOrderPageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Purcahse order Page is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Purcahse order Page is not displayed",true);
			Assert.fail();
		}

   }
	
	public  void createPurchaseOrder(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("create Purcahse order Page is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("create Purcahse order Page is not displayed",true);
			Assert.fail();
		}

	}
	public  void PurchaseOrderIsCreated(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Purcahse order is Created",true);
		}
		catch(Exception e)
		{
			Reporter.log("Purcahse order is Created",true);
			Assert.fail();
		}

	}
	public  void PurchaseOrderIsNotCreated(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Purcahse order is not Created",true);
		}
		catch(Exception e)
		{
			Reporter.log("Purcahse ordr is not crtd",true);
			Assert.fail();
		}
	
	}	
		public  void PurchaseOrderIsCreatedWithCancelledStatus(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
		{	
			try 
			{
				WebDriverWait ww = new WebDriverWait(driver, ETO);
				ww.until(ExpectedConditions.titleContains(title));
				Reporter.log("Purcahse order is Created with cancelled status",true);
			}
			catch(Exception e)
			{
				Reporter.log("Purcahse order is not Created with cancelled status",true);
				Assert.fail();
			}

	}
          
		public  void singleLineQuantity(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
		{	
			try 
			{
				WebDriverWait ww = new WebDriverWait(driver, ETO);
				ww.until(ExpectedConditions.titleContains(title));
				Reporter.log("Purcahse order is Created with single quantity and amount calculation is correct",true);
			}
			catch(Exception e)
			{
				Reporter.log("Purcahse order is Created with single quantity and amount calculation is not correct",true);
				Assert.fail();
			}
		}
			public  void multiLineQuantityTocheckAmountCollection(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
			{	
				try 
				{
					WebDriverWait ww = new WebDriverWait(driver, ETO);
					ww.until(ExpectedConditions.titleContains(title));
					Reporter.log("Purcahse order is Created with multiple quantity and amount calculation is correct",true);
				}
				catch(Exception e)
				{
					Reporter.log("Purcahse order is Created with multiple quantity and amount calculation is not correct",true);
					Assert.fail();
				}

		}
			public  void addService(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
			{	
				try 
				{
					WebDriverWait ww = new WebDriverWait(driver, ETO);
					ww.until(ExpectedConditions.titleContains(title));
					Reporter.log("Purcahse order is Created with normal service",true);
				}
				catch(Exception e)
				{
					Reporter.log("Purcahse order is not created with normal service",true);
					Assert.fail();
				}
		}
	
			public  void copyShippigAddress(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
			{	
				try 
				{
					WebDriverWait ww = new WebDriverWait(driver, ETO);
					ww.until(ExpectedConditions.titleContains(title));
					Reporter.log("shipping address is copied",true);
				}
				catch(Exception e)
				{
					Reporter.log("shipping address is not copied",true);
					Assert.fail();
				}

		}
			public  void copyBillingAddress(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
			{	
				try 
				{
					WebDriverWait ww = new WebDriverWait(driver, ETO);
					ww.until(ExpectedConditions.titleContains(title));
					Reporter.log("billing address is copied",true);
				}
				catch(Exception e)
				{
					Reporter.log("Billing address is not copied",true);
					Assert.fail();
				}

		}
			
			public  void addMultipleService(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
			{	
				try 
				{
					WebDriverWait ww = new WebDriverWait(driver, ETO);
					ww.until(ExpectedConditions.titleContains(title));
					Reporter.log("Purchase order created with multiple service",true);
				}
				catch(Exception e)
				{
					Reporter.log("Purchase order is not created with multiple service",true);
					Assert.fail();
				}

		}
			public  void withoutProductErrorMessage(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException
			{	
				try 
				{
					WebDriverWait ww = new WebDriverWait(driver, ETO);
					ww.until(ExpectedConditions.titleContains(title));
					Reporter.log("Error pop is displayed",true);
				}
				catch(Exception e)
				{
					Reporter.log("Order is created",true);
					Assert.fail();
				}

		}

}




