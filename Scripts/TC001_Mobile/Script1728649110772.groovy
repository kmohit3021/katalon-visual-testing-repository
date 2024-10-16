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

Mobile.startApplication('/Users/mohit/Documents/APK/APIDemos.apk', true)

Mobile.tap(findTestObject('OR Mobile/android.widget.Button - Continue-Choose what to allow'), 50, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/OR Mobile/android.widget.Button - OK'), 50, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/OR Mobile/android.widget.TextView - OK'), 50)

Mobile.takeScreenshotAsCheckpoint('OKButton Page', [])

WebUI.acceptAlert()

Mobile.tap(findTestObject('Object Repository/OR Mobile/android.widget.TextView - API Demos'), 50)

Mobile.takeScreenshotAsCheckpoint('APIDemos Page', [])

Mobile.tap(findTestObject('Object Repository/OR Mobile/android.widget.TextView - App'), 50)

Mobile.takeScreenshotAsCheckpoint('AppPage', [])

Mobile.tap(findTestObject('Object Repository/OR Mobile/android.widget.TextView - Activity'), 50)

Mobile.takeScreenshotAsCheckpoint('ActivityPage', [])

Mobile.closeApplication()

