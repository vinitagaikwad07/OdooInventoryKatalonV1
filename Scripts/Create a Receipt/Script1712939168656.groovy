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

WebUI.navigateToUrl('https://freelance25.odoo.com/web/login?redirect=%2Fodoo%2Finventory%3Fcids%3D1')

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Receipt_HM/Page_Odoo/input_Email_login'))

WebUI.setText(findTestObject('Object Repository/Create Receipt_HM/Page_Odoo/input_Email_login'), Email)

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Receipt_HM/Page_Odoo/input_Password_password'))

WebUI.setText(findTestObject('Object Repository/Create Receipt_HM/Page_Odoo/input_Password_password'), Password)

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_Odoo/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_Odoo/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_Inventory Adjustments/span_Inventory'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_Inventory Adjustments/span_Inventory'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_/div_Inventory'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_/div_Inventory'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_Inventory Overview/span_Receipts'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_Inventory Overview/span_Receipts'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_Main Warehouse Receipts/button_New'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_Main Warehouse Receipts/button_New'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_/input_Receive From_partner_id_0'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_/a_Hari Manikandan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_/a_Add a line'))

WebUI.click(findTestObject('Create Receipt_HM/Page_/input_Demand_o-autocomplete--input o_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Receipt_HM/Page_/a_8K Monitor'))

WebUI.setText(findTestObject('Create Receipt_HM/Page_/input_Demand_o_input'), '500')

WebUI.verifyElementClickable(findTestObject('Object Repository/Create Receipt_HM/Page_/span_Validate'))

WebUI.click(findTestObject('Object Repository/Create Receipt_HM/Page_/span_Validate'))

