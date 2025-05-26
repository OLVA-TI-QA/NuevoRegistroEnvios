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

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '41154738')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Escriba su primer apellido igual al d_19137b'), 
    'BESADA')

WebUI.sendKeys(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Escriba su primer apellido igual al d_19137b'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_LIMA'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_INGRESE DESTINODESTINO'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/label_Realizan el pago al recoger el envo, _e98386'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 150')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'audifonos')

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_BAGUA CHICABAGUA - PJ ALFONSO UGARTE NR_fb4978'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Completa los datos de la persona que _27237c'), 
    '72640507')

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_Ejem'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_Hasta 1 KgEjemEjemplo Ropa, bisutera, r_6e53fb'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/div_Tarjeta de crditodbito,billeteras electrnicas'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_IR A PAGAR'))

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Genera una clave y comprtela con la p_371c39'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Genera una clave y comprtela con la p_054be0'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Genera una clave y comprtela con la p_054be0_1'), 
    '3')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Genera una clave y comprtela con la p_054be0_1_2'), 
    '4')

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_Genera una clave y comprtela con la p_054be0_1_2'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/i'))

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_Continuar (1)'))

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_number'), 
    '4111 1111 1111 1111')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_expiry'), 
    '12 / 25')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_cvc'), 
    '111')

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_name'), 
    'fdfd')

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_name'))

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_lastname'), 
    'fdfd')

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_lastname'))

WebUI.setText(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/input_compras por internet_email'), 
    'fdd@gmail.com')

WebUI.click(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/button_Pagar S 15.56'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ValidarPagoDenegado/Page_Registro de Envos/img_REGISTRO DENEGADO_img-fluid'), 
    0)

WebUI.closeBrowser()

