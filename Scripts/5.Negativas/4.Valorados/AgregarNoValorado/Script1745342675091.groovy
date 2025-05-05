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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE ORIGEN ORIGEN'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE DESTINODESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'ghj')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_Recojo en tienda no disponible'), 
    'Recojo en tienda no disponible')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_El artculo supera los S 1,000 y no pu_3d2db1'), 
    'El artículo supera los S/ 1,000 y no puede ser entregado en nuestras tiendas, verifica la información de tu envío o continua con la entrega a domicilio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/img'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_Recojo en tienda no disponible'), 
    'Recojo en tienda no disponible')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_El artculo supera los S 1,000 y no pu_3d2db1'), 
    'El artículo supera los S/ 1,000 y no puede ser entregado en nuestras tiendas, verifica la información de tu envío o continua con la entrega a domicilio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Editar envo'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.rightClick(findTestObject('Object Repository/Negativos/camposVacios/small_Recojo en tienda no disponible'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/small_El artculo supera los S 1,000 y no pu_3d2db1'), 
    'El artículo supera los S/ 1,000 y no puede ser entregado en nuestras tiendas, verifica la información de tu envío o continua con la entrega a domicilio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'bagua vañlorado cargo')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'fghj')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '12345678')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'ate')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA - LIMA - ATE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_SELECCIONE TIENDA ATE - AV JAVIER PR_1a42df'), 
    '752', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AGREGAR ENVO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _3df7a4'), 
    '12345678900')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NMERO DOCUMENTO_inputCelularConsignadoComp'), 
    '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE DESTINODESTINO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'lince')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 123')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '396', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghjk')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Lunes - Viernes 0800 - 1800'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_OLVA LINCE - AV. ARENALES 1775LINCE - A_ffc3ea'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_PRUEBA SAC'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

