package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

     public class LoginPage {
	
		@FindBy(name="user_name")
		private WebElement un;
		@FindBy(name="user_password")
		private WebElement pwd;	
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginBtn;	
		@FindBy(xpath="//a[text()='More']")
		private WebElement more;
		@FindBy(xpath="//a[text()='Purchase Order']")
		private WebElement purchase;
		@FindBy(xpath="//img[@alt='Create Purchase Order...']")
		private WebElement icon;
		@FindBy(xpath="//input[@name='subject']")
		private WebElement subject;
		@FindBy(xpath="//img[@language='javascript'][1]")
		private WebElement vendor;
		@FindBy (xpath="//input[@class='txtBox']")
		private WebElement Search;
        @FindBy (xpath="//input[@type='button']")
		private WebElement searchNow;
		@FindBy (xpath="//a[text()='Srinivas'][1]")
		private WebElement selectVendor;
		@FindBy (xpath="//textarea[@name='bill_street']")
		private WebElement billing;
		@FindBy (xpath="//input[@onclick='return copyAddressRight(EditView)']")
		private WebElement radio;
		@FindBy (xpath="//img[@title='Products']")
		private WebElement product;
		@FindBy (xpath="//a[text()='Half gir friend']")
		private WebElement selectProduct;
		@FindBy(xpath="//tr[25]/td/div/input[@class='crmbutton small save']")
		private WebElement save;
		@FindBy (xpath="//tr[25]/td/div/input[@class='crmbutton small cancel']")
		private WebElement cancel;
		@FindBy (xpath="//select[@name='postatus']/descendant::option[@value='Cancelled']")
		private WebElement cancelledStatus;
		@FindBy (xpath="//input[@value='Add Service']")
		private WebElement addService;
		@FindBy (xpath="//img[@title='Services']")
		private WebElement serviceIcon;
		@FindBy (xpath="//tr[2]/td/a[text()='Normal']")
		private WebElement selectService;
		@FindBy (xpath="//textarea[@name='ship_street']")
		private WebElement shipping;
		@FindBy (xpath="//input[@onclick='return copyAddressLeft(EditView)']")
		private WebElement radioShipping;
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void username(String text)
		{
			un.sendKeys(text);	
		}
		public void password(String text)
		{
			pwd.sendKeys(text);	
		}
		public void loginClick()
		{
			loginBtn.click();
		}
		public void more(){
			more.click();
		}
		public void purchaseOrder() {
			purchase.click();
		}
        public void iconClick() {
        	icon.click();
        }
        public void subject(String text) {
        	subject.sendKeys(text);
        }
       
        public void vIcon() {
           	vendor.click();
            }
        public void search(String text) {
        	Search.sendKeys(text);
        }
        public void searchNow() {
        	searchNow.click();
        }
        public void selectVendor() {
        	selectVendor.click();
        }
        public void billing(String text) {
        	billing.sendKeys(text);
        }
        public void radio() {
        	radio.click();
        }
        public void product() {
        	product.click();
        }
        public void selectProduct() {
        	selectProduct.click();
        }
        public void save() {
        	save.click();
        }
        public void cancel() {
        	cancel.click();
        }
        public void cancelledStatus() {
        	cancelledStatus.click();
        }
        public void addService() {
        	addService.click();
        }
        public void serviceIcon() {
        	serviceIcon.click();
        }
        public void  selectService() {
        	selectService.click();
        }
        public void copyShipping(String text) {
        	shipping.sendKeys(text);
        }
        public void radioShipping() {
        	radioShipping.click();
        }
}
