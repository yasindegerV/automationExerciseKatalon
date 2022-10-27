import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.waitForPageLoad(20)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/txt_Category'), 0)

WebUI.click(findTestObject('Page_Automation Exercise/btn_SignUpLogin'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup  Login/txt_NewUserSignUp'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_newUserSignUpName'), 'Yasin')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_newUserSignUpEmail'), 'yasin.deger@virgosol.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup/input_mrTitle'))

WebUI.getText(findTestObject('Page_Automation Exercise - Signup/input__name'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Page_Automation Exercise - Signup/input__email'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup/input__password'), 'tO3m0nBa5UU8Rk419DvAxw==')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Day'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Month'), '5', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Year'), '2021', false)

WebUI.scrollToElement(findTestObject('Page_Automation Exercise - Signup/input_newsLetterCheckbox'), 0)

WebUI.check(findTestObject('Page_Automation Exercise - Signup/input_newsLetterCheckbox'))

WebUI.check(findTestObject('Page_Automation Exercise - Signup/input_specialOfferCheckbox'))

WebUI.sendKeys(findTestObject('Page_Automation Exercise - Signup/input__first_name'), 'Yasin')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__last_name'), 'Değer')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company_company'), 'virgosol')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_address1'), 'İzmir')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_UnitedStates'), 'United States', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__state'), 'CA')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__city'), 'Virginia')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__zipcode'), '35000')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__mobile_number'), '5308245631')

WebUI.scrollToElement(findTestObject('Page_Automation Exercise - Signup/button_Create Account'), 0)

WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Account Created/txt_Account Created'), 0)

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/btn_ContinueButton'))

loginName = WebUI.getText(findTestObject('Page_Automation Exercise/a_Logged in as Name'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise/a_Logged in as Name'), loginName)

WebUI.click(findTestObject('Page_Automation Exercise/a_Delete Account'))

WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Account Created/b_Account Deleted'), 0)

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/btn_ContinueButton'))

WebUI.closeBrowser()

