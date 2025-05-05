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

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOs')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_Cancelar'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_FACTURA_inputNroDocumentoCliente'), '71735768')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Escriba su primer apellido igual al d_19137b'), 
    'SARAVIa')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'san isidro')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/div_LIMA - LIMA - SAN ISIDRO'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_SOBRE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '396', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'prueba')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/small_mercancias peligrosas'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/CargoAdjunto/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '898', true)

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.setText(findTestObject('Object Repository/positivas/CargoAdjunto/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghj')

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/positivas/CargoAdjunto/button_CONTINUAR_1_2'))

