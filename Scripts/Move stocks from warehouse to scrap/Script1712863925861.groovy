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

WebUI.callTestCase(findTestCase('Login to Odoo Inventory ERP System'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_/img_Dashboards_o_app_icon rounded-3'))

WebUI.click(findTestObject('Object Repository/inventoryPage/span_Operations'))

WebUI.click(findTestObject('Object Repository/inventoryPage/a_Scrap'))

WebUI.click(findTestObject('Object Repository/newScrapOders_page/button_New'))

WebUI.click(findTestObject('Object Repository/allScrapOrders_page/input_Product_product_id_0'))

WebUI.click(findTestObject('Object Repository/allScrapOrders_page/a_8K Monitor'))

WebUI.click(findTestObject('Object Repository/allScrapOrders_page/input_Scrap Location_scrap_location_id_0'))

WebUI.click(findTestObject('Object Repository/allScrapOrders_page/a_WH1Scrap'))

WebUI.click(findTestObject('Object Repository/allScrapOrders_page/span_Validate'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SP00006/p_Scrap created'), 'Scrap created')

WebUI.click(findTestObject('Object Repository/Page_SP00006/a_Scrap Orders'))

WebUI.verifyElementText(findTestObject('Object Repository/newScrapOders_page/td_8K Monitor'), '8K Monitor')

WebUI.verifyElementText(findTestObject('Object Repository/newScrapOders_page/span_Done'), 'Done')

