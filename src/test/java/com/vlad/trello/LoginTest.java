package com.vlad.trello;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest extends TestBase  {


    @BeforeMethod
    public void ensurePreconditions(){
        if( isAvatarPresentOnHeader()) {
            logout();


        }

    }
    public void logout(){
        click(By.cssSelector("[data-test-id='header-member-menu-button']"));
        click(By.cssSelector("[data-test-id='header-member-menu-logout']"));
    }

    @Test
    public void logInTest() throws InterruptedException {

        openSite("https://trello.com/");

        click(By.cssSelector("[href='/login']"));

        type(By.id("user"),"vlad.konko.fortest@gmail.com");

        Thread.sleep(5000);
        click(By.cssSelector("#login"));
        click(By.cssSelector("#login-submit"));
        type(By.cssSelector("#password"),"Trello778899");
        click(By.cssSelector("#login-submit"));


        wd.findElement(By.id("surface")).isDisplayed();







    }


}