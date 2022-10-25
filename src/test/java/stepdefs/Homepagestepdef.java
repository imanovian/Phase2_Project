package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class Homepagestepdef {

	WebDriver driver = Hooks.driver;

	@Then("I should Add to cart Product as {string}")
	public void i_should_Add_to_cart_Product_as(String ProductName) {
		// Write code here that turns the phrase above into concrete actions
		String Xpath = "//div[text()='" + ProductName + "']//following::button[1]";
		WebElement Item = driver.findElement(By.xpath(Xpath));
		Item.click();

	}

	@Then("I should see the item number of cart be {int}")
	public void i_should_see_the_item_number_of_cart_be(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		WebElement CartItem = driver.findElement(By.xpath("//div/a/span[@class=\"shopping_cart_badge\"]"));
		String items = CartItem.getText();
		Assert.assertEquals(items, "1");
	}
}
