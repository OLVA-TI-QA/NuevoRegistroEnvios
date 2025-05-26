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

WebUI.callTestCase(findTestCase('1.PrincipalRE/3.Principal-Lista'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_NESTADORECIBETIPO DE ENTREGADESTINO'), 
    0)

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_INICIO'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/span_OLVA_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'))

WebUI.setText(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '72640507')

WebUI.setText(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_Escriba su primer apellido igual al d_19137b'), 
    'BENITES')

WebUI.sendKeys(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_Escriba su primer apellido igual al d_19137b'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_LIMA'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_Ingresa el destino de tu envo AMAZONAS _b1d84b'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 130')

WebUI.setText(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'audifonos')

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_BAGUA CHICABAGUA - PJ ALFONSO UGARTE NR_fb4978'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/input_Completa los datos de la persona que _27237c'), 
    '41154738')

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_Hasta 1 KgEjemRopa, bisutera, reloj,len_7246c3'))

WebUI.click(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/button_CONTINUAR_1_2_3_4_5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RedireccionAutomatica/Page_Registro de Envos/div_NESTADORECIBETIPO DE ENTREGADESTINO1 SA_e13064'), 
    0)

