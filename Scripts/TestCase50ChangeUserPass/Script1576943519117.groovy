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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cs300testautomatic.herokuapp.com/')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (38)'), 'dhieu@apcs.vn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (38)'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Mattermost/span_Sign in (8)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/button_hieu_style--none sidebar-header-drop_de94de'))

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/button_Account Settings (1)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/button_Security'))

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/button_Edit (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/input_Current Password_currentPassword'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/input_New Password_newPassword'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/input_Retype New Password_confirmPassword'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/button_Save (1)'))

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/button_Close (1)'))

WebUI.closeBrowser()

