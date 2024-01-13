package utils;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilsMethod {
	@Test
	public static WebDriver LaunchChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com");
//		webDriver.manage().window().maximize();
//		webDriver.findElement(By.linkText(""));
		System.out.println(webDriver.getTitle());
		return webDriver;
	}

	@Test
	public static void selectRadio(WebDriver driver)
	{
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.name("group1"));
		for (WebElement rb : radios) 
		{
			if(rb.getAttribute("value").equalsIgnoreCase("Milk"))
			{
				rb.click();
				break;
			}
		}
	}
	@Test
	public static void searchByName(WebDriver driver) {
		System.out.println("in method searh");
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Lata Mangeshkar");
		System.out.println("click the links");
		WebElement x =  driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i"));
		x.click();
		System.out.println("click the links");
	}
	@Test
	public static  void registration(WebDriver driver) {
		driver.get(" https://demo.automationtesting.in/Register.html");
		
	}
	@Test
	public static void findMyAddr(WebDriver driver)
	{
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//*[@id=\"hArJGc\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input")).sendKeys("ACTS Pune");
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-0\"]/button[1]")).click();	
		driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).sendKeys("MNO 172, Purana Padav, Umaria, Madhya Pradesh");
		driver.findElement(By.xpath("//*[@id=\"searchbox-searchbutton\"]/span")).click();
	}
	@Test
	public static void signUp(WebDriver driver)
	{
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S-1744300491:1705136486030155&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AHNYTITBRnRvvrXCuSku8hJKafCkAHxzVF-45kEOHpdp5WxAUyfM-5oACbuEZEnOhttps://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S-1744300491:1705136486030155&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AHNYTITBRnRvvrXCuSku8hJKafCkAHxzVF-45kEOHpdp5WxAUyfM-5oACbuEZEnO");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Akansha");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Patil");
		driver.findElement(By.className("#collectNameNext > div > button > span")).click();
	}

	public static void searchOnMyntra(WebDriver driver)
	{
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Raymond Suits");
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[4]/label/div")).click();
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click();
		driver.findElement(By.xpath("")).sendKeys("411001");
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[4]/div/div/form/input[2]")).click();
		
	}
}
