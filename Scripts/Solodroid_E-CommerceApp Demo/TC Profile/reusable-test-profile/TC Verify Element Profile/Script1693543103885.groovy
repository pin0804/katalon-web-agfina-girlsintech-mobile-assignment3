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

Mobile.verifyElementVisible(findTestObject('General/btn_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_Your Name'), 0)

extractedYourName = Mobile.getText(findTestObject('Profile/txt_Your Name'), 0)

println(extractedYourName)

Mobile.verifyElementVisible(findTestObject('Profile/txt_ your.emailgmail.com'), 0)

extractedYourGmail = Mobile.getText(findTestObject('Profile/txt_ your.emailgmail.com'), 0)

println(extractedYourGmail)

Mobile.verifyElementVisible(findTestObject('Profile/txt_phonenumber'), 0)

extractedYourNumber = Mobile.getText(findTestObject('Profile/txt_phonenumber'), 0)

println(extractedYourNumber)

Mobile.verifyElementVisible(findTestObject('Profile/txt_Your Address'), 0)

extractedYourAdd = Mobile.getText(findTestObject('Profile/txt_Your Address'), 0)

println(extractedYourAdd)

Mobile.verifyElementVisible(findTestObject('Profile/btn _Order History'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Rate Us'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Share'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_Privacy Policy'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_EDIT'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_cart'), 0)

