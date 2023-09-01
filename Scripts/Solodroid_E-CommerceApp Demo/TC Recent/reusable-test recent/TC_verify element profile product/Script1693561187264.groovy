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

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/btn_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/btn_share'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/img_profile-product'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/txt_layout'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/txt_title product'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/txt_price'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/txt_stock'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/txt_desc'), 0)

Mobile.verifyElementVisible(findTestObject('Recent/Profile Product/btn_add to cart'), 0)

