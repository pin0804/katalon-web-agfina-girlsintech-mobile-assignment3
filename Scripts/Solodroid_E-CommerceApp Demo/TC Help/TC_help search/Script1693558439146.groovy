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

Mobile.tap(findTestObject('General/btn_help'), 0)

Mobile.waitForElementPresent(findTestObject('Help/title - Help'), 0)

WebUI.callTestCase(findTestCase('Solodroid_E-CommerceApp Demo/TC Help/reusable-test help/TC_verify element help'), [:], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Help/title - Help'), 0)

Mobile.tap(findTestObject('General/btn_search'), 0)

Mobile.setText(findTestObject('Help/EditText - Search'), searchvar, 0)

Mobile.tap(findTestObject('Help/btn_delete'), 0)

Mobile.setText(findTestObject('Help/EditText - Search'), searchvar, 0)

Mobile.tap(findTestObject('Help/btn_list'), 0)

Mobile.waitForElementPresent(findTestObject('Help/Payment/title - Payment'), 0)

Mobile.pressBack()

WebUI.callTestCase(findTestCase('Solodroid_E-CommerceApp Demo/reusable-test/Close App'), [:], FailureHandling.STOP_ON_FAILURE)

