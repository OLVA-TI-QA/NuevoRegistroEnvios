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

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  CE'), '3', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  CE'), '1', 
    true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/TipoEnvio/div_Validacin de ApellidoEscriba su primer _044736'), 
    0)

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Escriba su primer apellido igual al d_19137b'), 
    'rios')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/small_Aceptar'))

WebUI.delay(5)

WebUI.verifyElementNotChecked(findTestObject('Object Repository/positivas/TipoEnvio/div_Direccin de origenSelecciona tu ubicaci_7e924b'), 
    0)

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/small_INGRESE ORIGEN'))

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/div_LIMA'))

WebUI.delay(5)

WebUI.setText(findTestObject('positivas/TipoEnvio/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'lince')

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/div_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('positivas/TipoEnvio/span_mercancia peligrosa_slider round'))

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_SOBRE_inputValorContenido'), '12')

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'prueba art')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/span_mercancia peligrosa_slider round'), 0)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/span_mercancia peligrosa_slider round'))

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('positivas/TipoEnvio/EscribirDestino'), 'lince arenales')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'fghj')

WebUI.click(findTestObject('positivas/TipoEnvio/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), '1', true)

WebUI.click(findTestObject('positivas/TipoEnvio/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('positivas/TipoEnvio/input_Completa los datos de la persona que _27237c'), '12345678')

WebUI.verifyElementNotChecked(findTestObject('positivas/TipoEnvio/label_APELLIDO MATERNO'), 0)

WebUI.click(findTestObject('positivas/TipoEnvio/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/div_Hasta 1 KgEjemRopa, bisutera, reloj,len_7246c3'))

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/TipoEnvio/td_LINCE'), 'LIMA - LIMA - LINCE')

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/div_Pago en en banca mvil,bancos y banca po_e36115'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/button_IR A PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_IR A PAGAR'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/TipoEnvio/div_REGISTRO EXITOSO'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/positivas/TipoEnvio/div_Te esperamos en nuestras tiendasagentes_1eb82f'), 
    'Te esperamos en nuestras tiendas/agentes para recepcionar tus envíos.')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_Descargar Rtulo'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_REGISTRAR NUEVO ENVO'))

