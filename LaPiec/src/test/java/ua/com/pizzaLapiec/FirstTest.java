package ua.com.pizzaLapiec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstTest {

    private ChromeDriver driver;
    


    @BeforeTest
    public void preCondition() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\LaPiec\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.lapiec-pizza.com.ua/");
        Thread.sleep(1000);

    }

    @Test
    public void firstTest() throws InterruptedException {

        driver.manage().window().maximize();

        //Choose the city
        driver.findElement(By.xpath("//button[@class=\"button lviv-city btnStyle2 btnSize2 active-city\"]")).click();

        String city = driver.findElement(By.xpath("//button[@class=\"button lviv-city btnStyle2 btnSize2 active-city\"]")).getText();
        Assert.assertEquals(city, ("Львів"));
        Thread.sleep(1000);

        //Click on confirm
        driver.findElement(By.xpath("//button[@class=\"button confirm-city\"]")).click();

        String confirm = driver.findElement(By.xpath("//button[@class=\"button confirm-city\"]")).getAttribute("class");
        Assert.assertEquals(confirm, ("button confirm-city"));
        Thread.sleep(2000);


        //Choose pizza carbonara
        driver.findElement(By.xpath("//*[@id=\"content-block\"]/section[2]/div[2]/div[2]/div[6]/div/div/div[2]/div[3]")).click();

        String pizza = driver.findElement(By.xpath("//*[@id=\"content-block\"]/section[2]/div[2]/div[2]/div[6]/div/div/div[2]/div[3]")).getAttribute("class");
        Assert.assertEquals(pizza, ("button add-to-cart-product"));
        Thread.sleep(2000);
        //Choose souse
        driver.findElement(By.xpath("//div[@class=\"ingredientItem addSaucePopup\"][@data-id=\"553\"]")).click();

        String souse = driver.findElement(By.xpath("//div[@class=\"ingredientItem addSaucePopup\"][@data-id=\"553\"]")).getAttribute("class");
        Assert.assertEquals(souse, ("ingredientItem addSaucePopup"));
        Thread.sleep(2000);

        //Click on basket
        driver.findElement(By.xpath("//img[@alt=\"shopping-cart\"]")).click();

        String basket = driver.findElement(By.xpath("//img[@alt=\"shopping-cart\"]")).getAttribute("alt");
        Assert.assertEquals(basket, ("shopping-cart"));
        Thread.sleep(2000);

        //Enter name
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("LvivVodokanal");

        String name = driver.findElement(By.xpath("//input[@name=\"name\"]")).getAttribute("value");
        Assert.assertEquals(name, ("LvivVodokanal"));
        Thread.sleep(2000);

        //Enter number
        driver.findElement(By.xpath("//input[@name=\"tel\"]")).sendKeys("322401140");

        String number = driver.findElement(By.xpath("//input[@name=\"tel\"]")).getAttribute("value");
        Assert.assertEquals(number, ("+38(032)240-11-40"));
        Thread.sleep(2000);

        //Enter street
        driver.findElement(By.xpath("//*[@id=\"streetAutocomplete\"]")).sendKeys("Зелена ");

        String street = driver.findElement(By.xpath("//*[@id=\"streetAutocomplete\"]")).getAttribute("value");
        Assert.assertEquals(street, ("Зелена "));
        Thread.sleep(2000);

        //Confirm street
        driver.findElement(By.className("ui-menu-item-wrapper")).click();

        String streetConfirm = driver.findElement(By.className("ui-menu-item-wrapper")).getAttribute("class");
        Assert.assertEquals(streetConfirm, ("ui-menu-item-wrapper"));
        Thread.sleep(2000);

        //Enter House number
        driver.findElement(By.xpath("//*[@id=\"houseNumber\"]")).sendKeys("64");

        String houseNumber = driver.findElement(By.xpath("//*[@id=\"houseNumber\"]")).getAttribute("value");
        Assert.assertEquals(houseNumber, ("64"));
        Thread.sleep(2000);


        //Click button checkout
//        driver.findElement(By.xpath("//*[@id=\"content-block\"]/section/div[4]/div[2]/div/div/div[2]/div[3]/a")).click();
//
//        String checkout = driver.findElement(By.xpath("//*[@id=\"content-block\"]/section/div[4]/div[2]/div/div/div[2]/div[3]/a")).getText("");
//        Assert.assertTrue(checkout.equals("ОФОРМИТИ ЗАМОВЛЕННЯ"));


    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
