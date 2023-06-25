package demo.nopcommerce.nopcommerce.testscript;

import demo.nopcommerce.annotations.MisaAnnotation;
import demo.nopcommerce.common.TestBase;
import demo.nopcommerce.constants.AuthorType;
import demo.nopcommerce.constants.CategoryType;
import demo.nopcommerce.driver.DriverManager;
import demo.nopcommerce.driver.TargetFactory;
import demo.nopcommerce.nopcommerce.dataprovider.LoginDataProvider;
import demo.nopcommerce.nopcommerce.models.LoginModel;
import demo.nopcommerce.nopcommerce.page.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.*;

public class LoginTest extends TestBase {
    RegisterPage registerPage;
    HomePage homePage;
    LoginPage loginPage;
    MyAccount myAccount;
    Search_and_Advanced_Search search;
    Wishlist wishlist;
    Addresses addresses;
    String Search = "Macbook Pro 2050";
    String Search01 = "Lenovo";
    String Search02 ="Apple MacBook Pro ";
    String city = "HaNoi";
    String address1 = "Đống Đa";
    String address2 = "Khương Thượng";
    String ZipPostalCode = "01928284";
    String number = "019283748";
    String firstName = "linh";
    String lastName = "to";
    String email = "linhth3@gmail.com";

    String company = "linhto0905";
    @BeforeClass(alwaysRun = true)
    public void createDriver(@Optional("chrome") String browser) {
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        DriverManager.setDriver(driver);

        homePage = new HomePage(DriverManager.getDriver());
//        registerPage = homePage.registerPage();
//    }
    }
//    @BeforeTest(alwaysRun = true)
//    public void beforeMothod(LoginModel loginModel){
//        homePage = new HomePage(DriverManager.getDriver());
//
//
//    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
//        DriverManager.quit();
    }


    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 1, description = "Đăng nhập tài khoản với đầy đủ các trường")
    @Test(priority = 1,dataProvider = "login", dataProviderClass = LoginDataProvider.class)
    public void Login_01(LoginModel loginModel) {
        registerPage = homePage.registerPage();
        registerPage.createAccount(loginModel);
        loginPage = registerPage.goToLoginPage();
        homePage = loginPage.loginPage(loginModel);
    }
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 1, description = "Cập nhật đầy đủ thông tin cá nhân")
    @Test(priority = 2,dataProvider = "login", dataProviderClass = LoginDataProvider.class)
    public void MyAccount_01(LoginModel loginModel) {
        registerPage = homePage.registerPage();
        registerPage.createAccount(loginModel);
        loginPage = registerPage.goToLoginPage();
        homePage = loginPage.loginPage(loginModel);
        myAccount = registerPage.goToMyAccountPage();
        myAccount.createMyAccount(firstName, lastName, email, company);
    }

    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 1, description = "Tìm kiếm khi để trống data")
    @Test(priority = 1)
    public void Search_01() {
        homePage = homePage.gotoHomePage();
        search = homePage.goToMySearchPage();
        search.Advanced_Search01();}
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 1, description = "Tìm kiếm không tồn tại mặt hàng ")
    @Test(priority = 2)
    public void Search_02() {
        homePage = homePage.gotoHomePage();
        search = homePage.goToMySearchPage();
        search.Advanced_Search02(Search);}
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 3, description = "Tìm kiếm tương đối")
    @Test(priority = 3)
    public void Search_03() {
        homePage = homePage.gotoHomePage();
        search = homePage.goToMySearchPage();
        search.Advanced_Search03(Search01);}
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 4, description = "Tìm kiếm tuyệt đối")
    @Test(priority = 4)
    public void Search04() {
        homePage = homePage.gotoHomePage();
        search = homePage.goToMySearchPage();
        search.Advanced_Search04(Search);
//        wishlist = registerPage.goToWishlistPage();
//        wishlist.WishList();
    }
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 5, description = "Tìm kiếm nâng cao với danh mục chính")
    @Test(priority = 5)
    public void Search05() {
        homePage = homePage.gotoHomePage();
        search = homePage.goToMySearchPage();
        search.Advanced_Search05(Search02);
//        wishlist = registerPage.goToWishlistPage();
//        wishlist.WishList();
    }
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 6, description = "Tìm kiếm nâng cao với danh mục phụ")
    @Test(priority = 6)
    public void Search06() {
        homePage = homePage.gotoHomePage();
        search = homePage.goToMySearchPage();
        search.Advanced_Search06(Search02);
//        wishlist = registerPage.goToWishlistPage();
//        wishlist.WishList();
    }

    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 4, description = "Kiểm tra danh sách yêu thích khi không click vào Ram và HDD")
    @Test(priority = 4)
    public void WishList_01() {
        homePage = homePage.gotoHomePage();
        wishlist = homePage.goToWishlistPage();
        wishlist.ClickWishList01();
    }
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 5, description = "Kiểm tra danh sách yêu thích khi không nhập Ram")
    @Test(priority = 5)
    public void WishList_02() {
        homePage = homePage.gotoHomePage();
        wishlist = homePage.goToWishlistPage();
        wishlist.ClickWishList02();}

    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 6, description = "Kiểm tra danh sách yêu thích khi nhập đầu đủ Ram và HDD")
    @Test(priority = 6)
    public void WishList_03() {
        homePage = homePage.gotoHomePage();
        wishlist = homePage.goToWishlistPage();
        wishlist.ClickWishList03();
    }
    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 7, description = "Chỉnh sửa danh sách yêu thích")
    @Test(priority = 7)
    public void WishList_04() {
        homePage = homePage.gotoHomePage();
        wishlist = homePage.goToWishlistPage();
        wishlist.ClickEditWishlist();
    }

    @MisaAnnotation(category = {CategoryType.REGRESSION}, author = {AuthorType.Linh}, reviewer = {AuthorType.Linh})
//    @Test(priority = 1, description = "Thêm địa chỉ mới khi đã login tài khoản")
    @Test(priority = 3,dataProvider = "login", dataProviderClass = LoginDataProvider.class)
    public void Addresses(LoginModel loginModel) {
        registerPage = homePage.registerPage();
        registerPage.createAccount(loginModel);
        loginPage = registerPage.goToLoginPage();
        homePage = loginPage.loginPage(loginModel);
        addresses = homePage.goToAddressesPage();
        addresses.createAddresses(firstName, lastName, email, company, city, address1, address2, ZipPostalCode, number);
    }


}
