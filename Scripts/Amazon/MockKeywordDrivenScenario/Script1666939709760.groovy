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

CustomKeywords.'amazon.SetupForAmazon.loginApp'()

for (def index : (0..2)) {
    if (index == 0) {
        WebUI.sendKeys(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/input_searchBar'), 'Macbook Pro')

        WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/input_searchBarButton'))

        mPro = WebUI.getText(findTestObject('AmazonKeywordDriven/Page_Amazon.com  Macbook Pro/txt_SearchedElement'))

        WebUI.verifyEqual(mPro, '"Macbook Pro"')

        WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com  Macbook Pro/btn_homePageLogo'))
    } else if (index == 1) {
        WebUI.sendKeys(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/input_searchBar'), 'Macbook Air')

        WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/input_searchBarButton'))

        mAir = WebUI.getText(findTestObject('AmazonKeywordDriven/Page_Amazon.com  Macbook Pro/txt_SearchedElement'))

        WebUI.verifyEqual(mAir, '"Macbook Air"')

        WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com  Macbook Pro/btn_homePageLogo'))
    } else {
        WebUI.sendKeys(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/input_searchBar'), 'Kindle')

        WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/input_searchBarButton'))

        kindle = WebUI.getText(findTestObject('AmazonKeywordDriven/Page_Amazon.com  Macbook Pro/txt_SearchedElement'))

        WebUI.verifyEqual(kindle, '"Kindle"')

        WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com  Macbook Pro/btn_homePageLogo'))
    }
}

WebUI.mouseOver(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/mouse_overTab'))

WebUI.click(findTestObject('AmazonKeywordDriven/Page_Amazon.com. Spend less. Smile more/btn_Sign Out'))

WebUI.closeBrowser()

