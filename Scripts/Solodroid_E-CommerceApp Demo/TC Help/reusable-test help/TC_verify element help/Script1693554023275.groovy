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

Mobile.verifyElementVisible(findTestObject('Recent/title - E-Commerce Android App'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_cart'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_search'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/img_product'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/txt_product'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/txt_price'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_help'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_profile'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_recent'), 0)

Mobile.verifyElementVisible(findTestObject('General/btn_category'), 0)

