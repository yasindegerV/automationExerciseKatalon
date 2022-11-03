package amazon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SetupForAmazon {
	
	@Keyword
	def loginApp() {
		
		
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/btn_Sign in'))
		
		WebUI.setText(findTestObject('AmazonKeywordDriven/Page_Amazon Sign-In/input_Email or mobile phone number_email'), GlobalVariable.email)
		
		WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon Sign-In/input_Enter your email or mobile phone number_continue'))
		
		WebUI.setText(findTestObject('AmazonKeywordDriven/Page_Amazon Sign-In/input_Forgot your password_password'), GlobalVariable.password)
		
		WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))
		
		
	
	}
}
