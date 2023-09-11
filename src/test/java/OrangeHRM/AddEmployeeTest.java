package OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddEmployeeTest extends BaseClass {
	HomePage homepage;
	AddEmployeePage add_emp1;
	
//To verify Add Employee with all valid credentials	
 @Test(priority = 9)
  public void verifyAddEmployeepage() throws Exception {
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		add_emp1=new AddEmployeePage(driver);
		loginpage.login("Admin", "admin123");
		homepage.clickOnPIM();

}
}

