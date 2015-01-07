package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.junit.*;

public class SomeTests {
	public WebDriver driver;
	@Before public void firefoxSetup ()	
	{
		driver = new FirefoxDriver();
	}
	
	
	@Test public void dashboardPageClicksFine ()
	{
		loginSuccess();
		//Operational
		driver.findElement(By.xpath(".//a[@href='#dashboard_2']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Dashboard Operational Tab Works Fine");
		//Financial
		driver.findElement(By.xpath(".//a[@href='#dashboard_3']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Dashboard Financial Tab Works Fine");
		
		
			/*//Model criteria
			driver.findElement(By.xpath(".//a[@href='#filter_models_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
			//Organization
			driver.findElement(By.xpath(".//a[@href='#filter_organization_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Dashboard Organization Filter Works Fine");
			//Assert Criteria 
			driver.findElement(By.xpath(".//a[@href='#filter_assets_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Dashboard Assert Criteria Filter Works Fine");
			/*//Event Criteria
			driver.findElement(By.xpath(".//a[@href='#filter_events_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	}
		@Test public void modelsPageClicksFine ()
		{
		loginSuccess();	
		//Models
		driver.findElement(By.xpath(".//a[@href='/gateway/vision/models/']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Models Page Clicks Fine");
		
			//Export Button
			driver.findElement(By.xpath(".//a[@id='export_btn']")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			System.out.println("Models Export List Button Works Fine");
		
			/*//Model criteria
			//driver.findElement(By.xpath("//*[@id='filter_model']/div[2]/div[1]/h4/a")).click();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Organization
			driver.findElement(By.xpath("//*[@id='filter_model']/div[3]/div[1]/h4/a")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//Assert Criteria 
			driver.findElement(By.xpath(".//a[@href='#filter_assets_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Event Criteria
			driver.findElement(By.xpath(".//a[@href='#filter_events_criteria']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		}
		
		@Test public void assetsPageClicksFine ()
		{
		loginSuccess();	
		//Asserts
		driver.findElement(By.xpath(".//*[@href='/gateway/vision/assets/']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Assets Page Clicks Fine");
		}
		
		@Test public void eventsPageClicksFine ()
		{
		loginSuccess();	
		//Events
		driver.findElement(By.xpath("//*[@id='hornav_events']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Events Page Clicks Fine");
		}
		
		@Test public void playbookPageClicksFine ()
		{
			
			loginSuccess();
			//Playbook
					driver.findElement(By.xpath("//*[@id='hornav_playbook']/a")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						//Organization
						driver.findElement(By.xpath("//*[@id='filter_playbook']/div[2]/div[1]/h4/a")).click();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		}

		
		@Test public void adminPageClicksFine ()
		{
		loginSuccess();
		//Admin
		driver.findElement(By.xpath("//*[@id='hornav_admin']/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Admin Page Clicks Fine");
		
		//driver.findElement(By.xpath("//*[@id='filter_dashboard']/div[2]/div[1]/h4/a")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

	@ Test public void loginSuccess() {
		driver.get("http://192.168.21.128/gateway/vision/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Login possitive
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("pass");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		/*System.out.println("Login success");*/
	}
		
	@After public void Quit (){
		driver.quit();

}
}