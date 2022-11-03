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

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss (4)'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account (4)'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username (4)'), 'rizkimaulanaazis12@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password (4)'), 'T7SzEdEZxWeUYeZbjPMaQA==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__rememberme (4)'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in (4)'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Search (2)'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s (2)'), 
    'black cross back maxi dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionBeigeBlack (3)'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionLargeMediumSmall (3)'), 
    'large', false)

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/button_Add to cart (3)'))

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/a_Search (3)'))

WebUI.setText(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/input_Type and Press Enter to Search_s (3)'), 
    'tokyo talkie')

WebUI.sendKeys(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/input_Type and Press Enter to Search_s (3)'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/select_Choose an optionRedWhiteBlack (3)'), 
    'Black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/select_Choose an optionLMS (3)'), 
    'L', false)

WebUI.click(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/button_Add to cart (3)'))

WebUI.click(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/a_Checkout (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name (1)'), 'rizki')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/div_First nameLast nameCompany name(optiona_e2ddd9'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name (1)'), 'maulana')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/div_Have a coupon Click here to enter your _1b3726'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company (1)'), 
    'juaracoding')

WebUI.click(findTestObject('Page_Checkout  ToolsQA Demo Site/span_India', [('variable') : 'Indonesia']))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/div_Have a coupon Click here to enter your _1b3726'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1 (1)'), 'jl. maju mapan ')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city (1)'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_DKI Jakarta'))

WebUI.click(findTestObject('Page_Checkout  ToolsQA Demo Site/div_Have a coupon Click here to enter your _1b3726'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode (1)'), '16150')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/p_Phone'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone (1)'), '081222222222')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/main_Have a coupon Click here to enter your_c6f6e5'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'rizkimaulanaazis12@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/textarea_(optional)_order_comments (1)'), 
    'tolong konfirmasi jika sudah sampai, terimakasih.')

WebUI.scrollToPosition(100, 0)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms (1)'))

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order (1)'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.closeBrowser()

