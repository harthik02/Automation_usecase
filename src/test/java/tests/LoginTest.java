package tests;

import org.testng.annotations.*;
import base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {

@DataProvider(name="loginData")
public Object[][] getData(){
return ExcelUtil.getLoginData();
}

@Test(dataProvider="loginData")
public void loginTest(
String username,
String password){

LoginPage login =
        new LoginPage(driver);

login.login(username,password);
}
}