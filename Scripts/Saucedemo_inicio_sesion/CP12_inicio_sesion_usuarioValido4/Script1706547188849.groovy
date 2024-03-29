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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.cargaTiempoPag)

WebUI.setText(findTestObject('Saucedemo_inicio_sesion/CP10_inicio_sesion_usuarioValido2/Page_Swag Labs/input_Swag Labs_user-name'), 
    'error_user')

WebUI.setEncryptedText(findTestObject('Saucedemo_inicio_sesion/CP10_inicio_sesion_usuarioValido2/Page_Swag Labs/input_Swag Labs_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.waitForElementClickable(findTestObject('Saucedemo_inicio_sesion/CP10_inicio_sesion_usuarioValido2/Page_Swag Labs/input_Swag Labs_login-button'), 
    GlobalVariable.cargaTiempoClick)

WebUI.click(findTestObject('Saucedemo_inicio_sesion/CP10_inicio_sesion_usuarioValido2/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.delay(GlobalVariable.tiempoEspera)

WebUI.takeScreenshot('C:\\Git_Eco_Certificacion\\CertificacionKatalon\\CertificacionKatalon\\Saucedemo_imagenes\\CP12_inicio_sesion_usuarioValido4.png')

WebUI.closeBrowser()

