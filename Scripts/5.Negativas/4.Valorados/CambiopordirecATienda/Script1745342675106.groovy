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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_FACTURA'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '20100686814')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'miraflores')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA - LIMA - MIRAFLORES'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'ghfrdews')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'comandante espinar 659')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_El artculo supera los S 1,000 y no pu_3d2db1'), 
    'El artículo supera los S/ 1,000 y no puede ser entregado en nuestras tiendas, verifica la información de tu envío o continua con la entrega a domicilio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Aceptar'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'av aviacion 3532, san borja')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_El artculo supera los S 1,000 y no pu_3d2db1'), 
    'El artículo supera los S/ 1,000 y no puede ser entregado en nuestras tiendas, verifica la información de tu envío o continua con la entrega a domicilio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Aceptar'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'as')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Faltan datos de direccin Av, Calle, urb_b8f590'), 
    'Faltan datos de dirección: Av, Calle, urb., numeración.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'asf')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '12345678')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12345')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Ejemplo 100 hojas bond  300 gramos300 h_3c7061'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_El valor es entre 1 y 10000'), 'El valor es entre 1 y 10000.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

