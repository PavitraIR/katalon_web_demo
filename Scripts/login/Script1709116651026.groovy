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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 
    'CURA Healthcare Service')

WebUI.verifyElementPresent(findTestObject('Object Repository/login/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/a_Make Appointment'), 'Make Appointment')

WebUI.verifyElementPresent(findTestObject('Object Repository/login/Page_CURA Healthcare Service/a_Make Appointment'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/login/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_Username_username'))

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_Username_username'), 
    '')

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_Password_password'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/input_Password_password'), '+dSDTEIwsBKOkC9JbPYio3m1rQNM3vIH')

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/button_Login'), 'Login')

WebUI.verifyElementClickable(findTestObject('Object Repository/login/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/login/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/p_Please login to make appointment'), 
    'Please login to make appointment.')

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_CURA Healthcare Service/p_Login failed Please ensure the username a_eb55b5'), 
    'Login failed! Please ensure the username and password are valid.')

