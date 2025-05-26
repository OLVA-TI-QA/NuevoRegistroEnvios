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

WebUI.navigateToUrl('https://dev-registro-envios-mat-design.olvacourier.com/')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_FACTURA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '12345678909')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/img_GUARDAR_btn-icon ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '12345678900')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoClienteCrear'), 
    '20100686814')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'LINCE')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'FGHJ')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_OLVA LINCE - AV. ARENALES 1775LINCE - A_ffc3ea'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _27237c'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'BARRANCO')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - BARRANCO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_SELECCIONE TIENDA BARRANCO - Jirn Ju_526d73'), 
    '599', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Qu estas enviandoSelecciona el tipo de _bc6239'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '321', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'FGHNJ')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Tamao del envoSelecciona el peso que me_91cbaf'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Ejem'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Hasta 1 KgEjemEjemplo Ropa, bisutera, r_6e53fb'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/div_Hasta 1 KgEjemEjemplo Ropa, bisutera, r_6e53fb'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Genera una clave y comprtela con la p_371c39'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    '4')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_CANCELARCONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/div_Seleccione un medio de pago'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.rightClick(findTestObject('Object Repository/Negativos/validaciones_casos/div_No se pudo guardar la preventaOKNoCancel'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

