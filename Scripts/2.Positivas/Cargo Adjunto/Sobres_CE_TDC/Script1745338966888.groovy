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

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('positivas/TipoEnvio/span_mercancia peligrosa_slider round'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'bagua direccion prueba')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'fghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Completa los datos de la persona que _27237c'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_Ejemplo_slider round'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'pachacamac')

WebUI.click(findTestObject('positivas/CargoAdjunto/div_LIMA - LIMA - PACHACAMAC'))

WebUI.setText(findTestObject('positivas/CargoAdjunto/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 'pachacamac')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'cfghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/CargoAdjunto/input_Quiero retorno de cargo_ng-untouched _2aabc8'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2_3_4_5'))

WebUI.callTestCase(findTestCase('1.PrincipalRE/PagoTDC'), [:], FailureHandling.STOP_ON_FAILURE)

