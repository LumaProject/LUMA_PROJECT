package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoddiesPage {
	
	@FindBy(xpath = "(//a[@id='mode-list'])[1]")
	private WebElement list;

	@FindBy(xpath = "//div[text()='Style']")
	private WebElement style;

	public HoddiesPage(WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}

	public WebElement getList() {
		return list;
	}

	public WebElement getStyle() {
		return style;
	}
	
	public void operationOnHoddies()
	{
		list.click();
		style.click();
		
	}
	
	
	
	

}
