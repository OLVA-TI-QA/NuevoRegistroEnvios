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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Negativos/camposVacios/small_trminos de uso y politica de privacidad'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_trminos de uso y politica de privacidad'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE DESTINODESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.switchToWindowTitle('Registro de Envíos')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_mercancias peligrosas'))

WebUI.switchToWindowTitle('Registro de Envíos')

WebUI.verifyElementClickable(findTestObject('Object Repository/Negativos/camposVacios/small_mercancias peligrosas'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Negativos/camposVacios/small_la declaracin jurada y declaro bajo j_b2ed59'))

WebUI.switchToWindowTitle('Registro de Envíos')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_la declaracin jurada y declaro bajo j_b2ed59'))

WebUI.switchToWindowTitle('Registro de Envíos')

