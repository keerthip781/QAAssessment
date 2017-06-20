package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmountPage extends BaseClass{
	
	public AmountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.ID, using="txt_val_1")
	public static WebElement txt_value_1;

	
	@FindBy(how=How.ID, using="txt_val_2")
	public static WebElement txt_value_2;
	
	@FindBy(how=How.ID, using="txt_val_3")
	public static WebElement txt_value_3;
	
	@FindBy(how=How.ID, using="txt_val_4")
	public static WebElement txt_value_4;
	
	@FindBy(how=How.ID, using="txt_val_5")
	public static WebElement txt_value_5;

	@FindBy(how=How.ID, using="txt_ttl_val")
	public static WebElement txt_value_total;

}
