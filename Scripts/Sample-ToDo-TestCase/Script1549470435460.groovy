import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lambdatest.github.io/sample-todo-app/')

WebUI.click(findTestObject('Object Repository/Page_Sample page - lambdatest.com/input_LambdaTest Sample App_li'))

WebUI.click(findTestObject('Object Repository/Page_Sample page - lambdatest.com/input_First Item_li2'))

WebUI.click(findTestObject('Object Repository/Page_Sample page - lambdatest.com/input_Third Item_li4'))

WebUI.click(findTestObject('Object Repository/Page_Sample page - lambdatest.com/input_LambdaTest Sample App_li'))

WebUI.setText(findTestObject('Object Repository/Page_Sample page - lambdatest.com/input_Fifth Item_sampletodotex'), 'Welcome to LambdaTest')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sample page - lambdatest.com/input_Fifth Item_sampletodotex'), Keys.chord(
        Keys.ENTER))

WebUI.closeBrowser()

