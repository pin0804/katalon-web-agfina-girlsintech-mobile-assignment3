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

WebUI.callTestCase(findTestCase('Solodroid_E-CommerceApp Demo/reusable-test/Launch AUT-from existing'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Recent/img_product'), 0)

Mobile.waitForElementPresent(findTestObject('Recent/txt_price'), 0)

Mobile.waitForElementPresent(findTestObject('Recent/txt_product'), 0)

Mobile.tap(findTestObject('General/btn_recent'), 0)

WebUI.callTestCase(findTestCase('Solodroid_E-CommerceApp Demo/TC Recent/reusable-test recent/TC_verify element recent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Recent/img_product'), 0)

Mobile.pressBack()

WebUI.callTestCase(findTestCase('Solodroid_E-CommerceApp Demo/reusable-test/Close App'), [:], FailureHandling.STOP_ON_FAILURE)

