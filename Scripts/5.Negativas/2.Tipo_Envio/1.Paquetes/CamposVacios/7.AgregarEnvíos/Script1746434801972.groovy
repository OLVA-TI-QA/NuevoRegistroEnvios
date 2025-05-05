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
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Cancelar'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOs')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Aceptar'))

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE DESTINODESTINO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'san borja')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA - LIMA - SAN BORJA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'hgfd')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_OLVA SAN BORJA - AV. AVIACION 3532SAN B_7ce636'))

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_APELLIDO MATERNO_inputCelularConsignado'), 
    '987654321')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'lince')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA - LIMA - LINCE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_SELECCIONE TIENDA LINCE - AV GENERAL_0efa9b'), 
    '33', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/camposVacios/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    0)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_DANI MARIO TORRES'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_EDITAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_ENTREGA  A DOMICILIO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'lince direccion prueba')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Editar envo'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_EDITAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Aceptar_1'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_38a46f'), 
    'bellas artes 122')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_DIRECCIN EXACTA_inputReferenciaDestinoComp'), 
    'fghjk')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_DANI MARIO TORRES'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_VOLVER_1'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AGREGAR ENVO'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Selecciona un tipo de documento'), 
    'Selecciona un tipo de documento.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione el destino'), 'Seleccione el Destino.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _3df7a4'), 
    '71735717')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_ORIGEN'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NMERO DOCUMENTO_inputCelularConsignadoComp'), 
    '987654321')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_CELULAR_inputNombreConsignadoComp'), 'prueba')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_APELLIDO PATERNO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NOMBRE(S)_inputApePatConsignadoComp'), 'calidad')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_APELLIDO MATERNO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_APELLIDO PATERNO_inputApeMatConsignadoComp'), 
    'qaqa')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_INGRESE DESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/span_Seleccione tipo de envo'), 'Seleccione tipo de envío')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Selecciona un articulo'), 'Selecciona un articulo.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_El valor es entre 1 y 10000'), 'El valor es entre 1 y 10000.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '321', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '321', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '321', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12345')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_ESPECIFICAR ARTCULO'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_El valor es entre 1 y 10000'), 'El valor es entre 1 y 10000.')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'dfghjk')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 123')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/camposVacios/div_Tiene que seleccionar un paquete'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghjk')

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_BAGUA CHICABAGUA - PJ ALFONSO UGARTE NR_fb4978'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_4d1f4d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_e7fe6c'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_b967b3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_6cbaf2'), 
    '4')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

