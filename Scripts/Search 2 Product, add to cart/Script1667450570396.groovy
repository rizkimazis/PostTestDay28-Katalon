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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss (3)'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account (3)'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username (3)'), 'rizkimaulanaazis12@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password (3)'), 'T7SzEdEZxWeUYeZbjPMaQA==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__rememberme (3)'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in (3)'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Search (1)'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s (1)'), 
    'black cross back maxi dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionBeigeBlack (2)'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionLargeMediumSmall (2)'), 
    'large', false)

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/button_Add to cart (2)'))

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/a_Search (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/input_Type and Press Enter to Search_s (2)'), 
    'tokyo talkie')

WebUI.sendKeys(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/input_Type and Press Enter to Search_s (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/select_Choose an optionRedWhiteBlack (2)'), 
    'Black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/select_Choose an optionLMS (2)'), 
    'L', false)

WebUI.click(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/button_Add to cart (2)'))

WebUI.click(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/span_Cart(2)120.00'))

WebUI.scrollToPosition(0, 500)

WebUI.delay(3)

WebUI.closeBrowser()

