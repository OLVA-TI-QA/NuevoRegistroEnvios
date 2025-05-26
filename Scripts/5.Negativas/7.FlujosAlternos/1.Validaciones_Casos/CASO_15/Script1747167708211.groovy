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

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOs')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AMAZONAS - BAGUA - CHIRIACO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fgd')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_IMAZA (IMACITA) CHIRIACOCHIRIACO - AV. _91b42d'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _27237c'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AGREGAR ENVO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _3df7a4'), 
    '12345678900')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Ingrese correctamente 9 dgitos'), 
    'Ingrese correctamente 9 dígitos.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Seleccione el destino'), 'Seleccione el Destino.')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputCelularConsignadoComp'), 
    '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE DESTINODESTINO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'san luis')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - SAN LUIS'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_El valor es entre 1 y 10000'), 
    'El valor es entre 1 y 10000.')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_SOBRE'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghj')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/circle_Aceptar_loader__mouth1'), 
    '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'la')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_CALLAO - CALLAO - VENTANILLA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE EL DESTINO DEL CARGOSELECCIONE _ae8dbf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_SELECCIONE TIENDA VENTANILLA - CA OF_5a0453'), 
    '337', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AGENTE OLVA SAN LUIS - MECADO LA LIBERT_8d5648'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_PRUEBA SAC'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _3df7a4'), 
    '12345678909')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NMERO DOCUMENTO_inputCelularConsignadoComp'), 
    '987654321')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CELULAR_inputRazonSocialConsignadoComp'), 
    'ruc prueba 12')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_ruc prueba 12'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/img_AMAZONAS - BAGUA - CHIRIACO_hover-icon'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_Eliminar envo'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Pago en banca mvil,'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Genera una clave y comprtela con la p_371c39'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    '4')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Te esperamos en nuestras tiendasagentes_1eb82f'), 
    'Te esperamos en nuestras tiendas/agentes para recepcionar tus envíos.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Te esperamos en nuestras tiendasagentes_1eb82f'), 
    'Te esperamos en nuestras tiendas/agentes para recepcionar tus envíos.')

