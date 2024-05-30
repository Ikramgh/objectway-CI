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

//import com.example.customkeywords.GenerateRandomNumberAndAppendToURLKeyword as CustomKeywords
WebUI.openBrowser('')

//Sample path. Change it to your saved location of autoIT script
autoit_prj = 'authentication credentials/valid authentication.exe'

Runtime.getRuntime().exec(autoit_prj)

Thread.sleep(3000)

//Sample URL. Please change it to your authentication URL
WebUI.navigateToUrl('https://crm-dev1.objectway.it/OFSCRMWealthQA/main.aspx')

// Usage
// Generate a random number
def randomNumber = (int)(Math.random()* 1000000000)
//def randomNumber = Math.floor(Math.random() * 1000000)



// Append the random number to the base URL
def  url = 'https://crm-dev1.objectway.it/OFSCRMWealthQA/main.aspx' + "#" + randomNumber

// Redirect to the new URL using JavaScript
WebUI.executeJavaScript("window.location.href = '" + url + "'", null)
WebUI.delay(30)
WebUI.refresh()
//CustomKeywords.'GenerateRandomNumberAndAppendToURLKeyword.appendRandomNumberToURL'('https://crm-dev1.objectway.it/OFSCRMWealthQA/main.aspx')
//customKeyword.GenerateRandomNumberAndAppendToURL('https://crm-dev1.objectway.it/OFSCRMWealthQA/main.aspx')
//customKeyword.'GenerateRandomNumberAndAppendToURL.appendRandomNumberToURL'('https://crm-dev1.objectway.it/OFSCRMWealthQA/main.aspx')

WebUI.verifyElementText(findTestObject('Page_Dashboards Customer Service Representa_7a7d3c/text_Dashboards'), 'Dashboards')

