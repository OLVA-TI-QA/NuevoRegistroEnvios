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

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_billeteras electrnicas'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_Tarjeta de crditodbito,billeteras electrnicas'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_IR A PAGAR'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/CargoAdjunto/i'), 0)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/i'))

WebUI.scrollToElement(findTestObject('Object Repository/positivas/CargoAdjunto/i'), 0)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/i'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_Continuar (1)'))

WebUI.sendKeys(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_number'), '4474')

WebUI.sendKeys(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_number'), '1183')

WebUI.sendKeys(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_number'), '5563')

WebUI.sendKeys(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_number'), '2240')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_compras por internet_input-status'))

WebUI.sendKeys(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_expiry'), '25')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_name'), 'sujeto')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_lastname'), 'prueba')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_compras por internet_email'), 'meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_Pagar S 24.50'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/CargoAdjunto/div_Te esperamos en nuestras tiendasagentes_1eb82f'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_Descargar Rtulo'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_REGISTRAR NUEVO ENVO'))

