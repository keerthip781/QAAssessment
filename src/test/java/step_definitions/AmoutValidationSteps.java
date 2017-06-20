package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AmountPage;


public class AmoutValidationSteps{
    public WebDriver driver;
    
    public AmoutValidationSteps()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open exercisesel website$")
    public void i_open_seleniumframework_website() throws Throwable {
        driver.get("http://www.seleniumframework.com");
    }

    @Then("^I Should see Value \"(.*?)\" in Value1 Field$")
    public void validate_value1_Field(String sVal) throws Throwable { 
      assertEquals(sVal,AmountPage.txt_value_1.getAttribute("value"));
    }
    
    @Then("^I Should see Value \"(.*?)\" in Value2 Field$")
    public void validate_value2_Field(String sVal) throws Throwable { 
      assertEquals(sVal,AmountPage.txt_value_2.getAttribute("value"));
    }
    
    @Then("^I Should see Value \"(.*?)\" in Value3 Field$")
    public void validate_value3_Field(String sVal) throws Throwable { 
      assertEquals(sVal,AmountPage.txt_value_3.getAttribute("value"));
    }
    
    @Then("^I Should see Value \"(.*?)\" in Value4 Field$")
    public void validate_value4_Field(String sVal) throws Throwable { 
      assertEquals(sVal,AmountPage.txt_value_4.getAttribute("value"));
    }
    
    @Then("^I Should see Value \"(.*?)\" in Value5 Field$")
    public void validate_value5_Field(String sVal) throws Throwable { 
      assertEquals(sVal,AmountPage.txt_value_5.getAttribute("value"));
    }
    
    @Then("^I Should see Value in Value1 Field is Greater than 0$")
    public void validate_value1_Field_Zero(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_1.getAttribute("value");
      sAmount = sAmount.replace("$","").replace(",", "");
      int iAmount = Integer.parseInt(sAmount);
      assertEquals(true,iAmount>0);
    }
    
    @Then("^I Should see Value in Value2 Field is Greater than 0$")
    public void validate_value2_Field_Zero(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_2.getAttribute("value");
      sAmount = sAmount.replace("$","").replace(",", "");
      int iAmount = Integer.parseInt(sAmount);
      assertEquals(true,iAmount>0);
    }
    
    @Then("^I Should see Value in Value3 Field is Greater than 0$")
    public void validate_value3_Field_Zero(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_3.getAttribute("value");
      sAmount = sAmount.replace("$","").replace(",", "");
      int iAmount = Integer.parseInt(sAmount);
      assertEquals(true,iAmount>0);
    }
    
    @Then("^I Should see Value in Value4 Field is Greater than 0$")
    public void validate_value4_Field_Zero(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_4.getAttribute("value");
      sAmount = sAmount.replace("$","").replace(",", "");
      int iAmount = Integer.parseInt(sAmount);
      assertEquals(true,iAmount>0);
    }
    
    @Then("^I Should see Value in Value5 Field is Greater than 0$")
    public void validate_value5_Field_Zero(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_5.getAttribute("value");
      sAmount = sAmount.replace("$","").replace(",", "");
      int iAmount = Integer.parseInt(sAmount);
      assertEquals(true,iAmount>0);
    }
    
    @Then("^I Should see Value \"(.*?)\" in Balance Field$")
    public void validate_balance_Field(String sVal) throws Throwable { 
      assertEquals(sVal,AmountPage.txt_value_total.getAttribute("value"));
    }
    
    @Then("^I Should see Value in Value1 Field is currency value$")
    public void validate_value1_Field_As_Currency(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_1.getAttribute("value");      
      assertEquals(true,sAmount.startsWith("$"));
    }
    
    @Then("^I Should see Value in Value2 Field is currency value$")
    public void validate_value2_Field_As_Currency(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_2.getAttribute("value");      
      assertEquals(true,sAmount.startsWith("$"));
    }
    
    @Then("^I Should see Value in Value3 Field is currency value$")
    public void validate_value3_Field_As_Currency(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_3.getAttribute("value");      
      assertEquals(true,sAmount.startsWith("$"));
    }
    
    @Then("^I Should see Value in Value4 Field is currency value$")
    public void validate_value4_Field_As_Currency(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_4.getAttribute("value");      
      assertEquals(true,sAmount.startsWith("$"));
    }
    
    @Then("^I Should see Value in Value5 Field is currency value$")
    public void validate_value5_Field_As_Currency(String sVal) throws Throwable { 
      String sAmount = AmountPage.txt_value_5.getAttribute("value");      
      assertEquals(true,sAmount.startsWith("$"));
    }
    
    @Then("^Sum of All Values should match with Total Balance$")
    public void validate_sum_of_all_fields(String sVal) throws Throwable { 
      String sAmount1 = AmountPage.txt_value_1.getAttribute("value");      
      int iAmount1 = Integer.parseInt(sAmount1.replace("$", "").replace(",", ""));
      
      String sAmount2 = AmountPage.txt_value_2.getAttribute("value");      
      int iAmount2 = Integer.parseInt(sAmount2.replace("$", "").replace(",", ""));
      
      String sAmount3 = AmountPage.txt_value_3.getAttribute("value");      
      int iAmount3 = Integer.parseInt(sAmount3.replace("$", "").replace(",", ""));
      
      String sAmount4 = AmountPage.txt_value_4.getAttribute("value");      
      int iAmount4 = Integer.parseInt(sAmount4.replace("$", "").replace(",", ""));
      
      String sAmount5 = AmountPage.txt_value_5.getAttribute("value");      
      int iAmount5 = Integer.parseInt(sAmount5.replace("$", "").replace(",", ""));
      
      String sBalance = AmountPage.txt_value_total.getAttribute("value");      
      int iBalance = Integer.parseInt(sBalance.replace("$", "").replace(",", ""));
      
      int iTempTotal = iAmount1+iAmount2+iAmount3+iAmount4+iAmount5;
      assertEquals(true,iBalance==iTempTotal);
    }
}