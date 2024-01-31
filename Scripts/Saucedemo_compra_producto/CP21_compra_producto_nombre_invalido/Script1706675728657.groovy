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

WebUI.setText(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_user-name'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_login-button'))

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/a_1'))

WebUI.waitForElementClickable(findTestObject('Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/button_Checkout'), 
    GlobalVariable.cargaTiempoClick)

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_firstName'))

WebUI.setText(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_firstName'), 
    '@1245')

WebUI.setText(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_lastName'), 
    'Perez')

WebUI.setText(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_postalCode'), 
    '1245')

WebUI.delay(GlobalVariable.tiempoEspera)

WebUI.scrollToElement(findTestObject('Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_continue'), 
    4)

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Object Repository/Saucedemo_compra_producto/CP15_compra_producto_datos_validos/Page_Swag Labs/button_Finish'))

WebUI.closeBrowser()

