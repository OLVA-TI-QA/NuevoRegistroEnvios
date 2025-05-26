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

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '71735711')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputNombreCliente'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Negativos/validaciones_casos/input_NOMBRE(S)_inputApellidoPaternoCliente'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_APELLIDO MATERNO_inputCelularClienteCrear'), 
    '987654321')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/TipoEnvio/div_prevnext'), 0)

WebUI.delay(2)

WebUI.executeJavaScript('document.elementFromPoint(50, 50).click();', null)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/h1_Qu deseas realizar hoy'), 
    '¿Qué deseas realizar hoy?')

WebUI.verifyElementText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/h2_SI LLEGA A TUS MANOS ES, OLVA'), 
    'SI LLEGA A TUS MANOS ES, OLVA')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_OLVA_cdk-overlay-backdrop cdk-overlay-d_db73cd'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '717357111')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '007680278')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputNombreCliente'), 
    'damon')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_APELLIDO PATERNO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NOMBRE(S)_inputApellidoPaternoCliente'), 
    'salvatore')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_APELLIDO PATERNO_inputApellidoMaternoCliente'), 
    'qaqa')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_APELLIDO MATERNO_inputCelularClienteCrear'), 
    '987654321')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputEmailClienteCrear'), 'meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_GUARDAR'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputNombreCompletoCliente'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

