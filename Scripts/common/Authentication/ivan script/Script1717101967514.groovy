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
try {
	WebUI.authenticate('http://crm-dev1.objectway.it/OFSCRMWealthQA/main.aspx#717330153', 'crm.test1', 'Welcome1!', 30)
}
catch (Exception) {
	//do nothing
}
 
 
def locatorSearchField = findTestObject('Page_Dashboards Customer Service Representa_7a7d3c/span_Dashboards_navImageFlipHorizontal')
WebUI.waitForElementPresent(locatorSearchField, 60) //1 minute for login
WebUI.click(locatorSearchField)
 
//WebUI.setText(findTestObject('Page_Dashboards Customer Service Representa_7a7d3c/input_Search Dynamics 365 data_search'), '004655')
 
WebUI.click(findTestObject('Page_Dashboards Customer Service Representa_7a7d3c/img_Search Dynamics 365 data_findCriteriaImg'))
