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

WebUI.callTestCase(findTestCase('1.PrincipalRE/1.Principal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/img_CONTINUAR_btn-icon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/span_Seleccionar tipo de comprobante'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_FACTURA'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_FACTURA_inputNroDocumentoCliente'), '20100093831')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_FACTURA_inputNroDocumentoClienteCrear'), '20607518450')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_CELULAR_inputEmailClienteCrear'), '987654321')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_EMAIL_inputCelularClienteCrear2'), '')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/input_EMAIL_inputCelularClienteCrear2'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_CELULAR_inputEmailClienteCrear'), 'meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_EMAIL_inputCelularClienteCrear2'), '987654321')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_GUARDAR'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/h6_Tipo de Servicio'), 0)

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

