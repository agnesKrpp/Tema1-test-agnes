import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

//    @Test
//    public void testcautare() throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-search-engine-choice-screen");
//        options.addArguments("--incognito");
//        options.addArguments("--window-size=1280,1024");
//
//        WebDriver driver = new ChromeDriver(options);
//
//        driver.get("https://practicesoftwaretesting.com/");
//        //driver.manage().window().maximize();
//
//        WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"search-query\"]"));
//        inputSearch.sendKeys("thor");
//
//        inputSearch.sendKeys(Keys.ENTER);
//
//        Thread.sleep(3000);
//        WebElement produsThor = driver.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a/div[1]/img"));
//        produsThor.click();
//        Thread.sleep(2000);
//
//        String expectedTitle = "Thor Hammer";
//        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
//        //String expectedURL="https://practicesoftwaretesting.com/product/01J6FH90FY08EMAMJ99PDSF3GT";
//        //Assert.assertTrue(driver.getCurrentUrl().contains("01J6FMPWEZY5893A06R8GGJ6GQ"));
//        //System.out.println("Sunt pe pagina corecta: "+ driver.getCurrentUrl().contains("01J6FH90FY08EMAMJ99PDSF3GT"));
//
//        Thread.sleep(2000);
//        WebElement plusHammer = driver.findElement(By.xpath("//*[@id=\"btn-increase-quantity\"]/fa-icon"));
////        plusHammer.click();
////        Thread.sleep(2000);
////        plusHammer.click();
////        Thread.sleep(2000);
//        int buc=3;
//        for(int i=1; i<buc; i++ ){
//            plusHammer.click();
//        }
//
//        WebElement addToCart = driver.findElement(By.id("btn-add-to-cart"));
//        addToCart.click();
//        Thread.sleep(7000);
//
//        driver.get("https://practicesoftwaretesting.com/checkout");
//        Thread.sleep(3000);
//
//        WebElement produsCos = driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[1]/span"));
//        Assert.assertEquals(produsCos.getText(),"Thor Hammer ");
//
//        WebElement cantitateCos = driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[2]/input"));
//        Assert.assertEquals(cantitateCos.getAttribute("value"),String.valueOf(buc));
//    }

    @Test
    public void cautareTema() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--incognito");
        options.addArguments("--window-size=1280,1024");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://practicesoftwaretesting.com/");


        WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"search-query\"]"));
        inputSearch.sendKeys("wood saw");

        inputSearch.sendKeys(Keys.ENTER);

            Thread.sleep(3000);

        WebElement produsWoodSaw = driver.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a/div[2]/h5"));
        produsWoodSaw.click();
        Thread.sleep(2000);

        String expectedTitle = "Wood Saw";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));


        Thread.sleep(2000);
        WebElement plusSaw = driver.findElement(By.xpath("//*[@id=\"btn-increase-quantity\"]"));

        int buc=3;
        for(int i=1; i<buc; i++ ){
            plusSaw.click();
        }

        WebElement addToCart = driver.findElement(By.id("btn-add-to-cart"));
        addToCart.click();
        Thread.sleep(7000);

        driver.get("https://practicesoftwaretesting.com/checkout");
        Thread.sleep(3000);

        WebElement produsCos = driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[1]"));
        Assert.assertEquals(produsCos.getText(),"Wood Saw ");

        WebElement cantitateCos = driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[2]/input"));
        Assert.assertEquals(cantitateCos.getAttribute("value"),String.valueOf(buc));

    }


}
