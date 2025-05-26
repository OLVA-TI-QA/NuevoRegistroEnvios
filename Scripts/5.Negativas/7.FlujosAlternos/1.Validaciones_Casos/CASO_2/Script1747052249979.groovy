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

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_FACTURA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '12345678909')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '12345678909')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputRazonSocialCliente'), 
    'prueba ruc no existe')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'dfghj@gmail.com')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_EMAIL_inputCelularClienteCrear2'), '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/h2_Contribuyente no ACTIVO'), 'Contribuyente no ACTIVO')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '20613142038')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_RAZN SOCIAL'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputRazonSocialCliente'), 
    'fghjk')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'fghjk@gmail.com')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_EMAIL_inputCelularClienteCrear2'), '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/h2_Contribuyente no ACTIVO'), 'Contribuyente no ACTIVO')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '20606669535')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputRazonSocialCliente'), 
    '3C GLOBAL MULTISERVICIOS E.I.R.L.ghjk')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'fghjk@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_EMAIL_inputCelularClienteCrear2'), '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_SUSPENSION TEMPORAL'), 'SUSPENSION TEMPORAL')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '20606431946')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '20609537192')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'dfghjqgmail.com')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_EMAIL_inputCelularClienteCrear2'), '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/input_EMAIL_inputCelularClienteCrear2'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'dfghjq@gmail.com')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_EMAIL_inputCelularClienteCrear2'), '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_BAJA PROV. POR OFICI'), 'BAJA PROV. POR OFICI')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

