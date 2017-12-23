# ECommerceStore

<selenium web driver automation>

browser==firefox browser
windows==microsoft windows 10

Tools and applications needed for the project: 1. Eclipse to run Selenium webdriver,
						2. TestNG for running tests creating test suites, and generating reports of test runs
						3. Download Apache POI, and add jar files to eclipse library.
					
	
project==Automation of Online E-Commerce Store
page URL=="http://automationpractice.com/index.php"

Test cases created for: 1. Login(verify different login scenarios using valid and invalid credentials),
				2. Order of Item(dress) once user has successfully logged into the system,
				3.change of user info in profile section(verify if user can change profile info).
				4. contacts test case(verify if user can send message to admin/owner of site)
				
Other Test Cases are for:
1.Keyword Driven Framework: An excel file with the keywords used in the scripts is linked to the test case.
	The test case runs in step by step, executing one method after another. 
	The script refers to excel.xlsx file with the column of Keywords, and only moves to the next statement if 
	keyword used in class corresponds with one in the excel file
	
2. Data Driven framework: The login test case is tested with different credentials of email and password combinations.
	The credentials are contained in an excel file with different data sets of email, and password.
	This is used to verify if user can be able to log into the system by providing invalid email and invalid password.
	And also the error message displayed when user tries to login using the different credentials.
				

