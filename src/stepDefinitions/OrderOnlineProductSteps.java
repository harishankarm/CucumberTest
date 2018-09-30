package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.SeleniumHelper;
import pageObjects.HomePage;
import pageObjects.OrderHistory;
import pageObjects.PersonalinfoPage;
import pageObjects.ShopingCartPage;
import pageObjects.SignInPage;
import pageObjects.TshirtsPage;


public class OrderOnlineProductSteps extends SeleniumHelper{
	
	String tempActual;
	
	

	@Given("^user is on home page using the url$")
	public void user_is_on_home_page_using_the_url()  {
		getBrowser("chromedriver");
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
	}

	@When("^user click on Sign in link$")
	public void user_click_on_Sign_in_link() {
		HomePage homepage = new HomePage(driver);
		homepage.clickLoginBtn();
	}
	
	@When("^user sign in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_sign_in_with_valid_and(String email, String password) throws Throwable {
		SignInPage signinPage = new SignInPage(driver);
		signinPage.setEmailID(email);
		signinPage.setPassword(password);
		signinPage.clickSignIn();
	}


	@Then("^user should be logged in the application$")
	public void user_should_be_logged_in_the_application() throws Exception  {
		SignInPage signinPage = new SignInPage(driver);
		assertContains(signinPage.getSignOut(),"Sign out","User sign in");

	}
	
	@When("^Click the T-Shirt tab$")
	public void click_the_T_Shirt_tab()  {
		HomePage homepage = new HomePage(driver);
		homepage.ClicktShirtTab();
		TshirtsPage tshirtsPage = new TshirtsPage(driver);
		tshirtsPage.moveTotShirt(driver);
		
	}

	@When("^Click Add to cart button for selected t-Shirt$")
	public void click_Add_to_cart_button_for_selected_t_Shirt() {
		TshirtsPage tshirtsPage = new TshirtsPage(driver);
		tshirtsPage.clickAddToCart();
	}

	@When("^Click Proceed to checkout button in Cart popup$")
	public void click_Proceed_to_checkout_button_in_Cart_popup() {
		TshirtsPage tshirtsPage = new TshirtsPage(driver);
		tshirtsPage.clickProceedToCheckout();
		
	}
	
	@When("^Click Proceed to checkout button in Summary tab$")
	public void click_Proceed_to_checkout_button_in_Summary_tab() {
		ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		shopingCartPage.clickSummaryProCheckout();
	}

	@When("^Click Proceed to checkout button in Address tab$")
	public void click_Proceed_to_checkout_button_in_Address_tab() {
		ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		shopingCartPage.clickAddressProCheckout();
	}

	@When("^Click Proceed to checkout button in Shipping tab$")
	public void click_Proceed_to_checkout_button_in_Shipping_tab() {
		ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		shopingCartPage.clickTeamandCondition();
		shopingCartPage.clickShippingProCheckout();
		
	}

	@When("^Click on Pay by bank wire link in Payment tab$")
	public void click_on_Pay_by_bank_wire_link_in_Payment_tab()  {
		ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		shopingCartPage.clickPayByBank();
	}

	@When("^Click confirm my order button in Payment tab$")
	public void click_confirm_my_order_button_in_Payment_tab() {
		ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		shopingCartPage.clickConfirmMyOrder();
	}

	@When("^Click Back to Order link$")
	public void click_Back_to_Order_link() throws Throwable {
		ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		tempActual = shopingCartPage.getOrderDetails();
		shopingCartPage.clickBackToOrder();
	}

	@Then("^verify the Order reference number should be same$")
	public void verify_the_Order_reference_number_should_be_same() throws Exception  {
		OrderHistory orderHistory = new OrderHistory(driver);
		assertContains(tempActual,orderHistory.getFirstOrderRef(),"Order reference in Order History page ");
		driver.close();
	}


	@When("^Click the view my customer account$")
	public void click_the_view_my_customer_account() {
		
		PersonalinfoPage personalinfoPage = new PersonalinfoPage(driver);
		personalinfoPage.clickmyAccountLink();
	}

	@When("^Click My Personal Information button$")
	public void click_My_Personal_Information_button()  {
		PersonalinfoPage personalinfoPage = new PersonalinfoPage(driver);
		personalinfoPage.clickPersonalinfo();
	}

	@When("^Modify the First Name$")
	public void modify_the_First_Name()  {
		PersonalinfoPage personalinfoPage = new PersonalinfoPage(driver);
		personalinfoPage.setFirstname("Alex");
	}

	@When("^Click on Save button with valid password$")
	public void click_on_Save_button_with_valid_password()  {
		PersonalinfoPage personalinfoPage = new PersonalinfoPage(driver);
		personalinfoPage.setOldPassword("Password123");
		personalinfoPage.clickSaveButton();
	}

	@Then("^verify the successful message$")
	public void verify_the_successful_message() throws Exception  {
		PersonalinfoPage personalinfoPage = new PersonalinfoPage(driver);
		assertContains(personalinfoPage.getSuccessMsg(),"Your personal information has been successfully updated","Personal info succcessful message is not dispaly ");
		driver.close();
		
	}

}
