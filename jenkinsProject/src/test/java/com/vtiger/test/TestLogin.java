package com.vtiger.test;

import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.Excel;
import com.vtiger.pom.LoginPage;
import com.vtiger.pom.VTiger;

public class TestLogin extends BaseTest {
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("1");
	Thread.sleep(2000);
	l.save();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.PurchaseOrderIsCreated(driver, 5, title);
	}
	
	@Test
	public static void notCreated() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("1");
	Thread.sleep(2000);
	l.cancel();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.PurchaseOrderIsNotCreated(driver, 5, title);
	}
	@Test
	public static void cancelledStatus() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	l.cancelledStatus();
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("1");
	Thread.sleep(2000);
	l.save();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.PurchaseOrderIsCreatedWithCancelledStatus(driver, 5, title);
	}
	@Test
	public static void singleLineSingleQuantity() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("1");
	Thread.sleep(2000);
	l.save();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.singleLineQuantity(driver, 5, title);
	}
	
	@Test
	public static void multiLineMultiQuantity() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);  
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("3");
	Thread.sleep(2000);
	l.save();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.multiLineQuantityTocheckAmountCollection(driver, 5, title);
	}
	
	@Test
	public static void addService() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);  
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("1");
	Thread.sleep(2000);
	l.addService();
	l.serviceIcon();
	String parent2=driver.getWindowHandle();
	Set<String> wins2=driver.getWindowHandles();
	wins1.remove(parent2);
	for(String win01:wins2) {
		driver.switchTo().window(win01).switchTo();
	}
	l.selectService();
	driver.switchTo().window(parent2);
	driver.findElement(By.xpath("//input[@name='qty2']")).sendKeys("1");
	Thread.sleep(3000);
	l.save();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.multiLineQuantityTocheckAmountCollection(driver, 5, title);
	vtt.addService(driver, 5, title);
	}
	@Test
	public static void copyBillingaddress() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
    VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.copyBillingAddress(driver, 5, title);
	}
	
	@Test
	public static void copyShippingaddress() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String address1=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.copyShipping(address1);
	l.radioShipping();
    VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.copyShippigAddress(driver, 5, title);
	}
	@Test
	public static void addMultipleService() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);  
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.product();
	String parent1=driver.getWindowHandle();
	Set<String> wins1=driver.getWindowHandles();
	wins1.remove(parent1);
	for(String win0:wins1) {
		driver.switchTo().window(win0).switchTo();
	}
	l.selectProduct();
	driver.switchTo().window(parent1);
	driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("1");
	Thread.sleep(2000);
	l.addService();
	l.serviceIcon();
	String parent2=driver.getWindowHandle();
	Set<String> wins2=driver.getWindowHandles();
	wins1.remove(parent2);
	for(String win01:wins2) {
		driver.switchTo().window(win01).switchTo();
	}
	l.selectService();
	driver.switchTo().window(parent2);
	driver.findElement(By.xpath("//input[@name='qty2']")).sendKeys("3");
	Thread.sleep(3000);
	l.save();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
    vtt.addMultipleService(driver, 5, title);
	}
	
	@Test
	public static void createPurchaseWithoutProduct() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un= Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd =Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	System.out.println(un+" "+pwd+" "+title);
	LoginPage l = new LoginPage(driver);
	l.username(un);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginClick();
	l.more();
	l.purchaseOrder();
	Thread.sleep(2000);
	l.iconClick();
	String subject=Excel.getData(XL_PATH, SHEET_NAME, 4, 0);
	l.subject(subject);
	l.vIcon();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	Set<String> wins=driver.getWindowHandles();
	wins.remove(parent);  
	for(String win:wins) {
		driver.switchTo().window(win).switchTo();
	}
	String search=Excel.getData(XL_PATH, SHEET_NAME, 4, 1);
	l.search(search);
	l.searchNow();
	l.selectVendor();
	driver.switchTo().window(parent);
	String address=Excel.getData(XL_PATH, SHEET_NAME, 5, 0);
	l.billing(address);
	l.radio();
	l.addService();
	l.serviceIcon();
	String parent2=driver.getWindowHandle();
	Set<String> wins2=driver.getWindowHandles();
	wins2.remove(parent2);
	for(String win01:wins2) {
		driver.switchTo().window(win01).switchTo();
	}
	l.selectService();
	driver.switchTo().window(parent2);
	driver.findElement(By.xpath("//input[@name='qty2']")).sendKeys("1");
	Thread.sleep(3000);
	l.save();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	VTiger vtt = new VTiger(driver);
	vtt.verifyHomePageIsDisplayed(driver, 5, title);
	vtt.createPurchaseOrder(driver, 5, title);
	vtt.purchaseOrderPageIsDisplayed(driver, 5, title);
	vtt.withoutProductErrorMessage(driver, 5, title);
	}	
}  






