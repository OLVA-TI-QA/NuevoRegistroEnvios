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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web-registro-envios.olvacourier.com/')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/img_Qu deseas realizar hoy_img-fluid dimens_972478'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  CE'), '3', 
    true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_FACTURA'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_FACTURA_inputNroDocumentoCliente'), '20100686814')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/img_CONTINUAR_btn-icon'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/small_INGRESE ORIGEN'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'BAGUA')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/img_CONTINUAR_btn-icon'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_SOBRE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE ARTCULO  DOCUMENTOS'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE ARTCULO  DOCUMENTOS'), '396', 
    true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'GHJ')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_Abierto'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/img_CONTINUAR_btn-icon'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Completa los datos de la persona que _27237c'), 
    '002691903')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'ATE')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - ATE'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_INGRESE EL DESTINO DEL CARGOSELECCIONE _abe465'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'LINCE')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_Retorno de CargoCantidad de Folios  FOL_6b76c7'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'BARRANCO')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - BARRANCO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_SELECCIONE TIENDA BARRANCO - Jirn Ju_526d73'), 
    '599', true)

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'LIMA - LIMA -')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - ATE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_SELECCIONE TIENDA ATE - AV JAVIER PR_1a42df'), 
    '510', true)

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'LIMA - LIMA - LINCE')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - LINCE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_SELECCIONE TIENDA LINCE - AV GENERAL_0efa9b'), 
    '33', true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_DIRECCIN EXACTA'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/EscribirDestino'), 'LINCE 1')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'ATE')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - ATE_1'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/EscribirDestino'), 'SAN BORJA 123')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_Retorno de CargoCantidad de Folios  FOL_6b76c7_1'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/small_ENTREGA  A DOMICILIO'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'ATE')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_LIMA - LIMA - ATE_1'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/label_DIRECCIN EXACTA'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/EscribirDestino'), 'SAN ISIDRO')

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'DFG')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/TipoEnvio/input_Quiero retorno de cargo_ng-untouched _2aabc8'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/img_CONTINUAR_btn-icon'))

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Crear una clave de 4 dgitos para reco_4d1f4d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Crear una clave de 4 dgitos para reco_e7fe6c'), 
    '2')

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Crear una clave de 4 dgitos para reco_b967b3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/positivas/TipoEnvio/input_Crear una clave de 4 dgitos para reco_6cbaf2'), 
    '4')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_Tarjeta de crditodbito,'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/div_Tarjeta de crditodbito,billeteras electrnicas'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_IR A PAGAR'))

