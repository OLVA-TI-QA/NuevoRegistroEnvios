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

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'bagua direccion prueba')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'fghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Completa los datos de la persona que _27237c'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_Ejemplo_slider round'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'ate')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA - LIMA - ATE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_SELECCIONE TIENDA ATE - AV JAVIER PR_1a42df'), 
    '598', true)

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'LIMA - LIMA - miraflores')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA - LIMA - MIRAFLORES'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_SELECCIONE TIENDA MIRAFLORES - MC DE_2f4017'), 
    '145', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'san miguel')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA - LIMA - SAN MIGUEL'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'san miguel')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'LIMA - LIMA - barranco')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA - LIMA - BARRANCO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'barranco ')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/CargoAdjunto/input_Quiero retorno de cargo_ng-untouched _2aabc8'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/td_KATY RIOS ALEJOS'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2_3_4_5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/CargoAdjunto/input_Quiero retorno de cargo_ng-untouched _2aabc8'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_EDITAR'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'breña ')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'fghjdfghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_EDITAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2_3_4_5'))

WebUI.callTestCase(findTestCase('1.PrincipalRE/PagoTDC'), [:], FailureHandling.STOP_ON_FAILURE)

