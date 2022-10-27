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

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('TC001 Register User/Page_Automation Exercise/txt_Category'), 0)

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise/btn_SignUpLogin'))

WebUI.verifyElementVisible(findTestObject('TC001 Register User/Page_Automation Exercise - Signup  Login/txt_newUserSignUp'))

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup  Login/input_signUpName'), 'Yasin')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup  Login/input_signUpEmail'), 'yasin.deger@virgosol.com')

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise - Signup  Login/btn_signUp'))

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/check_MrTitle'))

WebUI.getText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__name'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__email'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__password'), 'tO3m0nBa5UU8Rk419DvAxw==')

WebUI.selectOptionByValue(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/select_day'), '1', false)

WebUI.selectOptionByValue(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/select_month'), '5', false)

WebUI.selectOptionByValue(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/select_year'), '2021', false)

WebUI.sendKeys(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressFirstName'), 'Yasin')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressLastName'), 'Değer')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressCompany'), 'virgosol')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressAddress1'), 'İzmir')

WebUI.selectOptionByValue(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/select_addressUnitedStates'), 
    'United States', false)

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressState'), 'CA')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressCity'), 'Virginia')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressZipCode'), '35000')

WebUI.setText(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/input__addressMobileNumber'), '5308245631')

WebUI.scrollToElement(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/btn_CreateAccount'), 0)

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise - Signup/btn_CreateAccount'))

WebUI.verifyElementPresent(findTestObject('TC001 Register User/Page_Automation Exercise - Account Created/txt_AccountCreated'), 
    0)

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise - Account Created/btn_Continue'))

loginName = WebUI.getText(findTestObject('TC001 Register User/Page_Automation Exercise/txt_loggedNameAsMehmet'))

WebUI.verifyElementText(findTestObject('TC001 Register User/Page_Automation Exercise/txt_loggedNameAsMehmet'), loginName)

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise/btn_deleteAccount'))

WebUI.verifyElementPresent(findTestObject('TC001 Register User/Page_Automation Exercise - Account Created/txt_Account Deleted'), 
    0)

WebUI.click(findTestObject('TC001 Register User/Page_Automation Exercise - Account Created/btn_Continue'))

WebUI.closeBrowser()

