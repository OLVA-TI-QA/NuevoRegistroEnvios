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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '20100686814')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_INGRESE ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '396', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'hygfd')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_BAGUA CHICABAGUA - PJ ALFONSO UGARTE NR_fb4978'))

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '12345678900')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_RAZN SOCIAL_inputCelularConsignado2'), '987654321')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione una cantidad de Folios'), 
    'Seleccione una cantidad de Folios.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione el tipo de Retorno'), 'Seleccione el tipo de Retorno.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_RECOJO EN  TIENDAAGENTE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione una oficina'), 'Seleccione una oficina.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'lince')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA - LIMA - LINCE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_SELECCIONE TIENDA LINCE - AV GENERAL_0efa9b'), 
    '33', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese el destino correctamente'), 
    'Ingrese el destino correctamente.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Cancelar'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese la clave de seguridad'), 'Ingrese la clave de seguridad.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_4d1f4d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_e7fe6c'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_b967b3'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_6cbaf2'), 
    '5')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione un medio de pago'), 'Seleccione un medio de pago.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_PRUEBA SAC'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '0', true)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Selecciona un tipo de documento'), 
    'Selecciona un tipo de documento.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _3df7a4'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_HaciaAMAZONAS - BAGUA - BAGUADESTINO'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  DOCUMENTOS'), 
    '0', true)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Selecciona un articulo'), 'Selecciona un articulo.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_PAQUETE'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_El valor es entre 1 y 10000'), 'El valor es entre 1 y 10000.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Tiene que seleccionar un paquete'), 
    'Tiene que seleccionar un paquete.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '529', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'hgfd')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Ropa, bisutera, reloj,'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_lentes, etc'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Hasta 1 KgEjemEjemplo Ropa, bisutera, r_6e53fb'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione un medio de pago'), 'Seleccione un medio de pago.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

