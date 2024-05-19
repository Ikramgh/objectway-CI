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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('common/Authentication/Valid Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Dashboards Customer Service Representa_7a7d3c/span_Customer Service Representative Social_4caf08'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/nobr_Administration'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/button_Restart App. Pool'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/button_Recycle IIS'))

WebUI.rightClick(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/div_Middleware Application Pool has just be_66a425'))

WebUI.rightClick(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/div_Middleware Application Pool has just be_66a425'))

WebUI.rightClick(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/button_OK'))

WebUI.rightClick(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/div_concat(id(, , alertJs-image, , ))_alert_9f289a'))

WebUI.rightClick(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/div_Middleware Application Pool has just be_66a425'))

WebUI.rightClick(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/div_Middleware Application Pool has just be_66a425'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards Administration - Microsoft _57c8cb/div_Middleware Application Pool has just be_66a425'))

