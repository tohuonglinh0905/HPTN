//package demo.nopcommerce.nopcommerce.testscript;
//
//import demo.nopcommerce.annotations.MisaAnnotation;
//import demo.nopcommerce.common.TestBase;
//import demo.nopcommerce.constants.AuthorType;
//import demo.nopcommerce.constants.CategoryType;
//import demo.nopcommerce.driver.DriverManager;
//import demo.nopcommerce.driver.TargetFactory;
//import demo.nopcommerce.nopcommerce.dataprovider.AddressesDataProvider;
//import demo.nopcommerce.nopcommerce.dataprovider.RegisterDataProvider;
//import demo.nopcommerce.nopcommerce.models.AddressesModel;
//import demo.nopcommerce.nopcommerce.models.LoginModel;
//import demo.nopcommerce.nopcommerce.page.Addresses;
//import demo.nopcommerce.nopcommerce.page.HomePage;
//import demo.nopcommerce.nopcommerce.page.LoginPage;
//import demo.nopcommerce.nopcommerce.page.RegisterPage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ThreadGuard;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Test;
//public class AddressesTest extends TestBase {
//    RegisterPage registerPage;
//    HomePage homePage;
//    LoginPage loginPage;
//    Addresses addresses;
//
//@BeforeClass(alwaysRun = true)
//public void createDriver(@Optional("chrome") String browser) {
//        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
//        DriverManager.setDriver(driver);
//
//    HomePage homePage = new HomePage(DriverManager.getDriver());
////        registerPage = homePage.registerPage();
////    }
//        }
////    @BeforeTest(alwaysRun = true)
////    public void beforeMothod(LoginModel loginModel){
////        homePage = new HomePage(DriverManager.getDriver());
////
////
////    }
//
//@AfterMethod(alwaysRun = true)
//public void closeDriver() {
////        DriverManager.quit();
//        }
//    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
////    @Test(priority = 1, description = "Thêm địa chỉ mới khi đã login tài khoản")
//    @Test(priority = 3, description = " create account ", dataProvider = "addresses", dataProviderClass = AddressesDataProvider.class)
//    public void Addresses(AddressesModel addressesModel) {
////        if(homePage != null && homePage.registerPage() != null){
////            registerPage = homePage.registerPage();
//////            if(registerPage != null){
////                LoginModel loginModel = new LoginModel();
////                String lastName = "to";
////                String firstName = "linh";
////                String email = "linh@gmail.com";
////                String pass = "123456";
////                String pass01 ="123456";
////                loginModel.setFirstName(firstName);
////                loginModel.setLastName(lastName);
////                loginModel.setEmail(email);
////                loginModel.setPassword(pass);
////                loginModel.setConfirmPassword(pass01);
//                registerPage.createAccount(loginModel);
//                loginPage = registerPage.goToLoginPage();
//                homePage = loginPage.loginPage(loginModel);
//                addresses = homePage.goToAddressesPage();
//                addresses.createAddresses(addressesModel);
////            }
//        }
//
//    }
//}
