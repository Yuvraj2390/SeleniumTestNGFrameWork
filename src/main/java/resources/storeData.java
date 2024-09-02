package resources;

public class storeData {
	//data to store the registration credentials 
		public static String firstname = "Test";
		public static String lastName = "test123";
		public static String telePhone = "1234567890";
		public static String password = "12345678";
		public static String confirmPassword = "12345678";
		
		//storing expected result for all the classes
		public static String registerExpectedsucessURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
		public static String firstNameErrorExpectedresult = "First Name must be between 1 and 32 characters!";	
		public static String lastNameErrorExpectedresult = "Last Name must be between 1 and 32 characters!";
		public static String emailErrorExpectedresult = "E-Mail Address does not appear to be valid!";
		public static String telePhoneErrorExpectedresult = "Telephone must be between 3 and 32 characters!";
		public static String passwordErrorExpectedresult = "Password must be between 4 and 20 characters!";
		public static String privacyPolicyErrorExpectedresult = "Warning: You must agree to the Privacy Policy!";
		
		
		
		
		//String the expected data for login 
		public static String loginExpectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
		public static String logOutExpectedConfirmationtext = "Account Logout";

}
